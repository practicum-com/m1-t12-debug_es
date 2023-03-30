class Petrol1Calculator {
    double price = 2.35;

    public double calculate(double volume, double discount) {
        double fullPrice = price * (1 + discount);
        return volume * fullPrice;
    }
}
