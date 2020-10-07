package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class basicmaths extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    float num1,num2;
    String selected;
    EditText secondNumber;
    EditText firstNumber;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicmaths);
        Spinner mySpinner=(Spinner) findViewById(R.id.operations);
        ArrayAdapter<String>myAdapter=new ArrayAdapter<>(basicmaths.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        mySpinner.setOnItemSelectedListener(this);
        firstNumber = (EditText) findViewById(R.id.firstnumber);
        secondNumber= (EditText) findViewById(R.id.secondnumber);

        submitButton = (Button) findViewById(R.id.basic);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = selected.replaceAll("\\s+", "");
                num1 = Float.valueOf(firstNumber.getText().toString());
                num2 = Float.valueOf(secondNumber.getText().toString());
                if (result.equals("+")) {
                    ((TextView) findViewById(R.id.result)).setText(String.valueOf(num1+num2));
                }
                else if (result.equals("-")){
                    ((TextView) findViewById(R.id.result)).setText(String.valueOf(num1-num2));
                }
                else if (result.equals("*")){
                    ((TextView) findViewById(R.id.result)).setText(String.valueOf(num1*num2));
                }
                else if (result.equals(":")) {
                    ((TextView) findViewById(R.id.result)).setText(String.valueOf(num1 / num2));
                }
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        selected=parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }
}