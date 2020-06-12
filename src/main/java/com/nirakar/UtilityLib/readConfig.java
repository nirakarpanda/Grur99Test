package com.nirakar.UtilityLib;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {
	
	Properties pro;
	
	public readConfig(){
		
		File src = new File("./Config/config.properties");
		try{
			FileInputStream  fis = new FileInputStream(src);
			pro =new Properties();
			pro.load(fis);
			
		}catch(Exception e){
			
			System.out.println("Eception is "+e.getMessage());
		}
		
	}
	
	public String getApplicationURL(){
		
		String url = pro.getProperty("baseUrl");
		return url;	
	}

	public String getuserName(){
		
		String uname =pro.getProperty("username");
		return uname;
			
	}
	
	public String getPassword(){
		
		String pass =pro.getProperty("password");
		return pass;
		
		
	}
}
