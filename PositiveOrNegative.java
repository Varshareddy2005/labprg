import java.util.Scanner;
class PositiveOrNegative{
public static void main(String[] args){
	scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	if (num<0){
		System.out.println(" the number is negative ");
	}
	else if (num>0){
		System.out.println(" the number"+num+" is positive ");
	}
	else{
		System.out.println(" the number"num+" is zero ");
	}
}
}