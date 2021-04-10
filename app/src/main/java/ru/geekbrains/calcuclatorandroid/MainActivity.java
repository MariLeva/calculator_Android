package ru.geekbrains.calcuclatorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import ru.geekbrains.calcuclatorandroid.R;

public class MainActivity extends AppCompatActivity {

    private Integer arg1;
    private Integer arg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        final EditText editText1 = findViewById(R.id.editText1);
        final EditText editText2 = findViewById(R.id.editText2);
        final TextView textView = findViewById(R.id.textView);
        Switch switch1 = findViewById(R.id.switch1);
        CheckBox checkBox = findViewById(R.id.checkBox);
        ToggleButton toggleButton = findViewById(R.id.toggleButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    arg1 = Integer.valueOf(editText1.getText().toString());
                    arg2 = Integer.valueOf(editText2.getText().toString());
                    if (arg1.equals(arg2)) {
                        textView.setText("Равно!");
                        switch1.setChecked(true);
                        checkBox.setChecked(true);
                        toggleButton.setChecked(true);
                    } else {
                        textView.setText("Не равно!");
                        switch1.setChecked(false);
                        checkBox.setChecked(false);
                        toggleButton.setChecked(false);
                    }
                } catch (NumberFormatException e) {
                    textView.setText("Введите число!");
                }
            }
        });
    }
}