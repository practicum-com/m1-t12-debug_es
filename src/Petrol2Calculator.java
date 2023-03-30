class Petrol2Calculator {
    double price = 2.74;

    public double calculate(double volume, double discount) {
        double fullPrice = price * (1 + discount);
        return volume * fullPrice;
    }
}
