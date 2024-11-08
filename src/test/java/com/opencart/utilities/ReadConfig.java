package com.opencart.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfig {

    

    // Make this method static so it can be called without an instance
    public static String geturl() throws IOException {
        Properties prob = new Properties();
        InputStream input = new FileInputStream("C:\\Users\\david.doggala\\eclipse-workspace\\Oct2024\\src\\test\\java\\com\\opencart\\testdata\\login.properties");
        prob.load(input);
        String url = prob.getProperty("url");
        return url;
    }

    // Instance method to get browser
    public static String getbrowser() throws IOException {
        Properties prob = new Properties();
        InputStream input = new FileInputStream("C:\\Users\\david.doggala\\eclipse-workspace\\Oct2024\\src\\test\\java\\com\\opencart\\testdata\\login.properties");
        prob.load(input);
        String browsername = prob.getProperty("browser");
        return browsername;
    }
}
