package helloworld;
import java.util.*;
import java.util.stream.*;







public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> lst=new ArrayList<Integer>();
		
		for(int i=0;i<500;i++) {
			lst.add((int)(Math.random()*100));
		}
		lst.parallelStream().forEach(n -> System.out.print(n+" "));
		
		int summ=lst.parallelStream().reduce(0,Integer::sum);
		System.out.println();
		System.out.println(summ);
		
ArrayList<Integer> lst2=new ArrayList<Integer>();
		
		for(int i=0;i<500;i++) {
			lst2.add((int)(Math.random()*100));
		}
		System.out.println();
		Stream<Integer> parallelStreamList=lst2.stream().parallel();
		
		parallelStreamList.forEach(n -> System.out.print(n+" "));
	}
	
	
	
	

}
