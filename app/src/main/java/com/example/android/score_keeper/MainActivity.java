package com.example.android.score_keeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int runa = 0;
    int runb = 0;
    int inningsa = 1;
    int inningsb = 1;
    int outa = 0;
    int outb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void takeruna(View view) {
        TextView textruna = (TextView)findViewById(R.id.run_teamA);
        runa += 1;
        if (inningsa == inningsb && inningsb == 9) {
            TextView whowin = (TextView)findViewById(R.id.won);
            if (runa > runb) {
                whowin.setText("TeamA WON !!");
            }
            else {
                whowin.setText("TeamB WON !!");
            }
        }
        textruna.setText(""+runa);
    }

    public void takerunb(View view) {
        TextView textrunb = (TextView)findViewById(R.id.run_teamB);
        runb += 1;
        if (inningsa == inningsb) {
            TextView whowin = (TextView)findViewById(R.id.won);
            if (runa > runb) {
                whowin.setText("TeamA WON !!");
            }
            else {
                whowin.setText("TeamB WON !!");
            }
        }
        textrunb.setText(""+runb);
    }

    public void batterouta (View view) {
        TextView textouta = (TextView)findViewById(R.id.wicket_teamA);
        TextView inning = (TextView)findViewById(R.id.innings_teamA);
        if (outa == 3) {
            if (inningsa < 9) {
                inningsa += 1;
                inning.setText(""+inningsa);
                outa = 0;
            }
            else {
                if (inningsa == inningsb) {
                    TextView whowin = (TextView)findViewById(R.id.won);
                    if (runa > runb) {
                        whowin.setText("TeamA WON !!");
                    }
                    else {
                        whowin.setText("TeamB WON !!");
                    }
                }
            }
        }
        else {
            outa += 1;
        }
        textouta.setText("" + outa);
    }
    public void batteroutb (View view) {
        TextView textoutb = (TextView)findViewById(R.id.wicket_teamB);
        TextView inning = (TextView)findViewById(R.id.innings_teamB);
        if (outb == 3) {
            if (inningsb < 9) {
                inningsb += 1;
                inning.setText(""+inningsb);
                outb = 0;
            }
            else {
                if (inningsa == inningsb) {
                    TextView whowin = (TextView)findViewById(R.id.won);
                    if (runa > runb) {
                        whowin.setText("TeamA WON !!");
                    }
                    else {
                        whowin.setText("TeamB WON !!");
                    }
                }
            }
        }
        else {
            outb += 1;
        }
        textoutb.setText("" + outb);
    }

}
