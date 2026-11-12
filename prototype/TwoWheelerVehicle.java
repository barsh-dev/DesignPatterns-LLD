public class TwoWheelerVehicle extends Vehicle {
    
    private boolean isElectric;

    public TwoWheelerVehicle(String engine, int price, String model, boolean isElectric) {
        super(engine, price, model);
        this.isElectric = isElectric;
    }

    @Override
    protected TwoWheelerVehicle clone() throws CloneNotSupportedException {
        return (TwoWheelerVehicle) super.clone();
    }

    public boolean isElectric() {
        return isElectric;
    }
    
    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return super.toString() + ", isElectric= " + isElectric;
    }

    
    
}
