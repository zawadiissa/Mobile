package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonAdd,buttonSub,buttonDivision,buttonMul,buttonC,buttonEqual;
    EditText myEditText;
    float mValueOne, mValueTwo;
    boolean mycalculatorAddition,mSubtract, mycalculatorMultiplication,mycalculatorDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.buttonzero);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonAdd = (Button) findViewById(R.id.button_pls);
        buttonSub = (Button) findViewById(R.id.button_mns);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonMul = (Button) findViewById(R.id.buttonequal);
        buttonC = (Button) findViewById(R.id.buttonclr);
        buttonEqual = (Button) findViewById(R.id.button_mult);
        myEditText = (EditText) findViewById(R.id.edt1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEditText.setText(myEditText.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEditText.setText(myEditText.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEditText.setText(myEditText.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEditText.setText(myEditText.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEditText.setText(myEditText.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEditText.setText(myEditText.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEditText.setText(myEditText.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEditText.setText(myEditText.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEditText.setText(myEditText.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEditText.setText(myEditText.getText() + "0");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myEditText == null){
                    myEditText.setText("");
                }else{
                    mValueOne = Float.parseFloat(myEditText.getText() + "");
                    mycalculatorAddition = true;
                    myEditText.setText(null);
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(myEditText.getText() +"");
                mycalculatorMultiplication = true;
                myEditText.setText(null);
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(myEditText.getText() +"");
                mycalculatorDivision = true;
                myEditText.setText(null);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(myEditText.getText() +"");
                mSubtract = true;
                myEditText.setText(null);
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEditText.setText("");
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(myEditText.getText() + "");
                if (mycalculatorAddition == true) {
                    myEditText.setText(mValueOne + mValueTwo + "");
                    mycalculatorAddition= false;
                }
                if (mSubtract == true) {
                    myEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }
                if (mycalculatorMultiplication == true) {
                    myEditText.setText(mValueOne * mValueTwo + "");
                    mycalculatorMultiplication  = false;
                }
                if (mycalculatorDivision == true) {
                    myEditText.setText(mValueOne /mValueTwo + "");
                    mycalculatorDivision = false;
                }
            }
        });




    }
}
