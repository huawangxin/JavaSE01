package 作业1;

/**
 * 
 * @author wangxin
 *
 */
public class SubString {
	public static void main(String args[]){
		String str="someapp/manage/emplist.action";
		/*
		 * 第一：找到最后一个"/"的位置
		 * 第二： 从最后一个位置处截取至末尾
		 */
		int index=str.lastIndexOf("/");
		String sub=str.substring(index+1);
		System.out.println(sub);
	}

}
