package visitorPatternLab;

public interface CostCalculator {
    public double accept(LightweightRate lightweightRate, double price, double meters);
    public double accept(BulkyRate bulkyRate, double price, double meters);

}

