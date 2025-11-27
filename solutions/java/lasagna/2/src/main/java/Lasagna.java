public class Lasagna {
    
    public int expectedMinutesInOven(){
        return 40;
    }
    
    public int remainingMinutesInOven(int minute){
        return Math.abs(minute - 10);
    }
    
    public int preparationTimeInMinutes(int minute){
        return minute * 2;
    }
    
    public int totalTimeInMinutes(int prepare , int minute){
        return (prepare * 2) + minute;
    }
    
}
