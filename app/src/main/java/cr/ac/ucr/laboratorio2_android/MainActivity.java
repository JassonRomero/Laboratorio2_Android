package cr.ac.ucr.laboratorio2_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ImageView ic_country_list;
    public static  String  rutaFinal="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ic_country_list = (ImageView) findViewById(R.id.ic_country_list);


        ic_country_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CountryListActivity.class);
                //Intent intent = new Intent(getApplicationContext(), ByCountryActivity.class);
                startActivity(intent);
            }
        });

    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "Aplicación entrará en Pausa!", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getApplicationContext(), "Aplicación se reanuda!", Toast.LENGTH_LONG).show();
    }
}
