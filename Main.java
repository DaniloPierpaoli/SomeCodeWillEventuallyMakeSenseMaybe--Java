package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int number = 10;

        System.out.println("The sum of all digits in " + number+" = " + sumDigits(number));


    }


    public static int sumDigits(int number){
        if (number < 10){
            return -1;
        }

        int sumDigits = 0;

        int i = 10;
        while (number >= i){

            int digit = (number % i) /(i/10);
            number -= digit * i/10;
            sumDigits += digit;

            if (number/i < 10){
                int firstDigit = number / i;
                sumDigits += firstDigit;
            }
            i *= 10;
        }
        return sumDigits;
    }
}
