import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer :");
		int num=sc.nextInt();
		System.out.println("Given Number :"+num);
		System.out.println("Binary equivalent :"+ Integer.toBinaryString(num));
		System.out.println("Octal equivalent :"+ Integer.toOctalString(num));
		System.out.println("Hexadecimal equivalent :"+ Integer.toHexString(num));


	}

}
