import java.util.Scanner;

public class DesignMethod {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = input.nextInt();
        System.out.print("Output : ");
        find(n, true, n);
    }
    public static void find(int number, boolean isCorrect, int temp){
        System.out.print(number + " ");
        if (number > 0 && isCorrect){
            find(number - 5, true, temp);
        }else {
            if (number == temp){
                return;
            }
            find(number + 5, false, temp);
        }
    }
}
