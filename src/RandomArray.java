

import java.sql.SQLOutput;
import java.util.Random;
/**
 * RandomArray gibt den Durchschnitt von X zufälligen Nummern zwischen Y und Z an.
 */
public class RandomArray
{

    public RandomArray()
    {
    }

    public void getAverageOfXNumbersBetweenMinAndMax(int x, int min, int max)
    {
        Random random = new Random();

        int[] numbers = new int[x];
        double average = 0;

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt((max-min) + 1) + min;
            //System.out.print(numbers[i] + " ");
            average += numbers[i];
        }
        System.out.println(average/x);

    }

    public static void main(String[] args) {
        RandomArray randomArray = new RandomArray();
        randomArray.getAverageOfXNumbersBetweenMinAndMax(50, 80, 100);
    }
}
