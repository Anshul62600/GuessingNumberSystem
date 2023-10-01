import java.util.Scanner;

public class Gessgamebinarysearch {
    public static void main(String[] args) {

        System.out.println("Enter the Random no. between 1 and 1000");
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt();
        int sp = 1;
        int lp = 1000;
        do {
            int m = (sp + lp) / 2;
            System.out.println(m + " should be the no.\n0----Found\n1----higher\n2----lower");
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println(m + " is Number");
                break;
            } else if (n == 1)
                lp = m - 1;
            else // (n == -1);
                sp = m + 1;
        } while (sp <= 1000);




/*//======================binary search by AI=====================
     System.out.println("AI choose the Random no. between 1 and 1000");
        int p = (int)(Math.random() * 1000);
        System.out.println(" No. is "+p);
        Scanner sc=new Scanner(System.in);
        int sp=1;
        int lp=1000;
        do {
            int m = (sp + lp) / 2;
            System.out.println(m+" should be the no.\n0----Found\n1----higher\n2----lower");
             if (m == p){
               System.out.println(m+" is your Number");
                 break;}
               int n=sc.nextInt();
             if (n == 1)
                lp = m - 1;
             else // (n == -2);
                sp = m + 1;
       }while (sp<=1000);
    }*/
    }
}



