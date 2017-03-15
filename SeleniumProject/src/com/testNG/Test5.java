package com.testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class Test5 extends Exception
{
	void m1() throws FileNotFoundException
	{
		File file = new File("C:\\Users\\MAGUSHAI\\Desktop\\Git_Credential.txt");
		
		FileInputStream fis = new FileInputStream(file);
	}
	
	void m() throws IOException
	{
		throw new IOException();
	}
	
	void m2() throws IOException
	{
		m();
		m1();
	}
	
	void m3() throws IOException
	{
		m2();
	}
	
	
	void m4()
	{
		try {
			int i = 10/0;
			
			
		} catch (ArithmeticException e) {
			System.out.println("Exception");
		}
		
	}
	
	void m5()
	{
		m4();
	}
	
	
	public static void main(String[] args) {
		new Test5().m5();
	}
}
