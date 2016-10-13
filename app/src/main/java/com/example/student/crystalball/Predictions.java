package com.example.student.crystalball;

import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Predictions {

    private static Predictions predictions;
    private String[] answers;

    private Predictions() {
        answers = new String[] {
            "Keep it 100",
             "Just keep it 100"

    };
}

    public static Predictions get() {
        if(predictions == null) {
         predictions = new Predictions();
        }
        return predictions;
    }

    public String getPrediction() {
        return answers[0];
    }

    public void generate(View view) {
        Random rand = new Random();
        float number = rand.nextFloat()*100;
        String myString = String.valueOf(number);
        myText.setText(myString);

    }
}

