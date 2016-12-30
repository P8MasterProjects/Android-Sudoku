package p8.demo.p8sokoban;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static p8.demo.p8sokoban.State.Global.levelstate;
import static p8.demo.p8sokoban.State.Global.mediaPlayer;
import static p8.demo.p8sokoban.State.Global.menu_state;

/**
 * Created by IKARUGA on 07/11/2016.
 */

public class LevelSelect extends Activity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_select);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickLevel1();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickLevel2();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickDifficulty();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickBack();
            }
        });

    }

    public void ClickLevel1(){
        levelstate = 1;
        mediaPlayer.stop();
        Intent intent = new Intent(LevelSelect.this, p8_Sokoban.class);
        startActivity(intent);
    }

    public void ClickLevel2(){

        levelstate = 2;
        mediaPlayer.stop();
        Intent intent = new Intent(LevelSelect.this, p8_Sokoban.class);
        startActivity(intent);
    }

    public void ClickDifficulty(){
        Intent intent = new Intent(LevelSelect.this, DifficultySelect.class);
        startActivity(intent);
    }

    public void ClickBack(){
        Intent intent = new Intent(LevelSelect.this, TitleScreenActivity.class);
        startActivity(intent);
    }

    protected void onPause(){
        super.onPause();
        mediaPlayer.stop();
    }
}