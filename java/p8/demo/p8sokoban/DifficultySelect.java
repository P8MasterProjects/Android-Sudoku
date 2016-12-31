package p8.demo.p8sokoban;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static p8.demo.p8sokoban.State.Global.difficultystate;
import static p8.demo.p8sokoban.State.Global.levelstate;
import static p8.demo.p8sokoban.State.Global.mediaPlayer;

/**
 * Created by IKARUGA on 07/11/2016.
 */

public class DifficultySelect extends Activity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.difficulty_select);
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
                ClickLevel3();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickReturn();
            }
        });
    }

    public void ClickLevel1(){
        difficultystate = 1;
        Intent intent = new Intent(DifficultySelect.this, LevelSelect.class);
        startActivity(intent);
    }

    public void ClickLevel2(){

        difficultystate = 2;
        Intent intent = new Intent(DifficultySelect.this, LevelSelect.class);
        finish();
        startActivity(intent);
    }

    public void ClickLevel3(){

        difficultystate = 3;
        Intent intent = new Intent(DifficultySelect.this, LevelSelect.class);
        finish();
        startActivity(intent);
    }

    public void ClickReturn(){
        difficultystate = 0;
        Intent intent = new Intent(DifficultySelect.this, TitleScreenActivity.class);
        finish();
        startActivity(intent);
    }

    protected void onPause(){
        super.onPause();
        mediaPlayer.stop();
    }
}