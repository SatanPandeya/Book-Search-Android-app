package home;

/**
 * Created by wolfmatrix on 4/17/17.
 */

public interface BookDetailView {
    interface View{
        void setupPresenter();
        void setupToolbarTitle();
    }
    interface Presenter{
        void destroy();
    }
}
