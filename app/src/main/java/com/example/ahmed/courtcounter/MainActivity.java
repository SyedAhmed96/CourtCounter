package com.example.ahmed.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


    public class MainActivity extends AppCompatActivity {
        int scoreForTeamA=0;
        int scoreForTeamB=0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        //For Team A

        public void displayForTeamA(int score){
            TextView scoreView = (TextView) findViewById(R.id.team_a_score);
            scoreView.setText(String.valueOf(score));
        }


        public void AddThreePointsTeamA(View view) {
            scoreForTeamA=scoreForTeamA+3;
            displayForTeamA(scoreForTeamA);
        }

        public void TwoPointsTeamA(View view) {
            scoreForTeamA=scoreForTeamA+2;
            displayForTeamA(scoreForTeamA);
        }


        public void FreeThrowTeamA(View view) {
            scoreForTeamA=scoreForTeamA+1;
            displayForTeamA(scoreForTeamA);
        }


        //For Team B

        public void displayForTeamB(int score){
            TextView scoreView = (TextView) findViewById(R.id.team_b_score);
            scoreView.setText(String.valueOf(score));
        }


        public void AddThreePointsTeamB(View view) {
            scoreForTeamB=scoreForTeamB+3;
            displayForTeamB(scoreForTeamB);
        }

        public void TwoPointsTeamB(View view) {
            scoreForTeamB=scoreForTeamB+2;
            displayForTeamB(scoreForTeamB);
        }


        public void FreeThrowTeamB(View view) {
            scoreForTeamB=scoreForTeamB+1;
            displayForTeamB(scoreForTeamB);
        }



        public void Reset(View view){
            scoreForTeamA=0;
            scoreForTeamB=0;

            displayForTeamA(scoreForTeamA);
            displayForTeamB(scoreForTeamB);
        }

    }





