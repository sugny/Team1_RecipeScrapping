package com.tardala.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	
	static String propFile = "./src/main/resources/config.properties";
	static Properties prop;
	
	static {
		prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(propFile);
			prop.load(fis);
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
	
	public static String setProperties(String key) {
		return prop.getProperty(key);
	}

}
