import java.util.Scanner;

public class FoodMenu {

	public static void main(String[] args) {
		int choice;
		int totalBill=0; 

		Scanner sc =new Scanner(System.in);
		
		
		do {
			int quantity=0;
			
			System.out.printf("1. Dosa rs.30\n2. Samosa rs.45\n3. Idli rs.40\n4. Pohe rs.20\n");
			System.out.printf("5. Misal rs.45\n6. Vada pav rs.25\n7. Pav vada rs.20\n8. Vada rs.35\n");
			System.out.printf("9. Cut dosa rs.30\n10. Generate bill\n0.Exit\\n");
			System.out.println("Enter the choise :");
			choice =sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the quantity : ");
				quantity=sc.nextInt();
				System.out.println("Dosa is added !");
				
				totalBill+=quantity*30;
				break;
			case 2:
				System.out.println("Enter the quantity : ");
				quantity=sc.nextInt();
				System.out.println("Samosa is added !");
				totalBill+=quantity*45;
				break;
			case 3:
				System.out.println("Enter the quantity : ");
				quantity=sc.nextInt();
				System.out.println("Idali is added !");
				totalBill+=quantity*40;
				break;
			case 4:
				System.out.println("Enter the quantity : ");
				quantity=sc.nextInt();
				System.out.println("Pohe is added !");
				totalBill+=quantity*20;
				break;
			case 5:
				System.out.println("Enter the quantity : ");
				quantity=sc.nextInt();

				System.out.println("Misal is added !");
				totalBill+=quantity*45;
				break;
			case 6:
				System.out.println("Enter the quantity : ");
				quantity=sc.nextInt();
				System.out.println("Vada pav is added !");
				totalBill+=quantity*25;
				break;
			case 7:
				System.out.println("Enter the quantity : ");
				quantity=sc.nextInt();
				System.out.println("Pav vada is added !");
				totalBill+=quantity*20;
				break;
			case 8:
				System.out.println("Enter the quantity : ");
				quantity=sc.nextInt();
				System.out.println("Vada is added !");
				totalBill+=quantity*35;
				break;
			case 9:
				System.out.println("Enter the quantity : ");
				quantity=sc.nextInt();
				System.out.println("Cut dosa is added !");
				totalBill+=quantity*30;
				break;
			case 10:
				System.out.println("Total bill : "+totalBill);
				System.out.println("Thank you for order !");

				
				break;
			default :
				System.out.println("Enter something valid !");
					
			}
		}
		while(choice!=0);
				
			
				
		}

	}


