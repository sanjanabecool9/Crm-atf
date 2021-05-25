
package com.crm.config;

import java.util.ResourceBundle;

public class PropertyLoader {
	private static final ResourceBundle RESOURCE_BUNDLE=ResourceBundle.getBundle("configuration");//here configuration is the file name of env and browser names
    
	public static String getBrowser(){
    	return RESOURCE_BUNDLE.getString("browserType");
    }
	
	public static String getQaUrl(){
		return RESOURCE_BUNDLE.getString("qaUrl");
	}
	
	public static String getDevUrl(){
		return RESOURCE_BUNDLE.getString("devUrl");
	}
		
		public static String getUatUrl(){
			return RESOURCE_BUNDLE.getString("UatUrl");
		}
}
