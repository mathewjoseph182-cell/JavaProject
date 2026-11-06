package iterative_statements;

public class While_sum {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=10)
		{
			//System.out.println(i);
			sum=sum+i; //sum=0+1=1, sum=1+2=3...
			i++;
		}
		System.out.println("sum is "+sum);

	}

}
