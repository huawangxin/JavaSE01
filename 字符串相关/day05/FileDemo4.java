package day05;

import java.io.File;

/**
 * ����һ���༶Ŀ¼
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
//			 * mkdirs�����ᴴ����ǰĿ¼��
//			 * �Լ����в����ڵĸ�Ŀ¼
//			 */
//			d.mkdirs();
//			System.out.println("�㶨��");
//		}
		if(d.exists()){
			/*
			 * delete��ɾ������һ��Ŀ¼
			 * ǰ�������ǣ���Ŀ¼������һ���յ�
			 */
			d.delete();
			System.out.println("��ɾ��");
		}
	}
}

