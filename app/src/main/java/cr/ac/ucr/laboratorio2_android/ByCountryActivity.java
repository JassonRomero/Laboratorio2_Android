package cr.ac.ucr.laboratorio2_android;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import IO.CountryApiAdapter;
import adapters.ByCountryAdapter;
import models.ByCountry;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ByCountryActivity extends AppCompatActivity implements Callback<List<ByCountry>> {
    private List<ByCountry> byCountry = new ArrayList<>();
    private RecyclerView bycountry_recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bycountry);
        bycountry_recycler = findViewById(R.id.bycountry_recycler);
        Call<List<ByCountry>> call = CountryApiAdapter.getApiService().getByCountry(super.getIntent().getAction(), getDate1(),getDate2());

        call.enqueue(this);

    }

    @Override
    public void onResponse(Call<List<ByCountry>> call, Response<List<ByCountry>> response) {

        if(response.isSuccessful()) {
            byCountry = response.body();
            ByCountryAdapter adapter = new ByCountryAdapter(byCountry,this);
            bycountry_recycler.setLayoutManager(new LinearLayoutManager(this));
            bycountry_recycler.setAdapter(adapter);
        }
    }

    @Override
    public void onFailure(Call<List<ByCountry>> call, Throwable t) {

    }

    public String getDate1(){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd'T'");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        return formato.format(cal.getTime())+"00:00:00Z";
    }

    public String getDate2(){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd'T'");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        return formato.format(cal.getTime())+"23:59:59Z";
    }
}
