package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    **This fuction displays the score of team A
     */
    private void displayForTeamA(int score) {
        TextView text = (TextView) findViewById(R.id.teamA_score_text);
        text.setText("" + score);
    }

    /*
    **This fuction displays the score of team B
     */
    private void displayForTeamB(int score) {
        TextView text = (TextView) findViewById(R.id.teamB_score_text);
        text.setText("" + score);
    }

    /*
    **This function is called when '+6 Points' button on team A is clicked
     */
    public void addSixToTeamA(View view) {
        teamAScore += 6;
        displayForTeamA(teamAScore);
    }

    /*
    **This function is called when '+3 Points' button on team A is clicked
     */
    public void addThreeToTeamA(View view) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    /*
    **This function is called when '+2 Points' button on team A is clicked
     */
    public void addTwoToTeamA(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    /*
    **This function is called when '+1 Points' button on team A is clicked
     */
    public void addOneToTeamA(View view) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }

    /*
    **This function is called when '+6 Points' button on team B is clicked
     */
    public void addSixToTeamB(View view) {
        teamBScore += 6;
        displayForTeamB(teamBScore);
    }

    /*
    **This function is called when '+3 Points' button on team B is clicked
     */
    public void addThreeToTeamB(View view) {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    /*
    **This function is called when '+2 Points' button on team B is clicked
     */
    public void addTwoToTeamB(View view) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    /*
    **This function is called when '+1 Points' button on team B is clicked
     */
    public void addOneToTeamB(View view) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

}

