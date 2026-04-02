package viikko4.lab;

public class Bike extends Vehicle {
    private Double avgSpeedKmh;

    public Bike(String name, Double s) {
        super(name);
        
        if(s != null && s>0){
            this.avgSpeedKmh = s;
        }else{
            throw new IllegalArgumentException("Väärä arvo! Bike");
        }
    }
    
    @Override
    public Double travelTimeHours(Double km) {
        if(km !=null && km>0){
            return km/avgSpeedKmh;
        }else{
            throw new IllegalArgumentException("Väärä arvo! Bike");
        }
    }
}
