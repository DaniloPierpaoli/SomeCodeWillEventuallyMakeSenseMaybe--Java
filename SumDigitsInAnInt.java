

public class Main {

    public static void main(String[] args) {
        // Main method just to call and visualise the sumDigits method.
        
        int number = anyIntNumberHere;

        System.out.println("The sum of all digits in " + number+" = " + sumDigits(number));


    }


    public static int sumDigits(int number){
        
        //Method returns -1 if the number contains less than 2 digits or it's below 0. Then it starts iterating through i, multiplied by 10 each cycle.
        // It extracts the remainder of each digit and substracts it from the original number so that the remainder always refers to one digit. 
        // The end of the loop returns the sum of all digits of any int number.
        
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
