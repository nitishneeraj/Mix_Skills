package Test_Programs;

public class Animals_Count {
	
	static void animals(int chickens,int cows , int pings ) {
		int sum =0,total ,sum1;
		sum = chickens*2;
		sum1=(cows+pings)*4;
		total = sum+sum1;
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		animals(5,2,8);
	}

}
