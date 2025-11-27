public class Lasagna {
    
    public int expectedMinutesInOven(){
        return 40;
    }
    
    public int remainingMinutesInOven(int minuteInOven){
        return 40 - minuteInOven;
    }
    
    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }
    
    public int totalTimeInMinutes(int layers , int minuteInOven){
        return (layers * 2) + minuteInOven;
    }
}
