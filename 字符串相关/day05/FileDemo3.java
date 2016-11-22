package day05;

import java.io.File;

/**
 * File操作目录
 * @author wangxin
 *
 */
public class FileDemo3 {
	public static void main(String []args){
		File dir=new File("src");
		if(dir.isFile()){
			System.out.println(dir.getName()+"是一个目录");
		}
		//判断当前File对表表示的是否为一个目录
		if(dir.isDirectory()){
			System.out.println(dir.getName()+"是一个目录");
		}
		/*
		 * 在当前根目录下创建一个目录test
		 */
		File d=new File("test");
		//判断当前目录是否已经存在了
//		if(!d.exists()){
//			//创建目录
//			d.mkdir();
//			System.out.println("搞定");
//		}
		
		
		//删除目录同样使用delete
		if(d.exists()){
			d.delete();
			System.out.println("已删除");
		}
		
	}
}
