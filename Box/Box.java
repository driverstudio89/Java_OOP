package Box;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) throws IllegalAccessException {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) throws IllegalAccessException {
            if (length < 1) {
                throw new IllegalAccessException("Length cannot be zero or negative.");
            }
        this.length = length;
    }

    private void setWidth(double width) throws IllegalAccessException {
        if (width < 1) {
            throw new IllegalAccessException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) throws IllegalAccessException {
        if (height < 1) {
            throw new IllegalAccessException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public double calculateSurfaceArea() {
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }

    public double calculateLateralSurfaceArea() {
        return 2 * length * height + 2 * width * height;
    }

    public double calculateVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f%n" +
                            "Lateral Surface Area - %.2f%n" +
                            "Volume – %.2f%n", calculateSurfaceArea(), calculateLateralSurfaceArea(), calculateVolume());
    }

}
