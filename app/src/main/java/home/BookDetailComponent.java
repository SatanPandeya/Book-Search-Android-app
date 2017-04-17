package home;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wolfmatrix on 4/17/17.
 */
@Singleton
@Component(modules = BookDetailModule.class)
public interface BookDetailComponent {
    void inject(BookDetailActivity bookDetailActivity);
}
