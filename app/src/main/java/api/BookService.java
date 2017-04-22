package api;

import java.util.List;

import model.BookResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by wolfmatrix on 4/20/17.
 */

public interface BookService {
    @GET("search.json?q=utf-8")
    Call<BookResponse> getBookResponse();
}
