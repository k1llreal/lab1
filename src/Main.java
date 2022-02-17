import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int num;
        int[] firstArray;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите число: ");
            num = sc.nextInt();
            System.out.printf("Ваше число: %d \n", num);
            sc.close();
            System.out.println("Квадрат вашего числа равен: " + num * num);
            System.out.println("Корень вашего числа равен: " + Math.sqrt(num));
            firstArray = new int[num];
            for (int i = 0; i < firstArray.length; i++) {
                firstArray[i] = (int)(Math.random()*100);
            }
            System.out.println("Созданный массив с размерностью вашего числа: " + Arrays.toString(firstArray));
        } catch (java.util.InputMismatchException e) {
            System.out.println("Вы ввели не число!");
        }
    }

    public void fillArray(int[] first_arr){

    }
}
