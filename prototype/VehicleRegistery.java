
import java.util.HashMap;
import java.util.Map;

public class VehicleRegistery {
    private static final Map<String, Vehicle> registry = new HashMap<>();

    static {
        registry.put("TWO", new TwoWheelerVehicle("803 cc air-cooled and oil-cooled L-twin", 9999, "Ducati Scrambler 800", false));
        registry.put("FOUR", new FourWheelerVehicle("Quad-Turbocharged W16 Engine", 99999, "Chiron", false, false));
    }

    public static Vehicle getVehicle(String type) throws CloneNotSupportedException {
        return registry.get(type).clone();
    }

}
