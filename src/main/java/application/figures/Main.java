package application.figures;


public class Main {
    public static void main(String[] args) {

        FigureDrawing newScannerForFigure = new FigureDrawing();
        newScannerForFigure.ScannerForFigure();

//        FigureDrawing newObjectSquare = new FigureDrawing();
        newScannerForFigure.Square();
//       FigureDrawing newObjectEmptySquare = new FigureDrawing();
        newScannerForFigure.EmptySquare();

//        FigureDrawing newObjectEmptyTriangle = new FigureDrawing();
        newScannerForFigure.Triangle();
    }

}