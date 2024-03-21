public class CarsAssemble {
    public double productionRatePerHour(int speed) {
        double productionRatePerHour = 0;
        switch(speed){
            case 1 -> productionRatePerHour=speed*221;
            case 2 -> productionRatePerHour=speed*221;
            case 3 -> productionRatePerHour=speed*221;
            case 4 -> productionRatePerHour=speed*221;
            case 5 -> productionRatePerHour=(speed*221)*0.9;
            case 6 -> productionRatePerHour=speed*221*0.9;
            case 7 -> productionRatePerHour=speed*221*0.9;
            case 8 -> productionRatePerHour=speed*221*0.9;
            case 9-> productionRatePerHour=speed*221*0.8;
            case 10 -> productionRatePerHour=speed*221*0.77;
        };
        return productionRatePerHour;
    }
}
