package _01_Lab_WorkingWithAbstraction._4_HotelReservation;

public enum Season {
    SPRING(2),
    SUMMER(4),
    AUTUMN(1),
    WINTER(3);

    private final int factor;

    Season(int factor) {
        this.factor = factor;
    }

    public int getFactor() {
        return factor;
    }

}
