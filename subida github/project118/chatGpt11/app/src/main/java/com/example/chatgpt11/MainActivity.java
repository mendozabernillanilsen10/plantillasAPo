package com.example.chatgpt11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView resultTextView;
    private String operand1 = "";
    private String operand2 = "";
    private String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.result_text);

        Button button0 = findViewById(R.id.button_0);
        Button button1 = findViewById(R.id.button_1);
        Button button2 = findViewById(R.id.button_2);
        Button button3 = findViewById(R.id.button_3);
        Button button4 = findViewById(R.id.button_4);
        Button button5 = findViewById(R.id.button_5);
        Button button6 = findViewById(R.id.button_6);
        Button button7 = findViewById(R.id.button_7);
        Button button8 = findViewById(R.id.button_8);
        Button button9 = findViewById(R.id.button_9);
        Button buttonPlus = findViewById(R.id.button_plus);
        Button buttonMinus = findViewById(R.id.button_minus);
        Button buttonMultiply = findViewById(R.id.button_multiply);
        Button buttonDivide = findViewById(R.id.button_divide);
        Button buttonEquals = findViewById(R.id.button_equals);
        Button buttonClear = findViewById(R.id.button_clear);
        Button buttonDot = findViewById(R.id.button_dot);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_0:
                resultTextView.append("0");
                break;
            case R.id.button_1:
                resultTextView.append("1");
                break;
            case R.id.button_2:
                resultTextView.append("2");
                break;
            case R.id.button_3:
                resultTextView.append("3");
                break;
            case R.id.button_4:
                resultTextView.append("4");
                break;
            case R.id.button_5:
                resultTextView.append("5");
                break;
            case R.id.button_6:
                resultTextView.append("6");
                break;
            case R.id.button_7:
                resultTextView.append("7");
                break;
            case R.id.button_8:
                resultTextView.append("8");
                break;
            case R.id.button_9:
                resultTextView.append("9");
                break;
            case R.id.button_dot:
                resultTextView.append(".");
                break;
            case R.id.button_plus:
                operator = "+";
                operand1 = resultTextView.getText().toString();
                resultTextView.setText("");
                break;
            case R.id.button_minus:
                operator = "-";
                operand1 = resultTextView.getText().toString();
                resultTextView.append("");
                break;
            case R.id.button_multiply:
                operator = "*";
                operand1 = resultTextView.getText().toString();
                resultTextView.setText("");
                break;
            case R.id.button_divide:
                operator = "/";
                operand1 = resultTextView.getText().toString();
                resultTextView.setText("");
                break;
            case R.id.button_equals:
                operand2 = resultTextView.getText().toString();
                float num1 = Float.parseFloat(operand1);
                float num2 = Float.parseFloat(operand2);
                float result = 0;
                if (operator.equals("+")) {
                    result = num1 + num2;
                } else if (operator.equals("-")) {
                    result = num1 - num2;
                } else if (operator.equals("*")) {
                    result = num1 * num2;
                } else if (operator.equals("/")) {
                    result = num1 / num2;
                }
                resultTextView.setText(String.valueOf(result));
                break;
            case R.id.button_clear:
                resultTextView.setText("");
                break;
            default:
                break;
        }
    }
}