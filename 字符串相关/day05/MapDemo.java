package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * map����������һ���������еı�� ��key-value�Ե���ʽ��������
 * 
 * @author wangxin
 *
 */
public class MapDemo {
	public static void main(String[] args) {
		// java.util.Map
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("����", 119);
		map.put("��ѧ", 199);
		map.put("Ӣ��", 119);
		map.put("��ѧ", 99);
		// ���Map�е�Ԫ�ظ���
		System.out.println(map.size());
		// ���Map��toString
		System.out.println(map);
		/*
		 * ��Key��map�в����ڣ��Ὣ������key��value����map������ֵnull ����Ҫע�⣬��value��һ����װ�࣬��ô
		 * ���ǻ�ȡput����ֵ��Ӧʹ�ð�װ���ǽ��գ�������ʹ�û������ͣ� ��Ϊ���漰����ʽ���Զ����䣬���¿�ָ���쳣��
		 */
		Integer num = map.put("��ѧ", 88);
		Integer num1 = map.put("��ѧ", 88);

		/*
		 * ʹ��Map�����е�key�����value�������滻value������ put�����Ὣ�滻��value����
		 */
		// int num1=map.put("��ѧ", 88);
		System.out.println(map);
		System.out.println(num);
		System.out.println(num1);
		/*
		 * Map�л�ȡԪ�صķ�ʽ�Ǹ��ݸ�����key��ȡ��Ӧ��value����������key��map�в����ڣ��򷵻�ֵΪnull v get(K k)
		 */
		num = map.get("����");
		System.out.println("����:" + num);

		num = map.get("����");
		System.out.println("������" + num);
		/*
		 * ɾ��Ԫ�� V remove(K k) ���ݸ�����keyɾ����ǰkey-value�� ��key���ڣ�����ֵΪ��ǰkey��Ӧ��value
		 * ��key�����ڣ��򷵻�null
		 */
		System.out.println(map);
		num = map.remove("����");
		System.out.println(num);
		System.out.println(map);
		/*
		 * boolean containskey(k k)
		 * �鿴��ǰmap���Ƿ����������key
		 */
		boolean has=map.containsKey("�ֹ�");
		System.out.println("�Ƿ�������ֹ���"+has);
		
		
	}
}
