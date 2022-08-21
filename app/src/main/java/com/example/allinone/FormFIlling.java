package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class FormFIlling extends AppCompatActivity {

    private EditText userName, userAge;
    private RadioGroup gender;
    private Spinner country;
    private TextView result;
    private String getGender, getCountry;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_filling);

        init();

        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int id = radioGroup.getCheckedRadioButtonId();
                if(id == R.id.male) {
                    getGender = "Male";
                }else if(id == R.id.female) {
                    getGender = "Female";
                }else {
                    getGender = "Prefer Not to say";
                }
            }
        });

        String[] arr = new String[]{"India", "USA", "Africa", "Nepal", "China"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
        country.setAdapter(adapter);

        country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                getCountry = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        Intent intent = new Intent(this, RecyclerView.class);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }

    private void init(){
        userName = findViewById(R.id.name);
        userAge = findViewById(R.id.age);
        gender = findViewById(R.id.gender);
        country = findViewById(R.id.country);
        result = findViewById(R.id.result);
        submitButton = findViewById(R.id.submitButton);
    }


}