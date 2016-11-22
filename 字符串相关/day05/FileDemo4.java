package day05;

import java.io.File;

/**
 * 创建一个多级目录
 * @author wangxin
 *
 */
public class FileDemo4 {
	public static void main(String []args){
		File d=new File("a"+File.separator
				+"b"+File.separator
				+"c"+File.separator
				+"d"+File.separator
				+"e"+File.separator
				+"f");
//		if(!d.exists()){
//			/*
//			 * mkdirs方法会创建当前目录下
//			 * 以及所有不存在的父目录
//			 */
//			d.mkdirs();
//			System.out.println("搞定！");
//		}
		if(d.exists()){
			/*
			 * delete若删除的是一个目录
			 * 前提条件是，该目录必须是一个空的
			 */
			d.delete();
			System.out.println("已删除");
		}
	}
}

