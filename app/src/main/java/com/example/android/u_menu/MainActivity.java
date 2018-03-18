package com.example.android.u_menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    e(String, String) (error) - Shows the least information
//    w(String, String) (warning)
//    i(String, String) (information)
//    d(String, String) (debug)
//    v(String, String) (verbose) - Shows the most information



    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView text1 = (TextView) findViewById(R.id.menu_item_1);
        Log.i(this.getLocalClassName(), "Menu item 1: " + text1.getText());

        // Find second menu item TextView and print the text to the logs
        TextView text2 = (TextView) findViewById(R.id.menu_item_2);
        Log.i(this.getLocalClassName(), "Menu item 2: " + text2.getText());

        // Find third menu item TextView and print the text to the logs

        TextView text3 = (TextView) findViewById(R.id.menu_item_3);
        Log.i(this.getLocalClassName(), "Menu item 3: " + text3.getText());
    }
}
