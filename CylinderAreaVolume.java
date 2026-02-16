import java.util.Scanner;

class CylinderAreaVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius and height of a cylinder: ");
        double radius = sc.nextDouble();
        double height = sc.nextDouble();

        double area = 3.14 * radius * radius;
        double volume = area * height;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}