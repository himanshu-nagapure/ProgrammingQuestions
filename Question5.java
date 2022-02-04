import java.util.Scanner;

/*
A number is called a tech number if the given number has an even number of digits and the number can be 
divided exactly into two parts from the middle. After equally dividing the number, sum up the numbers and 
find the square of the sum. If we get the number itself as square, the given number is a tech number,
else, not a tech number. For example, 3025 is a tech number
*/
public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        scanner.close();

        int numberOfDigits = number.length();
        if(numberOfDigits%2 != 0){
            System.out.println("Not a Tech number.");
        }else{
            int part1 = Integer.parseInt(number.subSequence(0, number.length()/2).toString());
            int part2 = Integer.parseInt(number.subSequence(number.length()/2, number.length()).toString());

            int finalNumber = (part1+part2)*(part1+part2);
            if(finalNumber == Integer.parseInt(number))
                System.out.println("Number is tech number");
            else
            System.out.println("Not a Tech number.");
        }
    }
}
