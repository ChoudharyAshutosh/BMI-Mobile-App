package com.example.ashutosh.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import java.text.DecimalFormat;



public class MainActivity extends AppCompatActivity {
Button butt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    myButtonListenerMethod();
    }
    public void myButtonListenerMethod()
    {Button butt=(Button)findViewById(R.id.btt);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
         final EditText heightt = (EditText) findViewById(R.id.hh);
        String heights = heightt.getText().toString();
        double height = Double.parseDouble(heights);
         final EditText weightt = (EditText) findViewById(R.id.ww);
        String weights = weightt.getText().toString();
        double weight = Double.parseDouble(weights);
        double bmi = (weight)/(height*height);
                DecimalFormat df = new DecimalFormat("#.#");
                double result = Double.parseDouble(df.format(bmi));
               final  TextView resu = (TextView) findViewById(R.id.ee);

        resu.setText(Double.toString(result));
        String bm;
        if (result < 15)
            bm = "Very severely underweight";
        else if (result < 16)
            bm = "Severely underweight";
        else if (result < 18.5)
            bm = "Underweight";
        else if (result < 25)
            bm = "Normal";
        else if (result < 30)
            bm = "Overweight";
        else if (result < 35)
            bm = "Obese Class 1 - Moderately";
        else if (result < 40)
            bm = "Obese Class 2 - Severely Obese";
        else
            bm = "Obese Class 3 - Very Severely Obese";
        final TextView brrr = (TextView) findViewById(R.id.rrbm);
        brrr.setText(bm);

    }
    });

}
}
