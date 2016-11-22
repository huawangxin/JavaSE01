package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 * @author wangxin
 *
 */
public class TestSize {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		System.out.println("is.Empty:"+c.isEmpty());
		c.add("terry");
		c.add("allen");
		c.add("jerry");
		c.add("smith");
		System.out.println("isEmpty:"+c.isEmpty()+",size:"+c.size());
		c.clear();
		System.out.println("isEmpty:"+c.isEmpty()+",size:"+c.size());
		
	}

}
