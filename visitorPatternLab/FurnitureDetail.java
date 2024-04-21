package visitorPatternLab;

public class FurnitureDetail {

    private String furniture;
    private double price;
    private double meters;

    public FurnitureDetail(String furniture, double price, double meters){
        this.furniture = furniture;
        this.price = price;
        this.meters = meters;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDistance() {
        return meters;
    }

    public void setDistance(double meters) {
        this.meters = meters;
    }

    public double accept(BulkyRate bulkyRate, double price, double meters) {
        this.price = price;
        return bulkyRate.calculateBulkyItem(furniture, price, meters);
    }

    public double accept(LightweightRate lightweightRate, double price, double meters) {
        this.price = price;
        return lightweightRate.calculateLightItem(furniture, price, meters);
    }

}
