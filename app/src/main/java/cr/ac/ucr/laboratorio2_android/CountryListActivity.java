package cr.ac.ucr.laboratorio2_android;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import IO.CountryApiAdapter;
import adapters.CountryListAdapter;
import models.Country;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class CountryListActivity extends AppCompatActivity implements Callback<List<Country>> {

    private RecyclerView countries_list_recycler;
    private List<Country> countryList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);
        countries_list_recycler = findViewById(R.id.country_recycler);
        Call<List<Country>> call = CountryApiAdapter.getApiService().getCountries();

        call.enqueue(this);

    }

    @Override
    public void onResponse(Call<List<Country>> call, Response<List<Country>> response) {
        if(response.isSuccessful()) {
            countryList = response.body();

            CountryListAdapter adapter = new CountryListAdapter(countryList,this);
            countries_list_recycler.setLayoutManager(new LinearLayoutManager(this));
            countries_list_recycler.setAdapter(adapter);
        }
    }

    @Override
    public void onFailure(Call<List<Country>> call, Throwable t) {

    }
}
