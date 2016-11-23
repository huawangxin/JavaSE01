package day05;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File类
 * 用于描述文件系统中的一个文件或目录
 * @author wangxin
 *
 */
public class FileDemo {
	public static void main(String []args){
		//java.io.File    .表示当前项目的根目录
		//liux中只能用/   window可以 / 或者\(要转义\\)
		//File.separator则两种系统系统通用，自动转换
		File file=new File("."+File.separator+"demo.txt");
		/*
		 * 通过File我们可以获取文件或目录的属性信息
		 * 或者操作文件或目录（创建，删除）
		 * 但是不能对文件内容进行访问
		 */
		if(file.isFile()){
			System.out.println("是一个文件");
		}else {
			System.out.println("是一个目录");
		}
		//获取文件或目录的名字
		String name=file.getName();
		System.out.println("名字"+name);
		//获取的是当前文件占用的字节量
		long length=file.length();
		System.out.println("字节："+length);
		//查看当前文件是否在硬盘中真是存在
		if(file.exists()){
			System.out.println("存在");
		}else{
			System.out.println("不存在");
		}
		//当前文件最后修改时间
		long last=file.lastModified();
		System.out.println(last);
		/*
		 * 1:long转换为date
		 *  setTime()
		 *  2:用simpledateformat转换成字符串
		 *  
		 */
		Date date=new Date();
		date.setTime(last);
		
		String format="yyyy年M月dd日,HH:mm:ss";
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		System.out.println(sdf.format(date));
		//3个7
		//安卓 os底层都是Linux
		file.canRead();//可读
		file.canWrite();//可写
		file.canExecute();//可运行
		file.isHidden();//是否为隐藏文件
		
		
	}
}
