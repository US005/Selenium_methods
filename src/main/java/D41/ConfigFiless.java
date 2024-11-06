package D41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFiless {

	public static void main(String[] args) throws IOException {
		
		  FileInputStream FP= new FileInputStream(System.getProperty("user.dir")+"\\Config.properties");
		  Properties propertiesobj=new Properties();
		  propertiesobj.load(FP);
          
		 String links= propertiesobj.getProperty("url");
		 String users= propertiesobj.getProperty("us");
		 String lastN= propertiesobj.getProperty("ln");
		 String usersid= propertiesobj.getProperty("id");
		 String password= propertiesobj.getProperty("pw");
		 System.out.println(links);
		 System.out.println(users);
	}

}
