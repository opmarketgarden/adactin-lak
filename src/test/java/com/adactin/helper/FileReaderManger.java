package com.adactin.helper;

import java.io.IOException;

public class FileReaderManger {
	
	
   private void FileReaderManager() {
   }
	 
   public static FileReaderManger  getinstance() {
   FileReaderManger frm = new FileReaderManger();	
   return frm;
   }
    
   public ConfigurationReader getCrInstance() throws IOException {
   ConfigurationReader cr = new ConfigurationReader(); 	
   return cr;
   }
}
