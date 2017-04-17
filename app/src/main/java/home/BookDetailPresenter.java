package home;

import javax.inject.Inject;

/**
 * Created by wolfmatrix on 4/17/17.
 */

public class BookDetailPresenter implements BookDetailView.Presenter {
    @Inject
    BookDetailView.View bookDetailView;

    public BookDetailPresenter(BookDetailView.View bookDetailView) {
        this.bookDetailView = bookDetailView;
    }

    @Override
    public void destroy() {
        bookDetailView = null;
    }
}
