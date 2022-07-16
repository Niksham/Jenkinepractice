package com.orange.configuration.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {

	public static  Properties readApplicationFile(String filepath)
	{ 
		Properties prop = null;
		try{         	 
	          prop = new Properties();
	          File f = new File(filepath);
	          if(f.exists())
	          {
		          prop.load(new FileInputStream(f));				       
		       }
			}
		catch(Exception e){  
	           System.out.println("Failed to read from application.properties file.");  
	        }
		return prop;
		} 
}
