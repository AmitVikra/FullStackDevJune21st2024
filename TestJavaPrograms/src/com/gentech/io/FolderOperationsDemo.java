package com.gentech.io;

import java.io.File;

public class FolderOperationsDemo {
	public static void main(String[] args) {
	//	createFolder();
	//	createNestedFolder();
	//	renameFolder();
	//	deleteFolder();
	//	folderCollections();
	}
	
	private static void createFolder()
	{
		File f1=new File("D:\\Demo\\Hello");
		boolean v1=f1.mkdir();
		System.out.println("Whether Folder has created ?:"+v1);
	}

	private static void createNestedFolder()
	{
		File f1=new File("D:\\Demo\\Dev1\\Dev2\\Dev3\\Dev4");
		boolean v1=f1.mkdirs();
		System.out.println("Whether Nested Folders have created ?:"+v1);
	}
	
	private static void renameFolder()
	{
		File f1=new File("D:\\Demo\\Hello");
		File f2=new File("D:\\Demo\\HelloWorld");
		boolean v1=f1.renameTo(f2);
		System.out.println("Whether folder has renamed ?:"+v1);
	}
	
	private static void deleteFolder()
	{
		File f2=new File("D:\\Demo\\HelloWorld");
		boolean v1=f2.delete();
		System.out.println("Whether folder has deleted ?:"+v1);
	}
	
	private static void folderCollections()
	{
		File f1=new File("D:\\Demo");
		File f[]=f1.listFiles();
		for(int i=0;i<f.length;i++)
		{
			if(f[i].isDirectory()==true)
			{
				String path=f[i].getAbsolutePath();
				System.out.println(path);
			}
		}
	}
}
