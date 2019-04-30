package сreat_message;


public class TimeCalculation {

    public String getPartOfDay(int hours){
        if ((hours>=6)&&(hours<9)){
            return new Morning().timesOfDay();
        }else if ((hours>=9)&&(hours<19)){
            return new Day().timesOfDay();
        }else if ((hours>=19)&&(hours<23)){
            return new Evening().timesOfDay();
        }else if ((hours==23)&&(hours<6)&&(hours>=0)){
            return new Night().timesOfDay();
        }else {
            return null;
        }
    }
}
