import java.util.Scanner;
import java.text.DecimalFormat;
public class cylinder{
    private final DecimalFormat df = new DecimalFormat("0.00");
    private double radius, height;
    private double cylinderVolume, surfaceArea;
    private Scanner sc = new Scanner(System.in);

    private void setCylinderVolume(double radius, double height){
        cylinderVolume = Math.PI * Math.pow(radius, 2) * height;
    }
    private double getVolume(){
        return cylinderVolume;
    }
    private void setSurfaceArea(double radius, double height){
        surfaceArea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }
    private double getSurfaceArea(){
        return surfaceArea;
    }
    private void userInputRadius(){
        System.out.print("Enter Radius: ");
        radius = sc.nextDouble();
    }
    private void userInputHeight(){
        System.out.print("Enter Height: ");
        height = sc.nextDouble();
    }
    private void equationOption(){
        System.out.println("\nPick equation: \n1.) Volume of Cylinder\n2.) Surface Area of Cylinder");
        int chosen = sc.nextInt();
        switch(chosen){
            case 1 -> {
                setCylinderVolume(radius, height); 
                System.out.println("\nV = " + df.format(getVolume()));
            }
            case 2 -> {
                setSurfaceArea(radius, height); 
                System.out.println("\nA = " + df.format(getSurfaceArea()));
            }
        }
    }
    public void startUp(){
        userInputRadius();
        userInputHeight();
        equationOption();
    }
}
