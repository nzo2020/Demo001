package com.example.demo001;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


/**
 * Activity for displaying credits.
 * This activity shows the credits screen and allows the user to navigate back to the main activity.
 *
 * @author      Noa Zohar <nz2020@bs.amalnet.k12.il>
 * @version     1.0
 * @since       27/01/2025/
 * short description:
 *        This activity contains 5 buttons, each triggering a different type of AlertDialog.
 *        The dialogs demonstrate various features such as displaying a simple message,
 *        showing an icon, handling one or more buttons, and changing the background color.
 *
 */
public class activity_credits extends AppCompatActivity {

    /**
     * Called when the activity is first created.
     * Sets the content view to the credits screen layout.
     *
     * @param savedInst a Bundle containing the activity's previously saved state
     */
    @Override
    protected void onCreate(Bundle savedInst) {
        super.onCreate(savedInst);
        setContentView(R.layout.activity_credits);
    }

    /**
     * Creates the options menu for this activity.
     * Inflates the menu resource to display the options menu items.
     *
     * @param menu the menu in which the items should be added
     * @return true if the menu was successfully created, false otherwise
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     * Handles item selection from the options menu.
     * If the "menuMain" item is selected, the activity finishes and returns to the main activity.
     *
     * @param itm the menu item that was selected
     * @return true if the item selection was handled, false otherwise
     */
    @Override
    public boolean onOptionsItemSelected(@Nullable MenuItem itm) {
        int id = itm.getItemId();
        if (id == R.id.menuMain) {
            finish();
        }
        return true;
    }
}
