public class Vehicle implements Cloneable {
    private String engine;
    private int price;
    private String model;

    public Vehicle(String engine, int price, String model) {
        this.engine = engine;
        this.price = price;
        this.model = model;
    }

    @Override
    protected Vehicle clone() throws CloneNotSupportedException {
        return (Vehicle) super.clone();
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "engine= " + engine + ", price= " + price + ", model= " + model;
    }

    

}
