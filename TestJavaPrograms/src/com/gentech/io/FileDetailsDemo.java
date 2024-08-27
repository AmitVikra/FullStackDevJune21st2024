package com.gentech.io;

import java.io.File;

public class FileDetailsDemo {

	public static void main(String[] args) {

		File f1=new File("D:\\Demo\\FirstFile.txt");
		//Display Name of the File
		String name=f1.getName();
		System.out.println("File Name :"+name);
		//Display File Path
		String path1=f1.getAbsolutePath();
		System.out.println("File Path :"+path1);
		//Display File Path
		File f=f1.getAbsoluteFile();
		System.out.println("File Path :"+f);
		//Verify that 'whether it is File?'
		boolean v1=f1.isFile();
		System.out.println("Is it a File ?:"+v1);
		//Verify that 'whether it is Folder?'
		boolean v2=f1.isDirectory();
		System.out.println("Is it a Folder ?:"+v2);
		//Display Parent Folder Path
		String path=f1.getParent();
		System.out.println("Parent Folder Path :"+path);
		//Verify 'Is it readable?'
		boolean v11=f1.canRead();
		System.out.println("Is it readable?:"+v11);
		//Verify 'Is it writable?'
		boolean v12=f1.canWrite();
		System.out.println("Is it readable?:"+v12);
		//Verify 'Is it executable?'
		boolean v13=f1.canExecute();
		System.out.println("Is it executable?:"+v13);

	}

}
