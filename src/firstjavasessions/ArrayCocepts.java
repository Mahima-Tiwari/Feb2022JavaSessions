package firstjavasessions;

public class ArrayCocepts {

	public static void main(String[] args) {
		
		//1. int array
		int i[]=new int [4];
		i[0]=10;
		i[1]=15;
		i[2]=20;
		i[3]=30;
		//i[4]=50;
		
		System.out.println("li= "+0);
		System.out.println("length= "+i.length);
		System.out.println("hi= "+(i.length-1));
		System.out.println(i[0]);
		System.out.println(i[4]);//AIOB Exception
		System.out.println(i[-1]);//AIOB Exception
		

	}

}
