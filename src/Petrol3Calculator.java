class Petrol3Calculator {
    double price = 3.55;
    double tax = 0.02;

    public double calculate(double volume, double discount) {
        double fullPrice = price * (1 + tax - discount);
        return volume * fullPrice;
    }
}
