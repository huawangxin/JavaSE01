package 作业5;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 * 查看文件大小、目录大小、建立多级目录并删除目录及其中文件
 * @author wangxin
 *
 */
public class test08 {
	public static void main(String[] args) throws IOException {
		new test08().test3();
	}
	public void test(){
		File file=new File("demo"+File.separator+"helloworld.txt");
		long size=FileUtils.sizeOf(file);
		System.out.println("文件大小为 ："+size);
	}
	public void test1(){
		File file=new File("src");
		long size=FileUtils.sizeOf(file);
		System.out.println("文件夹大小为 ："+size);
	}
	public void test2() throws IOException{
		File dir=new File("姚利宗"+File.separator
				+"b"+File.separator
				+"c"+File.separator
				+"d"+File.separator
				+"e");
		FileUtils.forceMkdir(dir);
		System.out.println("已创建完成！");
	}
	public void test3() throws IOException{
		File dir=new File("姚利宗");
		FileUtils.deleteDirectory(dir);
	}
}
