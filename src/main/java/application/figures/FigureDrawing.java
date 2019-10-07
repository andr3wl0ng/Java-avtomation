package application.figures;
import java.util.Scanner;



public class FigureDrawing {

    private int size;
    private char fChar;


    public  void ScannerForFigure(){
        Scanner emptySquareScan = new Scanner(System.in);
        System.out.println("input the size of figure: ");
        size = emptySquareScan.nextInt();

        Scanner selectChar = new Scanner(System.in);
        System.out.println("input the char for drawing: ");
        fChar = selectChar.next().charAt(0);
    }


    public void Square(){
        for (int i = 0; i < size; i++){
            for (int j = 0; j<size; j++){
                System.out.print(fChar+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("------------- ");
        System.out.println(" ");
    }



    public void EmptySquare() {
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if (i == 0 || i==size-1 || j==0 || j==size-1){
                    System.out.print(fChar+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("------------- ");
        System.out.println(" ");
    }

    public void Triangle(){

    }
}
