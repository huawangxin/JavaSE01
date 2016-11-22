package 作业1;
/**
 * 
 * @author wangxin
 *
 */
public class 第6题 {
	public static void main(String[] args) {
		/*
		 * 中文在unicode编码中的范围
		 * 4e00----9fa5
		 * 1,循环添加每一个字符
		 * 2，每生成50个汉字，就写一个换行符
		 * 
		 * 思考：
		 * 1，频繁的在当前字符串后面追加新生成的结果：使用StringBuilder
		 * 2，因为每50个字就要换行结果：定义一个变量，用于记住生成了多少字符，可以对50取余   
		 * 
		 */
		int sum=0;
		StringBuilder builder=new StringBuilder();
		for(char c='\u4e00';c<='\u9fa5';c++){
			builder.append(c);
			sum++;
			if(sum%50==0){
				builder.append("\n");
			}
		}
		String str=builder.toString();
		System.out.println(sum);
		System.out.println(str);
	}

}
