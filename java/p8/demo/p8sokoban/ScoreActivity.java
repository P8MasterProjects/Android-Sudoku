package p8.demo.p8sokoban;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static p8.demo.p8sokoban.State.Global.final_score;
import static p8.demo.p8sokoban.State.Global.final_score2;

/**
 * Created by IKARUGA on 14/11/2016.
 */

public class ScoreActivity extends Activity {

    TextView HiScoreLvl1;
    TextView HiScoreLvl2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score_activity);
        HiScoreLvl1 = (TextView) findViewById(R.id.ScoreL1);
        HiScoreLvl2 = (TextView) findViewById(R.id.ScoreL2);

        HiScoreLvl1.setText(String.valueOf(final_score));
        HiScoreLvl2.setText(String.valueOf(final_score2));
    }
}
