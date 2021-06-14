package me.toby.tempcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editF;
    TextView txtCel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editF = findViewById(R.id.editF);
        txtCel = findViewById(R.id.txtCel);
    }


    public void convert(View view) {
        String inputF = editF.getText().toString();
        double f = Double.parseDouble(inputF);
        double res = calcCelcius(f);
        txtCel.setText(inputF + " Fahrenheit is " + res + " celcius");
    }


    private static double calcCelcius(double f) {
        return (f-32)*5/9;
    }
}