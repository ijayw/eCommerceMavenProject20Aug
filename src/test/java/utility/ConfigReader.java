package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static String readConfig(String keytoread) {
		Properties prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(fis);
		}

		catch (IOException e) {
			System.out.println("Exception arrived while reading the config");
		}

		String value = prop.getProperty(keytoread);

		return value;

	}

	public static void main(String[] args) {
		readConfig("testsiteurl");

	}

}