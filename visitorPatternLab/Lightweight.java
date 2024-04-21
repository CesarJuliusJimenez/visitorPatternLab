package visitorPatternLab;

import java.util.*;
public class Lightweight implements LightweightRate{
    private static final Map<String, Double> lightweightMap = new HashMap<>();

    static {
        lightweightMap.put("Cupboard", 0.2);
        lightweightMap.put("Wall frame", 0.1);
        lightweightMap.put("Flower Pot", 0.4);
    }

    @Override
    public double calculateLightItem(String furniture, double price, double meters) {
        double rate = lightweightMap.getOrDefault(furniture, 0.0);
        double total = rate * price;
        double shippingFee = price + meters;
        return total + shippingFee;
    }
}
