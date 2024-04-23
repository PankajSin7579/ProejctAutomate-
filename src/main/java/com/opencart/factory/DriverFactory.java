package com.opencart.factory;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class DriverFactory  {
	
	WebDriver driver;
	
	public String screenShotTaker(String methodName) {
		
		 File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String path = System.getProperty("user.dir")+"/screenshot/"+methodName+"_"+ System.currentTimeMillis()+".png";
		 File destination = new File(path);
		 
		 try {
			 FileHandler.copy(file, destination);
		 }
		 catch (IOException e) {
			 e.printStackTrace();
			// TODO: handle exception
		}
		 return path;
	}
	
	@Test
	public void fetchKeyValues() {
		
		HashMap<String, String> hm= new HashMap<String, String>();
		
		hm.put("1", "Pankaj");
		hm.put("2", "Vinod");
		hm.put("", "adadas");
		hm.put("4", null);
		hm.put(null, null);
		hm.put("5", null);
		hm.put("", "SDSS");
		
		System.out.println(hm.keySet());
		System.out.println(hm);
		System.out.println(hm.get("1"));
		System.out.println("**********************************");
		
		Set<Object> set = new HashSet<Object>();
		set.add("Pankaj");
		set.add("Rahul");
		set.add(20);
		set.add(20);
		set.add("Pankaj");
		set.add(null);
		
		Iterator<Object> it = set.iterator();
		while(it.hasNext()) {
			Object name = it.next();
			System.out.println(name);
		}
	}
}
