package p8.demo.p8sokoban;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static p8.demo.p8sokoban.State.Global.final_score;
import static p8.demo.p8sokoban.State.Global.final_score2;
import static p8.demo.p8sokoban.State.Global.hi_score;
import static p8.demo.p8sokoban.State.Global.levelstate;
import static p8.demo.p8sokoban.State.Global.menu_state;
import static p8.demo.p8sokoban.State.Global.menubtn;
import static p8.demo.p8sokoban.State.Global.numScore;
import static p8.demo.p8sokoban.State.Global.winscreen;
import static p8.demo.p8sokoban.State.Global.winsoko;


// declaration de notre activity herite de Activity
public class p8_Sokoban extends Activity {


    Button click1;
    Button click2;
    Button click3;
    Button click4;
    Button click5;
    Button click6;
    Button click7;
    Button click8;
    Button click9;
    Button clickdel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // initialise notre activity avec le constructeur parent    	
        super.onCreate(savedInstanceState);
        // charge le fichier main.xml comme vue de l'activité
        setContentView(R.layout.main);
        // recuperation de la vue une voie cree à partir de son id
        SokobanView mSokobanView;
        SokobanLevel2 mSokobanLevel2;

        numScore = (TextView) findViewById(R.id.numScore);
        numScore.setText(String.valueOf(hi_score));


        click1 = (Button) findViewById(R.id.click1);
        click2 = (Button) findViewById(R.id.click2);
        click3 = (Button) findViewById(R.id.click3);
        click4 = (Button) findViewById(R.id.click4);
        click5 = (Button) findViewById(R.id.click5);
        click6 = (Button) findViewById(R.id.click6);
        click7 = (Button) findViewById(R.id.click7);
        click8 = (Button) findViewById(R.id.click8);
        click9 = (Button) findViewById(R.id.click9);
        clickdel = (Button) findViewById(R.id.clickdel);

        click1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickNumber("1");
            }
        });
        click2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickNumber("2");
            }
        });
        click3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickNumber("3");
            }
        });
        click4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickNumber("4");
            }
        });
        click5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickNumber("5");
            }
        });
        click6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickNumber("6");
            }
        });
        click7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickNumber("7");
            }
        });
        click8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickNumber("8");
            }
        });
        click9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickNumber("9");
            }
        });
        clickdel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickNumber(" ");
            }
        });

        winscreen = (Button) findViewById(R.id.winscreen);
        winscreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winscreen.setVisibility(View.INVISIBLE);
                Level1();
            }
        });

        menubtn = (Button) findViewById(R.id.menubtn);
        menubtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Menu1();
                menubtn.setVisibility(View.VISIBLE);
                startActivity(new Intent(p8_Sokoban.this, MenuActivity.class));
            }
        });

        mSokobanView = (SokobanView) findViewById(R.id.SokobanView);
        // rend visible la vue
        mSokobanView.setVisibility(View.VISIBLE);

        mSokobanLevel2 = (SokobanLevel2)findViewById(R.id.SokobanLevel2);
        mSokobanLevel2.setVisibility(View.INVISIBLE);

        if(!winsoko){
            winscreen.setVisibility(View.INVISIBLE);
        }

        if(levelstate==1){
            LevelChoose();
        }
        else if(levelstate==2){
            LevelChoose();
        }

    }

    public void ClickNumber(String str) {
    }

    public void LevelChoose(){
        SokobanView mSokobanView;
        SokobanLevel2 mSokobanLevel2;

        if(levelstate==1) {
            mSokobanView = (SokobanView) findViewById(R.id.SokobanView);
            mSokobanView.setVisibility(View.VISIBLE);

            mSokobanLevel2 = (SokobanLevel2) findViewById(R.id.SokobanLevel2);
            mSokobanLevel2.setVisibility(View.GONE);
        }
        else if(levelstate==2) {
            mSokobanView = (SokobanView) findViewById(R.id.SokobanView);
            mSokobanView.setVisibility(View.GONE);

            mSokobanLevel2 = (SokobanLevel2) findViewById(R.id.SokobanLevel2);
            mSokobanLevel2.setVisibility(View.VISIBLE);
        }
        levelstate = 0;
    }

    public void Level1(){

        SokobanView mSokobanView;
        SokobanLevel2 mSokobanLevel2;

        mSokobanView = (SokobanView) findViewById(R.id.SokobanView);
        mSokobanView.setVisibility(View.GONE);

        mSokobanLevel2 = (SokobanLevel2)findViewById(R.id.SokobanLevel2);
        mSokobanLevel2.setVisibility(View.VISIBLE);

    }

    public static void Winning1(){
        winsoko = true;
        winscreen.setVisibility(View.VISIBLE);
    }

    public static void Menu1(){
        menu_state = true;
    }


}
