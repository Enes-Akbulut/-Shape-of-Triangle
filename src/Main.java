import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Shape-of-Triangle

       *******************
        *****************
         ***************
          *************
           ***********
            *********
             *******
              *****
               ***
                *

          */
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a digit  number for the shape");
        number= input.nextInt();

        for (int i = 1; i<=number;i++){
            for (int b=1; b<=i;b++)   {
                System.out.print(" ");
            }
            for (int s=1;s<=(2*(number-i+1)-1);s++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}