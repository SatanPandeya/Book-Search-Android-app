package home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.book.R;

import javax.inject.Inject;

import base.BaseFragment;
import base.ToolbarActivity;

/**
 * Created by wolfmatrix on 4/17/17.
 */

public class BookDetailFragment extends BaseFragment implements BookDetailView.View {
        @Inject
        BookDetailPresenter bookDetailPresenter;

    public static BookDetailFragment newInstance(){
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
        setupPresenter();
        setupToolbarTitle();
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
    public void onDestroy() {
        super.onDestroy();
        bookDetailPresenter.destroy();
    }
}
