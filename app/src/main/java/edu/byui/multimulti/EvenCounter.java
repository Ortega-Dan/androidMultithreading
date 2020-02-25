package edu.byui.multimulti;

import android.widget.Toast;

public class EvenCounter implements Runnable {

    public MainActivity activity;


    @Override
    public void run() {

        for (int i = 0; i <= 100; i += 2) {

            System.out.println(i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        activity.runOnUiThread(new Runnable() {
            public void run() {
                Toast.makeText(activity, "Done with Even Counting", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
