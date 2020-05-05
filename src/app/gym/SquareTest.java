package app.gym;

import app.red.Colorable;

public class SquareTest {
    public static void main(String[] args) {
        int size = 100;
        Square[] squares = new Square[size];

        for(int i = 0; i < size; i++){
            Square square = new Square();
            if (square instanceof Colorable) {
                square.howToColor();
            }
            squares[i] = square;
        }
    }
}
