public class Main {
    public static void main(String[] args) {
        CarsAssemble carsAssemble = new CarsAssemble();
        int speed = 6;
        System.out.println("Cars created with speed of " + speed + " by hour are " + carsAssemble.productionRatePerHour(speed));
        System.out.println("Cars created with speed of " + speed + " by minute are " +carsAssemble.workingItemsPerMinute(speed));
    }
}