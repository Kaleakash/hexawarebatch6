package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\Vishal\\Desktop\\Hexaware Online Training\\Foundation Technical Course details- Campus Connect.txt");
		FileOutputStream fos = new FileOutputStream("info.txt");
		int ch;
		while((ch=fis.read())!=-1) {			//-1 EOF 
			//System.out.println(ch);
		//	System.out.println((char)ch);
			fos.write(ch);
		}
	}

}
