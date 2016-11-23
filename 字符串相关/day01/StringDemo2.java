package day01;
/**
 * StringBuilder
 * 频繁修改字符串的性能问题(资源消耗过度)的首选[再溢出就只能改程序]
 * @author Administrator
 */
public class StringDemo2 {
	public static void main(String[] args) {
		/*
		 * StringBuilder提供了对字符串编辑的相关方法：
		 * 增：append
		 * 删：delete
		 * 改：replace
		 * 插：insert
		 * 反：reverse
		 */
		String str="努力学习java";
		StringBuilder builder=new StringBuilder(str);
		
		//优化代码：自下而上，等量代换
		
		
		//努力学习java，为了找个好工作
		//append用于在当前字符串末尾追加给定字符串
		builder.append("，为了找个好工作");
		str=builder.toString();
		System.out.println(str);
		
		//努力学习java，为了改变世界个好工作
		builder.replace(11, 12, "改变世界");
		str=builder.toString();
		System.out.println(str);
		
		//努力学习，为了改变世界
		//delete方法：删除指定范围内的字符串
		builder.delete(4, 8);
		str=builder.toString();
		System.out.println(str);
		
		
		//小明努力学习，为了改变世界
		/*
		 * insert(int offset,String str)
		 * 在给定位置offset处插入字符串str
		 * 原位置及以后的字符串内容自动向后移动
		 */
		builder.insert(0, "乔布斯");
		str=builder.toString();
		System.out.println(str);
		
		//反转字符
		builder.reverse();
		str=builder.toString();
		System.out.println(str);
		
	}
}
