package project.click.com.clicktimproject;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Environment;

import java.io.File;

/**
 * Created by Abolfazl 7x on 3/12/2018.
 */

public class G extends Application {
    public static Typeface iransans;
    public static Context context;
    public static String SAVE_FILE_DIR = Environment.getExternalStorageDirectory().getPath() + "/" + "شهر سالم جلفا";

    @Override
    public void onCreate() {
        super.onCreate();
        this.context = getApplicationContext();
        iransans = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/IRAN Sans.ttf");
        File file = new File(SAVE_FILE_DIR);
        if (!file.exists()) {
            file.mkdirs();
        }

    }
}
