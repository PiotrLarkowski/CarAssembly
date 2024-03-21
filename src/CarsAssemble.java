public class CarsAssemble {
    public double productionRatePerHour(int speed) {
        double productionRatePerHour = 0;
        switch(speed){
            case 1, 2, 3, 4 -> productionRatePerHour=speed*221;
            case 5, 6, 7, 8 -> productionRatePerHour=(speed*221)*0.9;
            case 9-> productionRatePerHour=speed*221*0.8;
            case 10 -> productionRatePerHour=speed*221*0.77;
        };
        return productionRatePerHour;
    }
    public int workingItemsPerMinute(int speed) {
        double doubleValueOfProductionRatePerMinute = 0;
        switch(speed){
            case 1 -> doubleValueOfProductionRatePerMinute=(speed*221)/60;
            case 2 -> doubleValueOfProductionRatePerMinute=(speed*221)/60;
            case 3 -> doubleValueOfProductionRatePerMinute=(speed*221)/60;
            case 4 -> doubleValueOfProductionRatePerMinute=(speed*221)/60;
            case 5 -> doubleValueOfProductionRatePerMinute=(speed*221*0.9)/60;
            case 6 -> doubleValueOfProductionRatePerMinute=(speed*221*0.9)/60;
            case 7 -> doubleValueOfProductionRatePerMinute=(speed*221*0.9)/60;
            case 8 -> doubleValueOfProductionRatePerMinute=(speed*221*0.9)/60;
            case 9 -> doubleValueOfProductionRatePerMinute=(speed*221*0.8)/60;
            case 10 -> doubleValueOfProductionRatePerMinute=(speed*221*0.77)/60;
        };
        int intValueOfProductionRatePerMinute = (int)doubleValueOfProductionRatePerMinute;
        return intValueOfProductionRatePerMinute;
    }
}
