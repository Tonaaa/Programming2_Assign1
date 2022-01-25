import java.util.Scanner;

public class Bmi {
    public static void main(String[] args){
        // create a scanner object for receiving input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("This program calculates your BMI");
        // asking and receiving user's input
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Please enter your weight in kgs");
        float weight = sc.nextFloat();
        System.out.println("Please enter your height in m");
        float height = sc.nextFloat();

        // calculating bmi
        float bmi = weight / (height * height);
        // using String.format to display the bmi value with 2 decimal places
        System.out.println(name + ", your BMI is " + String.format("%.2f", bmi));
    }
}
