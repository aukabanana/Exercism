public class JedliksToyCar {
    
    public int distance = 0;
    public int battery = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.distance + " meters";
    }

    public String batteryDisplay() {
        if (battery == 0) {
            return "Battery empty";
        }else {
            return "Battery at " + this.battery + "%";
        }
    }

    public void drive() {
        if(battery >= 1) {
            this.distance += 20;
            this.battery -= 1;
        }
    }
}
