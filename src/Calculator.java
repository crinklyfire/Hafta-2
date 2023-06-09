import java.util.Scanner;
public class Calculator {

    static int sum(int a , int b){
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a , int b){
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int times (int a , int b){
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int divide(int a , int b){
        int result = a / b;
        System.out.println("Bölme : " + result);
        return result;
    }

    static int power (int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static int mod ( int a , int b){
        return a % b;
    }

    static void calc(int a , int b){
        System.out.println("Dikdörtgenin Çevresi : " + (2*(a + b)));
        System.out.println("Dikdörtgenin Alanı : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
        + "2- Çıkarma İşlemi \n"
        + "3- Çarpma İşlemi \n"
        + "4- Bölme işlemi \n"
        + "5- Üslü Sayı Hesaplama\n"
        + "6- Faktoriyel Hesaplama\n"
        + "7- Mod Alma\n"
        + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
        + "0- Çıkış yap";

        while (true){
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz : ");
            select = input.nextInt();

            if (select == 0){
                break;
            }
            System.out.print("İlk Sayı : ");
            int a = input.nextInt();
            System.out.print("ikinci Sayı :");
            int b = input.nextInt();

            switch (select){

                case 1:
                    sum (a , b);
                    break;

                case 2:
                    minus(a , b);
                    break;

                case 3:
                    times(a , b);
                    break;

                case 4:
                    if (b == 0){
                        System.out.println("Payda 0'a eşit olamaz. Tekrar deneyiniz!");
                    }else {
                        divide(a , b);
                    }
                    break;
                case 5:
                    System.out.println("Üs Hesabı : " + power(a , b));
                    break;

                case 6:
                    factorial();
                    break;

                case 7:
                    System.out.println("Mod işlemi : " + mod(a , b));
                    break;

                case 8:
                    calc(a , b);
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Geçersiz işlem!");

            }
        }
    }
}
