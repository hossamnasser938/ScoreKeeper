package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    private int teamAScore = 0;
    private int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    **This function displays either team A score or team B score
     */
    public void displayScore(TextView view , int score){
        view.setText("" + score);
    }

    /*
    **This function is called when one a button is clicked
     */
    public void respond(View view){
        switch(view.getId())
        {
            case R.id.add1points_teamA_button :
                teamAScore += 1;
                displayScore((TextView) findViewById(R.id.teamA_score_text) , teamAScore);
                break;
            case R.id.add2points_teamA_button :
                teamAScore += 2;
                displayScore((TextView) findViewById(R.id.teamA_score_text) , teamAScore);
                break;
            case R.id.add3points_teamA_button :
                teamAScore += 3;
                displayScore((TextView) findViewById(R.id.teamA_score_text) , teamAScore);
                break;
            case R.id.add6points_teamA_button :
                teamAScore += 6;
                displayScore((TextView) findViewById(R.id.teamA_score_text) , teamAScore);
                break;
            case R.id.add1points_teamB_button :
                teamBScore += 1;
                displayScore((TextView) findViewById(R.id.teamB_score_text) , teamBScore);
                break;
            case R.id.add2points_teamB_button :
                teamBScore += 2;
                displayScore((TextView) findViewById(R.id.teamB_score_text) , teamBScore);
                break;
            case R.id.add3points_teamB_button :
                teamBScore += 3;
                displayScore((TextView) findViewById(R.id.teamB_score_text) , teamBScore);
                break;
            case R.id.add6points_teamB_button :
                teamBScore += 6;
                displayScore((TextView) findViewById(R.id.teamB_score_text) , teamBScore);
                break;
            case R.id.reset_button :
                teamAScore = 0;
                teamBScore = 0;
                displayScore((TextView) findViewById(R.id.teamA_score_text) , teamAScore);
                displayScore((TextView) findViewById(R.id.teamB_score_text) , teamBScore);
                break;
        }
    }

}

