package IO;

import java.util.List;

import adapters.CountryListAdapter;
import cr.ac.ucr.laboratorio2_android.Global;
import cr.ac.ucr.laboratorio2_android.MainActivity;
import models.ByCountry;
import models.Country;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import static cr.ac.ucr.laboratorio2_android.Global.*;
public interface CountryApiService {

    @GET("countries")
    Call<List<Country>> getCountries();

    @GET("country/{pais}/status/confirmed")
    Call<List<ByCountry>> getByCountry(@Path("pais") String pais, @Query("from") String yesterday, @Query("to") String today);
}

