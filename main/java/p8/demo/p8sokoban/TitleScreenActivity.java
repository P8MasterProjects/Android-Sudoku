package p8.demo.p8sokoban;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static java.lang.System.exit;

/**
 * Created by IKARUGA on 07/11/2016.
 */

public class TitleScreenActivity extends Activity {

    Button btnResume;
    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.titlescreen_activity);
        btn1 = (Button) findViewById(R.id.Start);
        btn2 = (Button) findViewById(R.id.HiScore);
        btn3 = (Button) findViewById(R.id.Quit);

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

    }

    public void ClickHiScore(){
        Intent intent = new Intent(TitleScreenActivity.this, ScoreActivity.class);
        startActivity(intent);
    }

    public void ClickStart(){
        Intent intent = new Intent(TitleScreenActivity.this, DifficultySelect.class);
        startActivity(intent);
    }

    public void ClickQuit(){
        exit(0);
    }

}
