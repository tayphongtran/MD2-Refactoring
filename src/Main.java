public class Main {

        public static String fizzBuzz(int number){
            boolean isFizz = number % 3 == 0;
            boolean isBuzz = number % 5 == 0;

            if(isFizz && isBuzz)
                return "FizzBuzz";

            if(isFizz)
                return "Fizz";

            if(isBuzz)
                return "Buzz";

            return number + "";
        }

    public static void main(String[] args) {
        fizzBuzz(100);
        System.out.println(fizzBuzz(100));
    }
}