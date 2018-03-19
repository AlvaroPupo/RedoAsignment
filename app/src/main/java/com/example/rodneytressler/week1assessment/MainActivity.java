package com.example.rodneytressler.week1assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private Button button;
    private Button goToNextActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.my_edit_text);
        textView = findViewById(R.id.my_text_view);
        button = findViewById(R.id.button_submit);
        goToNextActivity = findViewById(R.id.my_button);

        setListener();
    }

    private void setListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Android is fun", Toast.LENGTH_LONG).show();
                String textInput = editText.getText().toString();
                textView.setText(textInput);
                editText.setText("");
            }
        });

        goToNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAnotherActivity();
            }
        });
    }

    private void goToAnotherActivity() {
        Intent intent = new Intent(this, AlvaroLovesAndroid.class);
        startActivity(intent);
    }


}
