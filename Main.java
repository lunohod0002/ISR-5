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


        System.out.print("Это добавлено в ветке main");
        int r=10;
        int w=5;
        System.out.println(r+w);
        int c=10;
        int d=5;
        System.out.println(c-d);
        int e=5;
        int f=2;
        System.out.println(e*f);
        int g=10;
        int h=2;
        System.out.println(g/h);

    }
}
