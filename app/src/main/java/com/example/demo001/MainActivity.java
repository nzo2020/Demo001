package com.example.demo001;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;


/**
 * MainActivity class handles the main interface of the application,
 * displaying various AlertDialog options for the user.
 *
 * @author Noa Zohar <nz2020@bs.amalnet.k12.il>
 * @version 1
 * @since 27/01/2025
 */
public class MainActivity extends AppCompatActivity {
    /**
     * The AlertDialog builder used to create dialog boxes.
     */
    AlertDialog.Builder dlg;

    /**
     * The LinearLayout where the background color is changed.
     */
    LinearLayout lay;

    /**
     * The Random object used to generate random numbers for colors.
     */
    Random rnd = new Random();

    /**
     * This method is called when the activity is created.
     * It sets the layout for the activity and initializes the layout view.
     *
     * @param savedInst the saved instance state
     */
    @Override
    protected void onCreate(Bundle savedInst) {
        super.onCreate(savedInst);
        setContentView(R.layout.activity_main);

        lay = findViewById(R.id.ml);
    }

    /**
     * This method creates and displays an AlertDialog with a simple message.
     *
     * @param v the view that triggers the dialog
     */
    public void showMsgOnly(View v) {
        dlg = new AlertDialog.Builder(this);
        dlg.setTitle("Simple Msg");
        dlg.setMessage("This is a simple msg dlg.");
        AlertDialog d = dlg.create();
        d.show();
    }

    /**
     * This method creates and displays an AlertDialog with a message and an icon.
     *
     * @param v the view that triggers the dialog
     */
    public void showMsgIcon(View v) {
        dlg = new AlertDialog.Builder(this);
        dlg.setTitle("Msg w/ Icon");
        dlg.setMessage("This is a msg dlg w/ an icon.");
        dlg.setIcon(R.drawable.facebook);
        AlertDialog d = dlg.create();
        d.show();
    }

    /**
     * This method creates and displays an AlertDialog with a message and a single button.
     *
     * @param v the view that triggers the dialog
     */
    public void showMsgBtn(View v) {
        dlg = new AlertDialog.Builder(this);
        dlg.setTitle("Msg w/ Btn");
        dlg.setMessage("This is a msg dlg w/ one btn.");
        dlg.setIcon(R.drawable.facebook);
        dlg.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface di, int i) {
                di.cancel();
            }
        });
        AlertDialog d = dlg.create();
        d.show();
    }

    /**
     * This method creates and displays an AlertDialog with two buttons.
     * The first button changes the background color of the layout to a random color,
     * while the second button cancels the dialog.
     *
     * @param v the view that triggers the dialog
     */
    public void showMsgTwoBtns(View v) {
        dlg = new AlertDialog.Builder(this);
        dlg.setTitle("Two Btns");
        dlg.setMessage("Choose an option:");
        dlg.setIcon(R.drawable.facebook);
        dlg.setPositiveButton("Chg BG", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface di, int i) {
                lay.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            }
        });
        dlg.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface di, int i) {
                di.cancel();
            }
        });
        AlertDialog d = dlg.create();
        d.show();
    }

    /**
     * This method creates and displays an AlertDialog with three buttons.
     * The first button changes the background color to a random color,
     * the second resets the background color to white,
     * and the third button cancels the dialog.
     *
     * @param v the view that triggers the dialog
     */
    public void showMsgThreeBtns(View v) {
        dlg = new AlertDialog.Builder(this);
        dlg.setTitle("Three Btns");
        dlg.setMessage("Choose an option:");
        dlg.setIcon(R.drawable.facebook);
        dlg.setPositiveButton("Rnd BG", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface di, int i) {
                lay.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            }
        });
        dlg.setNeutralButton("Reset BG", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface di, int i) {
                lay.setBackgroundColor(Color.WHITE);
            }
        });
        dlg.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface di, int i) {
                di.cancel();
            }
        });

        AlertDialog d = dlg.create();
        d.show();
    }

    /**
     * This method creates the options menu for the main activity.
     *
     * @param menu the menu to be inflated
     * @return true if the menu is created successfully
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     * This method checks which menu item was selected and performs the corresponding action.
     * If the "Credits" menu item is selected, it starts the Credits activity.
     *
     * @param itm the selected menu item
     * @return true if the menu item is handled successfully
     */
    @Override
    public boolean onOptionsItemSelected(@Nullable MenuItem itm) {
        int id = itm.getItemId();
        if (id == R.id.menuCredits) {
            Intent it = new Intent(this, activity_credits.class);
            startActivity(it);
        }
        return true;
    }
}
