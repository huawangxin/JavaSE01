package day05;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��File������ɾ��һ���ļ�
 * @author wangxin
 *
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		/*
		 * ��ǰ��Ŀ�ĸ�Ŀ¼�´���һ����Ϊtest.txt�ļ� ��д��./��Ҳ��ʾĬ�ϴ����ڵ�ǰ��Ŀ��Ŀ¼��
		 */
		File file = new File("test.exe");
		// �ļ��������򴴽�
		 if(!file.exists()){
		 file.createNewFile();
		 System.out.println("�㶨");
		 }else{
		 System.out.println("���ļ��Ѿ�����");
		 }
		/*
		 * ���ж��ļ��Ƿ���ڣ����ھ�ɾ�� �˲���Ϊ����ɾ��
		 */
		if (file.exists()) {
			file.delete();
			System.out.println("�ļ��Ѿ�ɾ��");
		}

	}
}
