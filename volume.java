import java.util.Scanner;

class Volume{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();

        System.out.println("Enter the height: ");
        double height = sc.nextDouble();

        double volume = Math.PI * Math.pow(radius,2) * height;


        System.out.println("Area is "+ volume);


    }
}