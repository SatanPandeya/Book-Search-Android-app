package home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.book.R;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import api.BookRetroClient;
import api.BookService;
import base.BaseFragment;
import base.ToolbarActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import model.BookResponse;
import model.Details;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by wolfmatrix on 4/17/17.
 */

public class BookDetailFragment extends BaseFragment implements BookDetailView.View {
    @Inject
    BookDetailPresenter bookDetailPresenter;


    @BindView(R.id.bookDetailRecyclerViewId)
    RecyclerView bookListRecyclerView;

    public static BookDetailFragment newInstance() {
        Bundle arguments = new Bundle();
        BookDetailFragment bookDetailFragment = new BookDetailFragment();
        bookDetailFragment.setArguments(arguments);
        return bookDetailFragment;
    }

    @Override
    protected int getFragmentResourceLayout() {
        return R.layout.fragment_book_detail;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        setupPresenter();
        setupToolbarTitle();
        setupRetrofit();
    }

    @Override
    public void setupPresenter() {
        bookDetailPresenter = new BookDetailPresenter(this);
    }

    @Override
    public void setupToolbarTitle() {
        ((ToolbarActivity) getActivity()).setToolbarTitle(R.string.book);
    }

    @Override
    public void setupRetrofit() {
        BookService bookService = BookRetroClient.getBookService();
        Call<BookResponse> responseCall = bookService.getBookResponse();
        responseCall.enqueue(new Callback<BookResponse>() {
            @Override
            public void onResponse(Call<BookResponse> call, Response<BookResponse> response) {
                if (response.isSuccessful()){
                    BookResponse result = response.body();
                    if (result.getISBN9780980200447().getDetails() != null){
                        bookListRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                    }
                }
            }

            @Override
            public void onFailure(Call<BookResponse> call, Throwable t) {

            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        bookDetailPresenter.destroy();
    }
}
