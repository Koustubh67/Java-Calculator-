

import java.util.Scanner;

public class javaclalculator {
    public static void main(String[] args) {
        int a,b,ch;
        Scanner sc= new Scanner(System.in) ;
        System.out.println("Enter Frist Number:");
        a=sc.nextInt();
        System.out.println("Enter Seccond Number:");
        b= sc.nextInt();
        System.out.println("Enter your choice 1->add 2->subtract 3 -> multiply 4-> Divide \n Enter your choice :");
        ch= sc.nextInt();
        if (ch==1)
            System.out.println("Addition="+(a+b));
        else if(ch==2)
            System.out.println("Subraction="+(a-b));
        else if (ch==3)
        System.out.println("Multiplication="+(a*b));
        else if (ch ==4)
        System.out.println("Divison="+(a/b));
        else
            System.out.println("Invalid Choice");



    }

}
