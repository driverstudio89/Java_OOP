package _01_Lab_WorkingWithAbstraction._4_HotelReservation;

public class PriceCalculator {

    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private DiscountType discountType;

    public PriceCalculator(double pricePerDay, int numberOfDays, Season season, DiscountType discountType){
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discountType = discountType;
    }

    public double calculatePrice() {
        return pricePerDay * numberOfDays * season.getFactor() * discountType.getDiscount();
    }
}
