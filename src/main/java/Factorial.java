public class Factorial {

    public static int calculate(int number){
        int remaining = number;
        int result = 1;
        while(remaining > 0) {
            result = result * remaining;
            remaining--;
        }
        return result;
    }

}
