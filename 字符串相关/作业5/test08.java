package ��ҵ5;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 * �鿴�ļ���С��Ŀ¼��С�������༶Ŀ¼��ɾ��Ŀ¼�������ļ�
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
		System.out.println("�ļ���СΪ ��"+size);
	}
	public void test1(){
		File file=new File("src");
		long size=FileUtils.sizeOf(file);
		System.out.println("�ļ��д�СΪ ��"+size);
	}
	public void test2() throws IOException{
		File dir=new File("Ҧ����"+File.separator
				+"b"+File.separator
				+"c"+File.separator
				+"d"+File.separator
				+"e");
		FileUtils.forceMkdir(dir);
		System.out.println("�Ѵ�����ɣ�");
	}
	public void test3() throws IOException{
		File dir=new File("Ҧ����");
		FileUtils.deleteDirectory(dir);
	}
}
