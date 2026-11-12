public class Runner {
    public static void main(String[] args) {
        try {
            Vehicle twoWheeler = VehicleRegistery.getVehicle("TWO");
            Vehicle fourWheeler = VehicleRegistery.getVehicle("FOUR");
            System.err.println(twoWheeler);
            System.err.println(fourWheeler);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
