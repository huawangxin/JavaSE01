package day05;

import java.io.File;

/**
 * File����Ŀ¼
 * @author wangxin
 *
 */
public class FileDemo3 {
	public static void main(String []args){
		File dir=new File("src");
		if(dir.isFile()){
			System.out.println(dir.getName()+"��һ��Ŀ¼");
		}
		//�жϵ�ǰFile�Ա��ʾ���Ƿ�Ϊһ��Ŀ¼
		if(dir.isDirectory()){
			System.out.println(dir.getName()+"��һ��Ŀ¼");
		}
		/*
		 * �ڵ�ǰ��Ŀ¼�´���һ��Ŀ¼test
		 */
		File d=new File("test");
		//�жϵ�ǰĿ¼�Ƿ��Ѿ�������
//		if(!d.exists()){
//			//����Ŀ¼
//			d.mkdir();
//			System.out.println("�㶨");
//		}
		
		
		//ɾ��Ŀ¼ͬ��ʹ��delete
		if(d.exists()){
			d.delete();
			System.out.println("��ɾ��");
		}
		
	}
}
