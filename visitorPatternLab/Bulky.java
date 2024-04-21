package visitorPatternLab;
import java.util.*;

public class Bulky implements BulkyRate {

    private static final Map<String, Double> bulkyMap = new HashMap<>();

    static {
        bulkyMap.put("Sofa", 0.7);
        bulkyMap.put("Table", 0.6);
        bulkyMap.put("Drawer", 0.5);
    }

    @Override
    public double calculateBulkyItem(String furniture, double price, double meters) {
        double rate = bulkyMap.getOrDefault(furniture, 0.0);
        double total = rate * price;
        double shippingFee = price + meters;
        return total + shippingFee;
    }

}
