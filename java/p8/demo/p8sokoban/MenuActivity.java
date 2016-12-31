package p8.demo.p8sokoban;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static p8.demo.p8sokoban.State.Global.difficultystate;
import static p8.demo.p8sokoban.State.Global.mediaPlayer;
import static p8.demo.p8sokoban.State.Global.menu_state;
import static p8.demo.p8sokoban.State.Global.menuquit;

/**
 * Created by IKARUGA on 07/11/2016.
 */

public class MenuActivity extends Activity {

    Button btnResume;
    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);
        btnResume = (Button) findViewById(R.id.Resume);
        btn1 = (Button) findViewById(R.id.HiScore);
        btn2 = (Button) findViewById(R.id.LevelSelect);
        btn3 = (Button) findViewById(R.id.Quit);

        btnResume.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickResume();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickHiScore();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickLevelSelect();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickQuit();
            }
        });

    }


    public void ClickResume(){
        //menu_state = false;
        Intent intent = new Intent(MenuActivity.this, p8_Sokoban.class);
        finish();
        startActivity(intent);
    }

    public void ClickHiScore(){
        Intent intent = new Intent(MenuActivity.this, ScoreActivity.class);
        finish();
        startActivity(intent);
    }

    public void ClickLevelSelect(){
        Intent intent = new Intent(MenuActivity.this, LevelSelect.class);
        finish();
        startActivity(intent);
    }

    public void ClickQuit(){
        menuquit=true;
        Intent intent = new Intent(MenuActivity.this, TitleScreenActivity.class);
        finish();
        startActivity(intent);
        mediaPlayer.stop();
    }

    protected void onPause(){
        super.onPause();
        mediaPlayer.stop();
    }
}
