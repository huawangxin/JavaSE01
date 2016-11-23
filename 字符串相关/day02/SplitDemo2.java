package day02;
/**
 * 为附件生成名字
 * @author wangxin
 *
 */
public class SplitDemo2 {
	public static void main(String args[]){
		String imgName="1.jpg";
		/*
		 * 1:先根据“。”拆分字符串
		 * 2：获取当前系统时间的毫秒值
		 * 3：用毫秒值拼上一个“。”在拼上后缀
		 */
		String[] names=imgName.split("\\.");   //split用的正则表达式. 是可指任意数
		String name=System.currentTimeMillis()+"";
		imgName=name+"."+names[1];
		System.out.println(imgName);
		
	}

}
