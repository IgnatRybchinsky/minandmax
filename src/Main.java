import java.util.Random;



public class Main {
    public static void main(String[] args) {

        int numbers[]= new int[10];
         Random r = new Random();

        for (int i=0; i < numbers.length; i++){
              numbers[i]=r.nextInt(100);

        }
        int min = numbers[0];
        int max = numbers[0];

        for (int num: numbers)
        {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        System.out.println(min);
        System.out.println(max);

    }
}