import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("please enter x and y values and side length:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int sideLength = input.nextInt();
        System.out.println("çalıştı, here your graphic:");
        createSquare(x,y,sideLength);
        createCircle(x,y,sideLength);
    }

    static void createXYaxis(){

        for(int i=-15 ; i<14 ; i++){
            for(int j=-15 ; j<14 ; j++){
                if(j == 0)
                    System.out.print("|");
                if(i == 0)
                    System.out.print(" -");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void createSquare(int x_index,int y_index,int length){

        int tempLength = length/2;

        for(int i=14 ; i>-15 ; i--){
            for(int j=-15 ; j<14 ; j++){

                if(j <= x_index+tempLength && j >= x_index-tempLength && i <= y_index+tempLength && i >= y_index-tempLength)
                    System.out.print(" *");
                else if(j == 0)
                    System.out.print("|");
                else if(i == 0)
                    System.out.print(" -");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void createCircle(int x_index,int y_index,int radius){

        //denklem
        //r^2 = (x-a)^2 * (x-b)^2

        int xEquationIndex;
        int yEquationIndex;

        for(int i=14 ; i>-15 ; i--){
            for(int j=-15 ; j<14 ; j++){

                if(j <= x_index+radius && j >= x_index-radius && i <= y_index+radius && i >= y_index-radius)
                    System.out.print(" *");
                else if(j == 0)
                    System.out.print("|");
                else if(i == 0)
                    System.out.print(" -");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}