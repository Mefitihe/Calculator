package com.omnicoders.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnDiv, btnMult, btnMod, btnPlus, btnMinus, btnDot, btnEqual, btnClear;
    TextView txtResult;
    boolean mDiv, mSub, mAdd, mMod, mMult, mDec;
    double num1 = 0.0, num2 = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //view buttons by ids

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDiv = findViewById(R.id.btnDiv);
        btnMult = findViewById(R.id.btnMult);
        btnMod = findViewById(R.id.btnMod);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnDot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnequal);
        btnClear = findViewById(R.id.btnClear);

        txtResult = findViewById(R.id.txtResult);
        listenButton();
    }

    //method to listen buttons

    private void listenButton() {


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(txtResult.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(txtResult.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(txtResult.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(txtResult.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(txtResult.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(txtResult.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(txtResult.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(txtResult.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(txtResult.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(txtResult.getText() + "9");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(txtResult.getText() + ".");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txtResult.getText().length() != 0) {
                    num1 = Float.parseFloat(txtResult.getText() + "");
                    mDiv = true;
                    mDec = false;
                    txtResult.setText(null);
                }
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtResult.getText().length() != 0) {
                    num1 = Float.parseFloat(txtResult.getText() + "");
                    mMult = true;
                    mDec = false;
                    txtResult.setText(null);
                }
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtResult.getText().length() != 0) {
                    num1 = Float.parseFloat(txtResult.getText() + "");
                    mAdd = true;
                    mDec = false;
                    txtResult.setText(null);
                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtResult.getText().length() != 0) {
                    num1 = Float.parseFloat(txtResult.getText() + "");
                    mSub = true;
                    mDec = false;
                }
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtResult.getText().length() != 0) {
                    num1 = Float.parseFloat(txtResult.getText() + "");
                    mMod = true;
                    mDec = false;
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtResult.setText("");
                num1 = 0.0;
                num2 = 0.0;
            }
        });

    }


    private void calculate() {
        if (mDiv || mMult || mSub || mMod || mAdd) {
            num2 = Float.parseFloat(txtResult.getText() + "");
            if (mAdd) {
                txtResult.setText(num1 + num2 + "");
            }

            if (mSub) {
                txtResult.setText(num1 - num2 + "");
            }
            if (mDiv) {
                txtResult.setText(num1 / num2 + "");
            }
            if (mMod) {
                txtResult.setText(num1 % num2 + "");
            }
            if (mMult) {
                txtResult.setText(num1 * num2 + "");
            }

        }

    }


}

