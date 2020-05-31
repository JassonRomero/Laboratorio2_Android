package adapters;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;
import cr.ac.ucr.laboratorio2_android.ByCountryActivity;
import cr.ac.ucr.laboratorio2_android.R;
import models.Country;
import retrofit2.Callback;

import androidx.recyclerview.widget.RecyclerView;

public class CountryListAdapter extends RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>  {
    private List<Country> countryList;
    private Context context;


    public CountryListAdapter(List<Country> countryList, Callback<List<Country>> context) {
        this.countryList = countryList;
        this.context = (Context) context;
    }


    /*
    Permite construir cada item en base al layout que asigne
    */
    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = inflater.inflate(R.layout.country_list_item, parent, false);
        CountryViewHolder viewHolder = new CountryViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {

        final Country country = countryList.get(position);
        holder.id.setText(country.getCountry());
        holder.itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, "El país seleccionado es: "+country.getCountry(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context.getApplicationContext(), ByCountryActivity.class);
                intent.setAction(country.getCountry());
                context.startActivity(intent);
            }
        });
    }
    /*
     Me permite conocer el tamaño de la lista en tiempo real
     */
    @Override
    public int getItemCount() {
        return countryList.size();
    }


    //View holder para lograr llenar el contenido de cada item
    public static class CountryViewHolder extends RecyclerView.ViewHolder {

        public TextView id;
        public ConstraintLayout itemLayout;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            this.id = (TextView) itemView.findViewById(R.id.tv_id);
            this.itemLayout = (ConstraintLayout) itemView.findViewById(R.id.cl_country_list_item);
        }
    }
}
