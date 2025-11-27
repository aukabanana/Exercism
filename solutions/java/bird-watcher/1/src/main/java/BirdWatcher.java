
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int b : birdsPerDay){
            if(b == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int limit = 0;
        if(numberOfDays > 7){
            limit = 7;
        }else {
            limit = numberOfDays;
        }
        for(int i=0; i<limit; i++){
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyD = 0;
        for(int i=0; i<birdsPerDay.length-1; i++){
            if(birdsPerDay[i] >= 5){
                busyD++;
            }
        }
        return busyD;
    }
}
