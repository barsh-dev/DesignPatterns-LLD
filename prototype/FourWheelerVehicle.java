public class FourWheelerVehicle extends Vehicle {
    private boolean isElectric;
    private boolean isDiseal;

    public FourWheelerVehicle(String engine, int price, String model, boolean isElectric, boolean isDiseal) {
        super(engine, price, model);
        this.isElectric = isElectric;
        this.isDiseal = isDiseal;
    }

    @Override
    protected FourWheelerVehicle clone() throws CloneNotSupportedException {
        return (FourWheelerVehicle) super.clone();
    }

    public boolean isElectric() {
        return isElectric;
    }
    
    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public boolean isDiseal() {
        return isDiseal;
    }

    public void setDiseal(boolean isDiseal) {
        this.isDiseal = isDiseal;
    }

    @Override
    public String toString() {
        return super.toString() +", isElectric= " + isElectric + ", isDiseal= " + isDiseal;
    }

}
