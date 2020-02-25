package edu.byui.multimulti;

import android.widget.Toast;

public class OddCounter implements Runnable {

    MainActivity activity;

    @Override
    public void run() {

        for (int i = 1; i < 100; i += 2) {

            System.out.println(i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


        activity.runOnUiThread(new Runnable() {
            public void run() {
                Toast.makeText(activity, "Done with Odd Counting", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
