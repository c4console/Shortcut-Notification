package rippleeffect.c4console.com.notificationonshortcut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import me.leolin.shortcutbadger.ShortcutBadger;

public class MainActivity extends AppCompatActivity {

    int flagCount=10;
    private Button btn_rmv_notification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add notification on shortcut icon
        boolean success = ShortcutBadger.applyCount(MainActivity.this, flagCount);

        // remove notification from shortcut icon
        btn_rmv_notification=(Button)findViewById(R.id.btn_rmv_notification);
        btn_rmv_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean success = ShortcutBadger.removeCount(MainActivity.this);
                Toast.makeText(getApplicationContext(), "Remove Notification.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /*
            Add build.gradle :

            repositories {
                   mavenCentral()
            }

            compile "me.leolin:ShortcutBadger:1.1.16@aar"


     */
}
