package com.example.android.imaginarykingdom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Tracks the score for Unicorn
    int scoreUnicorn = 0;

    // Tracks the score for Minotaur
    int scoreMinotaur = 0;
    /**
     * Decrease the score for Unicorn by 1 point.
     */
    public void minusOneForUnicorn(View v) {
        scoreUnicorn = scoreUnicorn - 1;
        displayForUnicorn(scoreUnicorn);
    }

    /**
     * Increase the score for Unicorn by 1 point.
     */
    public void addOneForUnicorn(View v) {
        scoreUnicorn = scoreUnicorn + 1;
        displayForUnicorn(scoreUnicorn);
    }

    /**
     * Increase the score for Unicorn by 2 points.
     */
    public void addTwoForUnicorn(View v) {
        scoreUnicorn = scoreUnicorn + 2;
        displayForUnicorn(scoreUnicorn);
    }

    /**
     * Decrease the score for Minotaur by 1 point.
     */
    public void minusOneForMinotaur(View v) {
        scoreMinotaur = scoreMinotaur - 1;
        displayForMinotaur(scoreMinotaur);
    }

    /**
     * Increase the score for Minotaur by 1 point.
     */
    public void addTwoForMinotaur(View v) {
        scoreMinotaur = scoreMinotaur + 2;
        displayForMinotaur(scoreMinotaur);
    }

    /**
     * Increase the score for Minotaur by 2 points.
     */
    public void addOneForMinotaur(View v) {
        scoreMinotaur = scoreMinotaur + 1;
        displayForMinotaur(scoreMinotaur);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreUnicorn= 0;
        scoreMinotaur = 0;
        displayForUnicorn(scoreUnicorn);
        displayForMinotaur(scoreMinotaur);
    }

    /**
     * Displays the given score for Unicorn.
     */
    public void displayForUnicorn(int score) {
        TextView scoreView = (TextView) findViewById(R.id.unicorn_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Minotaur.
     */
    public void displayForMinotaur(int score) {
        TextView scoreView = (TextView) findViewById(R.id.minotaur_score);
        scoreView.setText(String.valueOf(score));
    }
}
