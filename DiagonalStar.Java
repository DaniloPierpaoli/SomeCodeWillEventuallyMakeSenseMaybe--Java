public class DiagonalStar {

    public static void printSquareStar(int number) {
        //This method prints out, for any integer greater or equal of 5, a frame and diagonal of the number of stars.
        // For exemple: if number == 5: the first row, the last row, the first column, the last columns and the 2 diagonals
        // will be composed of 5 stars each.
    
        if (number < 5) {
            System.out.println("Invalid Value");
        }else {


            for (int row = 1; row <= number; row++) {
                for (int col = 1; col <= number; col++) {
                    if (row == 1) {
                        System.out.print("*");
                        continue;
                    }
                    
                    
                    if (col == 1) {
                        System.out.println("");
                        System.out.print("*");
                        continue;
                    }
                    
                    
                    if (row <= number / 2) {
                        if (col == row) {
                            System.out.print("*");
                        } else if (col != number - row + 1 && col != number) {
                            System.out.print(" ");
                        } else System.out.print("*");
                    }

                    
                    if (row > number / 2 && row < number) {
                        if (col == number - row + 1) {
                            System.out.print("*");
                        } else if (col != row && col != number) {
                            System.out.print(" ");
                        } else System.out.print("*");
                    }

                    if (row == number) {
                        System.out.print("*");
                    }


                }

            }
        }

    }

}
