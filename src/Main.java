import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Kullanıcı veri girişi
        System.out.print("Bir sayı giriniz : ");
        int num = scanner.nextInt();
        //Mükemmel sayı bulma yolu
        int total = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        if (total == num) {
            System.out.println(num + " mükemmel sayıdır.");
        } else {
            System.out.println(num + " mükemmel sayı değildir.");
        }
    }
}
