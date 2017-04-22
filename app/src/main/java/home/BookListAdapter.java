package home;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.book.R;

import java.util.ArrayList;
import java.util.List;

import model.Data;

/**
 * Created by wolfmatrix on 4/20/17.
 */

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.MyBookListViewHolderClass> {
    private Context context;
    private List<Data> dataList = new ArrayList<>();

    public BookListAdapter(Context context, List<Data> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @Override
    public MyBookListViewHolderClass onCreateViewHolder(ViewGroup parent, int viewType) {
        View bookContainer = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_book_list, parent, false);
        return new MyBookListViewHolderClass(bookContainer);
    }

    @Override
    public void onBindViewHolder(MyBookListViewHolderClass holder, int position) {
        Data data = dataList.get(position);
        holder.bookTitle.setText(data.getTitle());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MyBookListViewHolderClass extends RecyclerView.ViewHolder {
        private TextView bookTitle;
        private Typeface typeface;

        public MyBookListViewHolderClass(View itemView) {
            super(itemView);
            bookTitle = (TextView) itemView.findViewById(R.id.bookTitle);

            typeface = Typeface.createFromAsset(itemView.getContext().getAssets(), "fonts/Ubuntu-Light.ttf");
            bookTitle.setTypeface(typeface);
        }
    }
}
