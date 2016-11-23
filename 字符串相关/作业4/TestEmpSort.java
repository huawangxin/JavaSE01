package ื๗าต4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmpSort {
	public void testComparator(){
		List<Emp> emps=new ArrayList<Emp>();
		emps.add(new Emp("aaa",25,'m',6000));
		emps.add(new Emp("bbb",25,'m',4000));
		emps.add(new Emp("ccc",25,'m',3000));
		Collections.sort(emps,new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				// TODO Auto-generated method stub
				return o1.getSalary()>o2.getSalary()?1:(o1.getSalary()==o2.getSalary()?0:-1);
			}
			
		});
		
		System.out.println(emps);
	}
}
