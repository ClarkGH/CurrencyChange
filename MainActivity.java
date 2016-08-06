package com.example.clarkhinchcliff.currencychange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickEvent(View view) {
        EditText dollarsPoundsText = (EditText) findViewById(R.id.dollarEditText);
        Double dollarAmount = Double.parseDouble(dollarsPoundsText.getText().toString()) ;
        Double poundAmount = (dollarAmount * 0.77);

        Toast.makeText(getApplicationContext(), "Pounded " + poundAmount.toString(), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
