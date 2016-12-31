package p8.demo.p8sokoban;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static java.lang.System.exit;
import static p8.demo.p8sokoban.State.Global.mediaPlayer;

/**
 * Created by IKARUGA on 07/11/2016.
 */

public class TitleScreenActivity extends Activity {

    Button btnResume;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.titlescreen_activity);
        btn1 = (Button) findViewById(R.id.Start);
        btn2 = (Button) findViewById(R.id.HiScore);
        btn3 = (Button) findViewById(R.id.Quit);
        btn4 = (Button) findViewById(R.id.Purpose);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.rest_in_peace);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickStart();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickHiScore();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickQuit();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClickPurpose();
            }
        });

    }

    public void ClickHiScore(){
        Intent intent = new Intent(TitleScreenActivity.this, ScoreActivity.class);
        finish();
        startActivity(intent);
    }

    public void ClickStart(){
        Intent intent = new Intent(TitleScreenActivity.this, DifficultySelect.class);
        finish();
        startActivity(intent);
    }

    public void ClickQuit(){
        super.finish();
    }

    public void ClickPurpose(){
        Intent intent = new Intent(TitleScreenActivity.this, AboutActivity.class);
        finish();
        startActivity(intent);
    }

    protected void onResume(){
        super.onResume();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.rest_in_peace);
        mediaPlayer.start();
    }
    protected void onPause(){
        super.onPause();
        mediaPlayer.stop();
    }


}
