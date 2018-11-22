package KeyValuePair;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingKeyValue {

	private Properties prop;
	private File file;
	private FileInputStream fis;
	//file.properties
	
	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		ReadingKeyValue r1 = new ReadingKeyValue();
		r1.readKeyValue();
	}
	
	public void readKeyValue() throws IOException {
	
		String path = System.getProperty(("user.dir")+"\\src\\KeyValuePair\\file.properties");
		
		System.out.println(path);
		file = new File(path);
		prop = new Properties();
		fis = new FileInputStream(file);
		prop.load(fis);
		
		System.out.println(prop.keys());
		System.out.println(prop.keySet());
	}
}
