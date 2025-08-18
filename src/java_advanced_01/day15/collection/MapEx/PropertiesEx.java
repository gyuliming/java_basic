package java_advanced_01.day15.collection.MapEx;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

    public static void main(String[] args) throws IOException {
        // Properties 객체 생성
        Properties properties = new Properties();
        properties.load(PropertiesEx.class.getResourceAsStream("database.properties"));

        String driver = properties.getProperty("driver");
        System.out.println(driver);
    }
}
