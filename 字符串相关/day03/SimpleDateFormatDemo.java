package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat
 * ���Ը���һ���ض������ڸ�ʽ�ַ�����
 * ���ַ�����Date֮�以��ת��
 * @author wangxin
 *ͨ��һ�����ڸ�ʽ ��date�����ڸ�ʽ֮�以��ת��
 */
public class SimpleDateFormatDemo {
	public static void main(String args[]){
		Date now=new Date();
		System.out.println(now);
		//2014-08-21  11:07:22
		//yyyy-MM-dd  HH:mm:ss
		String format="���ڣ�yyyy-MM-dd  ʱ�䣺HH:mm:ss";
		SimpleDateFormat sdf
		=new SimpleDateFormat(format);
		String str=sdf.format(now);
		System.out.println(str);
	}
}
//��������ʲô ����PPT