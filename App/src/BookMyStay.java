import java.util.*;

class AddonService {

    private String serviceName;
    private double cost;

    public AddonService(String serviceName, double cost) {
        this.serviceName = serviceName;
        this.cost = cost;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getCost() {
        return cost;
    }
}

class AddOnServiceManager {

    private Map<String, List<AddonService>> servicesByReservation;

    public AddOnServiceManager() {
        servicesByReservation = new HashMap<>();
    }

    public void addService(String reservationId, AddonService service) {

        servicesByReservation
                .computeIfAbsent(reservationId, k -> new ArrayList<>())
                .add(service);
    }

    public double calculateTotalServiceCost(String reservationId) {

        List<AddonService> services = servicesByReservation.get(reservationId);

        double total = 0;

        if (services != null) {
            for (AddonService s : services) {
                total += s.getCost();
            }
        }

        return total;
    }
}

public class BookMyStay {

    public static void main(String[] args) {

        System.out.println("Add-On Service Selection");

        String reservationId = "Single-1";

        AddOnServiceManager manager = new AddOnServiceManager();

        manager.addService(reservationId, new AddonService("Breakfast", 500.0));
        manager.addService(reservationId, new AddonService("Spa", 1000.0));

        double totalCost = manager.calculateTotalServiceCost(reservationId);

        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Total Add-On Cost: " + totalCost);
    }
}