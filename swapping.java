import java.util.Scanner;
public class swapping {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a=");
    int a=sc.nextInt();
    System.out.println("enter b=");
    int b=sc.nextInt();
    sc.close();
    int temp;
    temp=a;
    a=b;
    b=temp;
    System.out.println(a);
    System.out.println(b);

    }
    
}
