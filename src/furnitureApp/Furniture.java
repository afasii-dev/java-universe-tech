package furnitureApp;

public abstract class Furniture {
    private String material;
    private double price;
    private Color color;
    private boolean isCleaned;

    abstract void clean();
    abstract boolean build();

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean getIsCleaned() {
        return isCleaned;
    }

    public void setIsCleaned(boolean isCleaned) {
        this.isCleaned = isCleaned;
    }
}
