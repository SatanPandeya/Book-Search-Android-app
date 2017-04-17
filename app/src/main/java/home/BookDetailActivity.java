package home;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.book.R;

import base.ToolbarActivity;

/**
 * Created by wolfmatrix on 4/17/17.
 */

public class BookDetailActivity extends ToolbarActivity {
    private BookDetailFragment bookDetailFragment;
    @Override
    protected int getToolbarResourceLayout() {
        return R.layout.activity_book_detail;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        bookDetailFragment = BookDetailFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.mainContainer, bookDetailFragment)
                .commit();
        initDagger();
    }

    private void initDagger() {
        DaggerBookDetailComponent.builder().bookDetailModule(new BookDetailModule(bookDetailFragment)).build().inject(this);
    }
}
