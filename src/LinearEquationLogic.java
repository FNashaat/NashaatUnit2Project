import java.util.Scanner;
public class LinearEquationLogic {
    private LinearEquation linear;
    private Scanner myScanner;

    public LinearEquationLogic(){
        linear = null;
        myScanner = new Scanner(System.in);
    }

    private void getDataPoints(){
        System.out.println("Welcome to the linear equation calculator!");
        System.out.println("Enter coordinate 1: ");
        int coord1 = myScanner.nextInt();
        System.out.println("Enter coordinate 2: ");
        int coord2 = myScanner.nextInt();
        System.out.println();
        System.out.println("The two points are: " + coord1 + " and " + coord2);

        int x1 = Integer.parseInt();

    }

    public void start(){
        getDataPoints();
    }
}
