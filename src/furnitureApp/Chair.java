package furnitureApp;

public class Chair extends Furniture {

    @Override
    void clean() {
        if (super.getIsCleaned() == false) {
            System.out.println("Cleaning Chair!");
            super.setIsCleaned(true);
        } else {
            System.out.println("Chair is clean");
        }
    }

    public Chair() {
        System.out.println("Creating chair");
    }

    public Chair(String material, double price, Color color, boolean isCleaned){
        this.setMaterial(material);
        this.setPrice(price);
        this.setColor(color);
        this.setIsCleaned(isCleaned);
    }

    @Override
    boolean build() {
        return false;
    }
}
