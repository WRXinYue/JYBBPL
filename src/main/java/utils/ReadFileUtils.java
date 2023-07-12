package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ReadFileUtils {
    private static final String PROJECTPATH = "org/wr/config/";

    public static String getDBProperties(String key) {
        Properties properties = null;
        InputStream inputStream = null;
        String strInfo = "";
        try {
            properties = new Properties();
            inputStream = ReadFileUtils.class.getClassLoader().getResourceAsStream( PROJECTPATH + "db.properties");
            properties.load(inputStream);
            strInfo = properties.getProperty(key);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strInfo;
    }
    public static String getMessageProperties(String filename, String key) {
        Properties properties = null;
        InputStream inputStream = null;
        String strInfo = "";
        try {
            properties = new Properties();
            inputStream = ReadFileUtils.class.getClassLoader()
                    .getResourceAsStream(PROJECTPATH + filename);
            properties.load(new InputStreamReader(inputStream, "utf-8"));
            strInfo = properties.getProperty(key);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strInfo;
    }
}
