public class Reverse{
public static void main(String[] args){
	System.out.println("print the reverse nubers");
	int num=6579;
	int sum=0,reminder;
		for (int i=0;i<num;i++)
		{
			reminder=num%10;
			sum=(sum*10)+reminder;
			num=num/10;
		}
	System.out.println(sum);

}
} 
//print the reverse nubers
//9756