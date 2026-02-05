public enum Frequency {
    DAILY(1),
    WEEKLY(7),
    MONTHLY(30);

    private final int days;

    Frequency(int days){
        this.days = days; 
    }

    public int getDays(){
        return days;
    }
}
