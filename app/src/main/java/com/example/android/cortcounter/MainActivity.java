package com.example.android.cortcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA, scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForTehamA(View view) {
        scoreTeamA += 3;
        displayAScore();
    }

    public void addTwoForTeamA(View view) {
        scoreTeamA += 2;
        displayAScore();
    }

    public void addOneForTeamA(View view) {
        scoreTeamA += 1;
        displayAScore();
    }

    public void displayAScore() {
        TextView a_score_view = (TextView) findViewById(R.id.team_a_score);
        a_score_view.setText(String.valueOf(scoreTeamA));
    }

    public void addThreeForTeamB(View view) {
        scoreTeamB +=3;
        displayBScore();
    }

    private void displayBScore() {
        TextView b_score_view = (TextView) findViewById(R.id.team_b_score);
        b_score_view.setText(String.valueOf(scoreTeamB));
    }

    public void addTwoForTeamB(View view) {
        scoreTeamB += 2;
        displayBScore();
    }

    public void addOneForTeamB(View view) {
        scoreTeamB++;
        displayBScore();
    }

    public void resetGame(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayAScore();
        displayBScore();
    }
}
