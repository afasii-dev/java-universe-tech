package furnitureApp;

public abstract class furniture {
    private String material;
    private double price;
    private color color;
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

    public furnitureApp.color getColor() {
        return color;
    }

    public void setColor(furnitureApp.color color) {
        this.color = color;
    }

    public void setIsCleaned(boolean isCleaned) {
        isCleaned = isCleaned;
    }

    public boolean getIsCleaned() {
        return isCleaned;
    }
}
