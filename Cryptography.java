import java.util.*;

public class Cryptography
{
	public static void main(String args[]){
		int[] numbers = {1,3,2,1,1,3};
		
		Cryptography check = new Cryptography();

		long result = check.encrypt(numbers);

		System.out.println(result);

		// for(int value:result){
		// 	System.out.println(value);
		// }
	}
	public long encrypt(int[] numbers)
	{
		long ans = 0;

		for(int i=0; i<numbers.length; i++)
		{
			long temp = 1;
			for (int j=0; j<numbers.length; j++)
			{
				if( i==j ){
					temp *= (numbers[j] + 1);
				}else{
					temp *= numbers[j];
				}
			}
			ans = Math.max(ans, temp);
		}
		return ans;
	}
}