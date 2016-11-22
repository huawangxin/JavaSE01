package day05;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建或删除一个文件
 * @author wangxin
 *
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		/*
		 * 当前项目的根目录下穿件一个名为test.txt文件 不写“./”也表示默认创建在当前项目根目录下
		 */
		File file = new File("test.exe");
		// 文件不存在则创建
		 if(!file.exists()){
		 file.createNewFile();
		 System.out.println("搞定");
		 }else{
		 System.out.println("该文件已经存在");
		 }
		/*
		 * 先判断文件是否存在，存在就删除 此操作为彻底删除
		 */
		if (file.exists()) {
			file.delete();
			System.out.println("文件已经删除");
		}

	}
}
