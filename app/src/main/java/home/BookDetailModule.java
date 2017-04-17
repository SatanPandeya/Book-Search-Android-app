package home;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wolfmatrix on 4/17/17.
 */
@Module
public class BookDetailModule {
    private BookDetailView.View bookDetailView;

    public BookDetailModule(BookDetailView.View bookDetailView) {
        this.bookDetailView = bookDetailView;
    }

    @Singleton
    @Provides
    public BookDetailView.View providesView(){
        return bookDetailView;
    }

    @Singleton
    @Provides
    public BookDetailView.Presenter providesPresenter(BookDetailView.View bookDetailView){
        return new BookDetailPresenter(bookDetailView);
    }

}
