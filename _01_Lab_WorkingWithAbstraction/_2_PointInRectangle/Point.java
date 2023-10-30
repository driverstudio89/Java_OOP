package _01_Lab_WorkingWithAbstraction._2_PointInRectangle;

public class Point {

    private int coordinatesX;
    private int coordinatesY;

    public Point(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }

    public int getX() {
        return coordinatesX;
    }

    public int getY() {
        return coordinatesY;
    }

}
