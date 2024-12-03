package ai.kitt.snowboy;
import java.io.File;
import android.os.Environment;

public class Constants {
    public static final String ASSETS_RES_DIR = "snowboy";
    public static String DEFAULT_WORK_SPACE = Environment.getExternalStorageDirectory().getAbsolutePath() + "/snowboy/";
    public static final String ACTIVE_UMDL = "iAUTO.pmdl";
    public static final String ACTIVE_RES = "common.res";
    public static String SAVE_AUDIO = Constants.DEFAULT_WORK_SPACE + File.separatorChar + "recording.pcm";
    public static final int SAMPLE_RATE = 16000;

    public static void setPath(String path) {
        DEFAULT_WORK_SPACE = path + "/snowboy/";
        SAVE_AUDIO = Constants.DEFAULT_WORK_SPACE + File.separatorChar + "recording.pcm";
    }
}
