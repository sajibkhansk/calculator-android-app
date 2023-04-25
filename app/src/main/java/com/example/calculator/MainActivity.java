package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    private TextView tvEquation,tvResults;
    private TextView result;
    private Button btnDel, btn9, btn8, btn7, btn6, btn5, btn4, btn3, btn2, btn1, btn0, btnDiv, btnMul, btnMin, btnSum, btnEqual, btnDot,btnDelAll, btnPrevious, btnNext;
    float x, y;
    private int count =5;
    private int dataNumber=0;
    private String c;
    boolean sum, mul, div, min;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvEquation = findViewById(R.id.tvEquation);
//        result = findViewById(R.id.result);
        btn9 = findViewById(R.id.btn9);
        tvResults=findViewById(R.id.tvResults);
        btn8 = findViewById(R.id.btn8);
        btn7 = findViewById(R.id.btn7);
        btn6 = findViewById(R.id.btn6);
        btn5 = findViewById(R.id.btn5);
        btn4 = findViewById(R.id.btn4);
        btn3 = findViewById(R.id.btn3);
        btn2 = findViewById(R.id.btn2);
        btn1 = findViewById(R.id.btn1);
        btn0 = findViewById(R.id.btn0);
        btnDelAll= findViewById(R.id.btnDelAll);
        btnSum = findViewById(R.id.btnSum);
        btnDel = findViewById(R.id.btnDel);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);
        btnMin = findViewById(R.id.btnMin);
        btnEqual = findViewById(R.id.btnEqual);
        btnDot = findViewById(R.id.btnDot);
        btnPrevious =findViewById(R.id.btnPrevious);
        btnNext=findViewById(R.id.btnNext);



        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + 9);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + 8);
                ;
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + 7);
            }
        });
        btnDelAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }else{
                    tvEquation.setText("");
                    tvResults.setText("");
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + 6);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + 5);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + 4);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + 3);
            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                String Results = tvResults.getText().toString();
                if(text==null || text.isEmpty()){
                    return;
                }
                tvEquation.setText(text.substring(0, text.length() - 1));
                tvResults.setText("");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + 2);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + 1);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + 0);
            }
        });
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + "+");
            }
        });
        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();

                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + "-");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();

                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + "/");
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();

                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + "*");
                }

            }
        );
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + ".");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = tvEquation.getText().toString();
                getResult(data);

                if (data.equals("")) {
                    Toast.makeText(MainActivity.this, "NO data found", Toast.LENGTH_SHORT).show();
                }else{
                    SharedPreferences sharedPreferences = getSharedPreferences("calculation", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    if(dataNumber==5){
                        dataNumber=0;
                    }
                    dataNumber++;

                    editor.putString("cal"+dataNumber, data);
                    editor.apply();

                }
            }

        });



        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = tvEquation.getText().toString();
                tvEquation.setText("");
                SharedPreferences sharedPreferences = getSharedPreferences("calculation", MODE_PRIVATE);

                if(count>5){
                    count=5;
                }
                if(count<1){
                    count=1;
                }
                   String value1 = sharedPreferences.getString("cal"+count, "null");


                    count--;

                tvEquation.setText(value1);
                tvResults.setText("");

            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = tvEquation.getText().toString();
                tvEquation.setText("");
                SharedPreferences sharedPreferences = getSharedPreferences("calculation", MODE_PRIVATE);

                if(count>5){
                    count=5;
                }
                if(count<1){
                    count=1;
                }
                String value1 = sharedPreferences.getString("cal"+count, "null");

                Toast.makeText(MainActivity.this, count+"", Toast.LENGTH_SHORT).show();
                count++;

                tvEquation.setText(value1);
                tvResults.setText("");
                Toast.makeText(MainActivity.this, value1, Toast.LENGTH_SHORT).show();
            }
        });
        }
        String getResult(String data){
        try{
            Context context =Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initStandardObjects();
            String finalResult= context.evaluateString(scriptable, data, "javascript", 1, null).toString();

            tvResults.setText(finalResult);
            if(tvResults.getText().toString()=="Infinity"){
                tvResults.setText("");
                Toast.makeText(this, "Undefined", Toast.LENGTH_SHORT).show();
            }
            return finalResult;

        }catch (Exception e){

            return "Err";
        }

        }
}
