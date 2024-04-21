package visitorPatternLab;

public class Application {

    public static void main(String[] args) {
        FurnitureDetail Sofa = new FurnitureDetail("Sofa", 2500.0, 400);
        FurnitureDetail Table = new FurnitureDetail("Table", 1500.0, 850);
        FurnitureDetail Drawer = new FurnitureDetail("Drawer", 5999.0, 600);
        FurnitureDetail Cupboard = new FurnitureDetail("Cupboard", 1200.0, 100);
        FurnitureDetail WallFrame = new FurnitureDetail("Wall Frame", 200.0, 70);
        FurnitureDetail FlowerPot = new FurnitureDetail("Flower Pot", 900.0, 50);

        LightweightRate lightweightRate = new Lightweight();
        BulkyRate bulkyRate = new Bulky();

        // Shipping fee was already added and will vary depending on the weight of the furniture.
        System.out.println("The item " + Sofa.getFurniture() + " has a total of ₱" + Sofa.accept(bulkyRate, Sofa.getPrice(), Sofa.getDistance()) + " and will be shipped by our courier.");
        System.out.println("The item " + Table.getFurniture() + " has a total of ₱" + Table.accept(bulkyRate, Table.getPrice(), Table.getDistance()) + " and will be shipped by our courier.");
        System.out.println("The item " + Drawer.getFurniture() + " has a total of ₱" + Drawer.accept(bulkyRate, Drawer.getPrice(), Drawer.getDistance()) + " and will be shipped by our courier.");
        System.out.println("The item " + Cupboard.getFurniture() + " has a total of ₱" + Cupboard.accept(lightweightRate, Cupboard.getPrice(), Cupboard.getDistance()) + " and will be shipped by our courier.");
        System.out.println("The item " + WallFrame.getFurniture() + " has a total of ₱" + WallFrame.accept(lightweightRate, WallFrame.getPrice(), WallFrame.getDistance()) + " and will be shipped by our courier.");
        System.out.println("The item " + FlowerPot.getFurniture() + " has a total of ₱" + FlowerPot.accept(lightweightRate, FlowerPot.getPrice(), FlowerPot.getDistance()) + " and will be shipped by our courier.");

    }
}