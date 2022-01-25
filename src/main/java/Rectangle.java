import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        // create a scanner object for receiving input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("This program calculates the area and perimeter of a rectangle");

        // ask and receive input from the user as integers
        System.out.println("Please enter the length of the rectangle");
        int length = sc.nextInt();
        System.out.println("Please enter the width of the rectangle");
        int width = sc.nextInt();

        // calculate perimeter and area of the rectangle
        int perimeter = 2*(length + width);
        int area = length * width;

        // explicit casting from int to short
        short perimeterShr = (short) perimeter;
        short areaShr = (short) area;
        // implicit casting from short to long
        long perimeterLng = (long) perimeterShr;
        long areaLng = (long) areaShr;
        // implicit casting from long to double
        double perimeterDbl = (double) perimeterLng;
        double areaDbl = (double) areaLng;

        // displaying the results
        System.out.println("The perimeter of the rectangle in integer datatype: " + perimeter);
        System.out.println("The perimeter of the rectangle in short datatype: " + perimeterShr);
        System.out.println("The perimeter of the rectangle in long datatype: " + perimeterLng);
        // using String.format to display the double value with 4 decimal places
        System.out.println("The perimeter of the rectangle in double datatype: "+ String.format("%.4f",perimeterDbl)  + "\n");

        System.out.println("The area of the rectangle in integer datatype: " + area);
        System.out.println("The area of the rectangle in short datatype: " + areaShr);
        System.out.println("The area of the rectangle in long datatype: " + areaLng);
        // using String.format to display the double value with 4 decimal places
        System.out.println("The area of the rectangle in double datatype: " + String.format("%.4f", areaDbl) + "\n");
    }
}
