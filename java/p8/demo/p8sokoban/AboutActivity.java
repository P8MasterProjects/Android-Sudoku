package p8.demo.p8sokoban;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import static p8.demo.p8sokoban.State.Global.final_score;
import static p8.demo.p8sokoban.State.Global.final_score2;

/**
 * Created by IKARUGA on 14/11/2016.
 */

public class AboutActivity extends Activity {

    TextView Perso1;
    TextView Perso2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_activity);
        Perso1 = (TextView) findViewById(R.id.M1);
        Perso2 = (TextView) findViewById(R.id.M2);
    }
}
