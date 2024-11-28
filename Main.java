import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
        for (int j=10; j<20;j++){
            System.out.println(j);
        }
        for (int q=20;q<30;q++){
            System.out.println(q);
        }
        for (int w=30;w<40;w++){
            System.out.println(w);
        }
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        System.out.println(a+b);


    }
}
