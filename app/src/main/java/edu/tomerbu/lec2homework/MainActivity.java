package edu.tomerbu.lec2homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etNumber;
    Button btnNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber = findViewById(R.id.etNumber);
        btnNumber = findViewById(R.id.btnNumber);


        btnNumber.setOnClickListener((v)->{

            String num = etNumber.getText().toString();

            //convert a string to a number:
            Double aDouble = Double.valueOf(num);
        });
    }
}
