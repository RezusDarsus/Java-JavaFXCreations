import java.util.Scanner;

public class Factorization {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a number: ");
        int num = scan.nextInt();
        if(num <= 1){
            System.out.println("Error: n>1 expected!");
        }

        for(int i = 2 ; i < num; i++){
            while (num % i == 0){
                System.out.print(i + " ");
                num = num / i;
            }
        }

        if(num > 2){
            System.out.print(num);
        }


    }

}
