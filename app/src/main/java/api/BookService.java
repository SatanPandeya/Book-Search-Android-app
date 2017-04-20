package api;

import model.BookResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by wolfmatrix on 4/20/17.
 */

public interface BookService {
    @GET("api/books?bibkeys=ISBN:9780980200447&jscmd=details&format=json")
    Call<BookResponse> getBookResponse();
}
