package home;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.book.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import model.Details;

/**
 * Created by wolfmatrix on 4/20/17.
 */

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.MyBookListViewHolderClass> {
    private Context context;

    @Override
    public MyBookListViewHolderClass onCreateViewHolder(ViewGroup parent, int viewType) {
        View bookContainer = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_book_list, parent, false);
        return new MyBookListViewHolderClass(bookContainer);
    }

    @Override
    public void onBindViewHolder(MyBookListViewHolderClass holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyBookListViewHolderClass extends RecyclerView.ViewHolder {
        @BindView(R.id.bookCoverImageId)
        ImageView bookImage;
        @BindView(R.id.titleId)
        TextView bookTitle;
        @BindView(R.id.dividerLineId)
        View dividerLine;
        public MyBookListViewHolderClass(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
