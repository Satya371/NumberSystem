package NumberSystem;

import java.util.Scanner;

public class MenuDrClass {

	public static void main(String[] args) {
		for(;;)
		{
		System.out.println("1. Factorial of a umber : \n"
				+ "2. Length of a Number : \n"
				+ "3. Power of a Number : \n"
				+ "4. Armstrong of a Number : \n"
				+ "5. Range of Armstrong : \n"
				+ "6. Range of Strong Number : \n"
				+ "7. Strong of a Number : \n"
				+ "8. Automorphic Number of not : \n"
				+ "9. Niven Number or not : \n"
				+ "10. Magic Number or Not : \n"
				+ "11.Reverse of the Number");
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your choice : ");
		int choice = sc.nextInt();
		
			if(choice==1)
			{
				System.out.println(" Factorial of a Number : ");
				System.out.println("Enter a Number : ");
				int num = sc.nextInt();
				if(num<0)System.out.println("Plese enter a positive Number");
				else System.out.println("Factorial of "+num +"is "+Numbers.factorial(num));
			}
			else if(choice==2)
			{
				System.out.println(" Length of a number : ");
				System.out.println("Enter a Number");
				int num=sc.nextInt();
				if(num<0)System.out.println("Plese enter positive Number");
				else System.out.println("Length of the Number is : "+Numbers.length(num));
			}
			else if(choice==3)
			{
				System.out.println(" Power of a number : ");
				System.out.println("Enter the base : ");
				int base=sc.nextInt();
				System.out.println("Enter the Exponent : ");
				int exp=sc.nextInt();
				if(base<0||exp<0) System.out.println("No negetives.....");
				else System.out.println("The Power is"+Numbers.power(base, exp));
			}
			else if(choice==4)
			{
				System.out.println(" Armstrong no or not : ");
				System.out.println("Enter a Number");
				int num=sc.nextInt();
				if(num<0)System.out.println("Plese enter positive Number");
				if (num==Numbers.Armstrong(num))System.out.println("Yes it is an armstrong Number");
				else System.out.println(" No it is not an Armstrong Number");
			}
			else if(choice==5)
			{
				System.out.println(" Range of a number : ");
				System.out.println("Enter the upper range :  ");
				int range=sc.nextInt();
				if(range<0)System.out.println("Plese enter positive Number");
				else
				{
					for(int i =1;i<range;i++)
					{
						if(Numbers.Armstrong(i)==i)System.out.println(i);
					}
				}
			}
			else if(choice==6)
			{
				System.out.println(" Range of Strong number : ");
				System.out.println("Enter the upper range :  ");
				int range=sc.nextInt();
				if(range<0)System.out.println("Plese enter positive Number");
				else
				{
					for(int i =1;i<range;i++)
					{
						if(Numbers.strong(i)==i)System.out.println(i);
					}
				}
			}
			else if(choice==7)
			{
				System.out.println(" Strong of a number : ");
				System.out.println("Enter a Number");
				int num=sc.nextInt();
				if(num<0)System.out.println("Plese enter positive Number");
				else if(num==Numbers.strong(num))System.out.println("Yes this is a strong number");
				else System.out.println("No it is not a strong Number");
			}
			else if(choice==8)
			{
				System.out.println(" Number is automorphic or not : ");
				System.out.println("Enter a Number");
				int num=sc.nextInt();
				if(Numbers.AutoMorphic(num)) System.out.println("yes this is a automorphic number");
				else System.out.println("No it is not a automorphic Number");
			}
			else if(choice==9)
			{
				System.out.println(" Nevin number or not : ");
				System.out.println("Enter a Number");
				int num=sc.nextInt();
				if(Numbers.Nevin(num))System.out.println("Yes it is a nevin Number");
				else System.out.println("No it is not a nevin Number");
			}
			else if(choice==10)
			{
				System.out.println(" Magic number or not : ");
				System.out.println("Enter a Number");
				int num=sc.nextInt();
				if(Numbers.MagicNo(num))System.out.println("Yes it is a Magic Number");
				else System.out.println("No it is not a Magic Number");
			}
			else if(choice==11)
			{
				System.out.println(" Reverse of a number : ");
				System.out.println("Enter a Number");
				int num=sc.nextInt();
				System.out.println(Numbers.reverse(num));
			}
			else
			{
				System.out.println("******Invalid option******");
				System.out.println("Thats ok you made a mistake, you can be corrected");
				System.out.println("Try again, Thank You........");
			}
			System.out.println("Do you want to continue : Y/N");
			char ch = sc.next().charAt(0);
			if(ch=='Y'||ch=='y') continue;
			else
			{
				System.out.println("Thank you for using the Software \n"
						+ "Visit again.....");
				break;
		    }
	}


	}
}
