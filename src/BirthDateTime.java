import java.util.Scanner;


public class BirthDateTime
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthYear, birthMonth, birthHour, birthMinute;
        int birthDay = 0;
        birthYear = SafeInput.getRangedInt(in,"What year were you born between 1950-2015?", 1950, 2015);
        birthMonth = SafeInput.getRangedInt(in,"What month were you born between 1-12?", 1, 12);
        switch(birthMonth){
            case 2:
                birthDay = SafeInput.getRangedInt(in,"What day were you born between 1-29?", 1, 29);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                birthDay = SafeInput.getRangedInt(in,"What day were you born between 1-30?", 1, 30);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                birthDay = SafeInput.getRangedInt(in,"What day were you born between 1-31?", 1, 31);
                break;
        }
        birthHour = SafeInput.getRangedInt(in,"What hour were you born between 0-23?", 0,23 );
        birthMinute = SafeInput.getRangedInt(in,"What minute were you born between 0-59?", 0, 59);
        System.out.println("\nYou were birth time is: Year: " + birthYear + " Month: " + birthMonth + " Day: " + birthDay +" Hour: " + birthHour + " Minute: " + birthMinute);
    }
}

