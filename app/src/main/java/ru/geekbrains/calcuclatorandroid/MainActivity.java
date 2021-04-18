package ru.geekbrains.calcuclatorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

import ru.geekbrains.calcuclatorandroid.R;

public class MainActivity extends AppCompatActivity {

    private int result = 0;
    private int var1 = 0;
    private int var2 = 0;
    private TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView(){
        resultTextView = findViewById(R.id.editText);
        Button button1 = findViewById(R.id.button1);
        buttonClickNumber(button1);
        Button button2 = findViewById(R.id.button2);
        buttonClickNumber(button2);
        Button button3 = findViewById(R.id.button3);
        buttonClickNumber(button3);
        Button button4 = findViewById(R.id.button4);
        buttonClickNumber(button4);
        Button button5 = findViewById(R.id.button5);
        buttonClickNumber(button5);
        Button button6 = findViewById(R.id.button6);
        buttonClickNumber(button6);
        Button button7 = findViewById(R.id.button6);
        buttonClickNumber(button7);
        Button button8 = findViewById(R.id.button8);
        buttonClickNumber(button8);
        Button button9 = findViewById(R.id.button9);
        buttonClickNumber(button9);
        Button button0 = findViewById(R.id.button0);
        buttonClickNumber(button0);
        buttonClickCE();
        buttonClickC();
        buttonClickAdd();
        buttonClickDiv();
        buttonClickEquals();
        buttonClickSub();
        buttonClickMul();
        buttonClickPercent();
    }

    private void setTextResultTextView(String text) {
        resultTextView.setText(resultTextView.getText() + text);
    }

    private void buttonClickNumber(Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTextResultTextView((String) button.getText());
            }
        });
    }

    private void buttonClickCE() {
        Button buttonCE = findViewById(R.id.button_CE);
        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText().subSequence(0,resultTextView.length()-1));
            }
        });
    }

    private void buttonClickC() {
        Button buttonC = findViewById(R.id.button_C);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText("");
            }
        });
    }

    private void buttonClickAdd() {
        Button buttonAdd = findViewById(R.id.button_add);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    private void buttonClickSub() {
        Button buttonSub = findViewById(R.id.button_sub);
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    private void buttonClickMul() {
        Button buttonMul = findViewById(R.id.button_mul);
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    private void buttonClickDiv() {
        Button buttonDiv = findViewById(R.id.button_div);
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    private void buttonClickPercent() {
        Button buttonPercent = findViewById(R.id.button_percent);
        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    private void buttonClickEquals() {
        Button buttonEquals = findViewById(R.id.button_equals);
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}