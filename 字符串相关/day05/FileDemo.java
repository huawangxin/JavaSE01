package day05;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File��
 * ���������ļ�ϵͳ�е�һ���ļ���Ŀ¼
 * @author wangxin
 *
 */
public class FileDemo {
	public static void main(String []args){
		//java.io.File    .��ʾ��ǰ��Ŀ�ĸ�Ŀ¼
		//liux��ֻ����/   window���� / ����\(Ҫת��\\)
		//File.separator������ϵͳϵͳͨ�ã��Զ�ת��
		File file=new File("."+File.separator+"demo.txt");
		/*
		 * ͨ��File���ǿ��Ի�ȡ�ļ���Ŀ¼��������Ϣ
		 * ���߲����ļ���Ŀ¼��������ɾ����
		 * ���ǲ��ܶ��ļ����ݽ��з���
		 */
		if(file.isFile()){
			System.out.println("��һ���ļ�");
		}else {
			System.out.println("��һ��Ŀ¼");
		}
		//��ȡ�ļ���Ŀ¼������
		String name=file.getName();
		System.out.println("����"+name);
		//��ȡ���ǵ�ǰ�ļ�ռ�õ��ֽ���
		long length=file.length();
		System.out.println("�ֽڣ�"+length);
		//�鿴��ǰ�ļ��Ƿ���Ӳ�������Ǵ���
		if(file.exists()){
			System.out.println("����");
		}else{
			System.out.println("������");
		}
		//��ǰ�ļ�����޸�ʱ��
		long last=file.lastModified();
		System.out.println(last);
		/*
		 * 1:longת��Ϊdate
		 *  setTime()
		 *  2:��simpledateformatת�����ַ���
		 *  
		 */
		Date date=new Date();
		date.setTime(last);
		
		String format="yyyy��M��dd��,HH:mm:ss";
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		System.out.println(sdf.format(date));
		//3��7
		//��׿ os�ײ㶼��Linux
		file.canRead();//�ɶ�
		file.canWrite();//��д
		file.canExecute();//������
		file.isHidden();//�Ƿ�Ϊ�����ļ�
		
		
	}
}
