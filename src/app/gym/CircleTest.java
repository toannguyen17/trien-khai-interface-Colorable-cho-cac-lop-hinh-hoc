package app.gym;

import app.red.Colorable;

public class CircleTest {
    public static void main(String[] args) {
        int size = 100;
        Circle[] circles = new Circle[size];

        for(int i = 0; i < size; i++){
            Circle circle = new Circle();
            if (circle instanceof Colorable) {
                circle.howToColor();
            }
            circles[i] = circle;
        }
    }
}
