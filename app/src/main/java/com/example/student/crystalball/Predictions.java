package com.example.student.crystalball;

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
}