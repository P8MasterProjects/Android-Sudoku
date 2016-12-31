package p8.demo.p8sokoban.State;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by IKARUGA on 07/11/2016.
 */

public class Global {
    public static Button winscreen;
    public static Button menubtn;
    public static TextView numScore;
    public static TextView timerValue;
    public static int levelstate;
    public static int difficultystate;
    public static boolean winsoko = false;
    public static boolean menu_state = false;
    public static boolean menuquit = false;
    public static int hi_score = 0;
    public static int event_number = 0;
    public static boolean number_pressed = false;
    public static int final_score = 999;
    public static int final_score2 = 999;
    public static long milliseconds = 0L;
    public static long updatedTime = 0L;
    public static long startTime = 0L;
    public static long timeSwapBuff = 0L;
    public static Handler customHandler = new Handler();
    public static MediaPlayer mediaPlayer;

    public static Runnable updateTimerThread = new Runnable() {

        public void run() {

            milliseconds = SystemClock.uptimeMillis() - startTime;

            updatedTime = timeSwapBuff + milliseconds;

            int secs = (int) (updatedTime / 1000);
            int mins = secs / 60;
            secs = secs % 60;
            int milliseconds = (int) (updatedTime % 1000);
            timerValue.setText("" + mins + ":"
                    + String.format("%02d", secs) + ":"
                    + String.format("%03d", milliseconds));
            customHandler.postDelayed(this, 0);
        }

    };

}
