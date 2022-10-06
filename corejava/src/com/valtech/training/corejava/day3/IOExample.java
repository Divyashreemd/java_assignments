package com.valtech.training.corejava.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IOExample {
	
	
	public void writeCharsToFile(String filename, String data)  throws Exception{
		File file =new File(filename);
		Writer out =new BufferedWriter( new FileWriter(file));
		out.write(data);
		out.flush();
		out.close();
		
	}
	
	public String readCharsFromFile(String filename) throws Exception{
		char [] buffer =new char[4];
		File file =new File(filename);
		//Reader in = new FileReader(file);
		Reader in = new BufferedReader(new FileReader(file));
		int i=-1;
		StringBuffer sb =new StringBuffer();
		while((i =in.read(buffer))!=-1) {
			System.out.println("Size of read="+i);
			sb.append(buffer,0,i);
		}
		in.close();
		return sb.toString();		
		
	}
	
	
	public String readFromFile(String filename) throws Exception {
		byte [] buffer =new byte[4]; 
		File file =new File(filename);
		InputStream is = new FileInputStream(file);
		int i=-1;
		StringBuffer sb =new StringBuffer();
		while((i =is.read(buffer))!=-1) {
			System.out.println("Size of read="+i);
			sb.append( new String(buffer,0,i));
		}
		is.close();
		return sb.toString();
	
		
	}
	
	public void writeToFile(String filename, String contents)  throws Exception{
		byte [] data =contents.getBytes();
		File file =new File(filename);
		OutputStream os =new FileOutputStream(file);
		os.write(data);
		os.close();   //Always should be written in finally
		
		
		
	}

	public static void main(String[] args)  throws Exception{
		IOExample ex = new IOExample();
		ex.writeToFile("hello.txt", "Hello World");
		System.out.println(ex.readFromFile("hello.txt"));
		ex.writeCharsToFile("hello.txt", "Hello How Are You");
		System.out.println(ex.readCharsFromFile("hello.txt"));
		

	}

}
