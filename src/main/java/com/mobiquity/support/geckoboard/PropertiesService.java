
package com.mobiquity.support.geckoboard;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesService {
	
	static String databaseServer;
	static String databasePort;
	static String databaseUsername;
	static String databasePassword;
	static String databaseDatabase;

    static {
    	loadProperties("common.properties");
    	loadProperties("geckoboard.properties");
    }
    
    static void loadProperties(String filename){
    	Properties properties = new Properties();
    	InputStream inputStream = null;
    	try {
    		inputStream = DBConnection.class.getClassLoader().getResourceAsStream(filename);
    		if(inputStream != null){
    			properties.load(inputStream);
       			if(properties.containsKey("databaseServer")){databaseServer = properties.getProperty("databaseServer");}
       			if(properties.containsKey("databasePort")){databasePort = properties.getProperty("databasePort");}
       			if(properties.containsKey("databaseUsername")){databaseUsername = properties.getProperty("databaseUsername");}
       			if(properties.containsKey("databasePassword")){databasePassword = properties.getProperty("databasePassword");}
       			if(properties.containsKey("databaseDatabase")){databaseDatabase = properties.getProperty("databaseDatabase");}
    		}
    	} catch (IOException e) {
    	} finally{
    		if(inputStream != null){
    			try {
    				inputStream.close();
    			} catch (IOException e) {
    			}
    		}
    	}
    }

	public static String getDatabaseServer() {
		return databaseServer;
	}

	public static void setDatabaseServer(String databaseServer) {
		PropertiesService.databaseServer = databaseServer;
	}

	public static String getDatabasePort() {
		return databasePort;
	}

	public static void setDatabasePort(String databasePort) {
		PropertiesService.databasePort = databasePort;
	}

	public static String getDatabaseUsername() {
		return databaseUsername;
	}

	public static void setDatabaseUsername(String databaseUsername) {
		PropertiesService.databaseUsername = databaseUsername;
	}

	public static String getDatabasePassword() {
		return databasePassword;
	}

	public static void setDatabasePassword(String databasePassword) {
		PropertiesService.databasePassword = databasePassword;
	}

	public static String getDatabaseDatabase() {
		return databaseDatabase;
	}

	public static void setDatabaseDatabase(String databaseDatabase) {
		PropertiesService.databaseDatabase = databaseDatabase;
	}

}
