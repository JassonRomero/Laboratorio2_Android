package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cr.ac.ucr.laboratorio2_android.R;
import models.ByCountry;
import retrofit2.Callback;

public class ByCountryAdapter extends RecyclerView.Adapter<ByCountryAdapter.ByCountryViewHolder>{
    private List<ByCountry> bycountry_list;
    private Context context;



    public ByCountryAdapter(List<ByCountry> bycountry, Callback<List<ByCountry>> context) {
        this.bycountry_list = bycountry;
        this.context = (Context) context;
    }


    /*
    Permite construir cada item en base al layout que asigne
    */
    @NonNull
    @Override
    public ByCountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = inflater.inflate(R.layout.bycountry_item, parent, false);
        ByCountryViewHolder viewHolder = new ByCountryViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ByCountryViewHolder holder, int position) {
        final ByCountry country = bycountry_list.get(position);
        holder.Country.setText("Country: "+country.getCountry());
        holder.CountryCode.setText("Country Code: "+country.getCountryCode());
        holder.Province.setText("Province: "+country.getProvince());
        holder.City.setText("City: "+country.getCity());
        holder.CityCode.setText("City Code: "+country.getCityCode());
        holder.Lat.setText("Lat: "+country.getLat());
        holder.Lon.setText("Lon: "+country.getLon());
        holder.Cases.setText("Cases: "+country.getCases());
        holder.Status.setText("Status: "+country.getStatus());
        holder.Date.setText("Date: "+country.getDate());
    }

    /*
     Me permite conocer el tamaño de la lista en tiempo real
     */
    @Override
    public int getItemCount() {
        return  bycountry_list.size();
    }


    //View holder para lograr llenar el contenido de cada item
    public static class ByCountryViewHolder extends RecyclerView.ViewHolder {

        public TextView Country;
        public TextView CountryCode;
        public TextView Province;
        public TextView City;
        public TextView CityCode;
        public TextView Lat;
        public TextView Lon;
        public TextView Cases;
        public TextView Status;
        public TextView Date;
        public TextView limit;

        public ConstraintLayout itemLayout;

        public ByCountryViewHolder(@NonNull View itemView) {
            super(itemView);
            this.Country = (TextView) itemView.findViewById(R.id.tv_Country);
            this.CountryCode = (TextView) itemView.findViewById(R.id.tv_CountryCode);
            this.Province = (TextView) itemView.findViewById(R.id.tv_Province);
            this.City = (TextView) itemView.findViewById(R.id.tv_City);
            this.CityCode = (TextView) itemView.findViewById(R.id.tv_CityCode);
            this.Lat = (TextView) itemView.findViewById(R.id.tv_Lat);
            this.Lon = (TextView) itemView.findViewById(R.id.tv_Lon);
            this.Cases = (TextView) itemView.findViewById(R.id.tv_Cases);
            this.Status = (TextView) itemView.findViewById(R.id.tv_Status);
            this.Date = (TextView) itemView.findViewById(R.id.tv_Date);

            this.itemLayout = (ConstraintLayout) itemView.findViewById(R.id.cl_bycountry_item);
        }
    }
}
