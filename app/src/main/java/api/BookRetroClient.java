package api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wolfmatrix on 4/20/17.
 */

public class BookRetroClient {
    private static BookService bookService;

    public static BookService getBookService(){
        Retrofit retrofitClient = new Retrofit.Builder()
                .baseUrl(HttpConstant.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        bookService = retrofitClient.create(BookService.class);
        return bookService;
    }
}
