import java.util.Scanner;

public class Main {

    /*
     *  Напишите метод, который принимает в качестве параметра int и
     *  при помощи scanner, int result = 3.14*a*a sout(result):
     * “The area of a circle with radius …..”.
     * */

    public static void getCircleSquare(float a) {
        System.out.println
                ("The area of a circle with radius: [" + a + "] is " + (3.14 * a * a));
    }

   public static float getSum(int a, int b) {
        return a + b;
   }

    public static void main(String[] args) {
        float a = getSum(1, 2);


        Scanner scanner = new Scanner(System.in);
        ;//ждет ввода с клавиатуры
       // System.out.println("Please input a radius... ");
        // getCircleSquare(scanner.nextInt());
        //*******************************************************//
//        int a = scanner.nextInt();
//        System.out.println
//                ("The area of a circle with radius: [" + a + "] is " + (3.14 * a * a));

        double b = 3;
        double c = a / b;
        System.out.println(c);
    }
}