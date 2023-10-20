
package com.example.bharatintern_temperature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bharatintern_temperature.R;

public class Dashboard extends AppCompatActivity {

    EditText num;
    Button show;
    TextView kelvin;
    TextView celcius;
    TextView farenheit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        num = findViewById(R.id.numid);
        show = findViewById(R.id.showid);
        farenheit = findViewById(R.id.farenheitid);
        celcius = findViewById(R.id.celciusid);
        kelvin = findViewById(R.id.kelvinid);



        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double tempnum = Double.parseDouble(num.getText().toString());

                double kelvinresult = tempnum+273.15;
                double celciusresult = tempnum + 0;
                double farenheitresult = ((tempnum*9)/5)+32;

                farenheit.setText(String.valueOf((int) farenheitresult));
                celcius.setText(String.valueOf((int) celciusresult));
                kelvin.setText(String.valueOf((int) kelvinresult));
            }
        });
    }
}