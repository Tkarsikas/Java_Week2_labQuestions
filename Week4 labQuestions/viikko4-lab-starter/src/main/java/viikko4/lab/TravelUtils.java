package viikko4.lab;

public final class TravelUtils {
    private TravelUtils() {
    }

    public static Double sumTravelTimes(Vehicle[] arr, Double km) {
        double sum=0;
        
        if(arr != null && km != null && km>0){
            for (Vehicle vehicle : arr) {
                if(vehicle == null){
                    continue;
                }
                sum += vehicle.travelTimeHours(km);
            }
        }else{
            throw new IllegalArgumentException("Väärä arvo! TravelUtils");
        }
        return sum;
    }
}