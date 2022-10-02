public class Season {

    public static String getSeasonOfTheYear(int day, int month) {
        String result = "";
        if((month == 1 && day >= 1 && day <= 31) || (month == 2 && day >=1 && day
                <= 28) || (month == 3 && day >=1 && day <=31))
        {
            result = "Spring";
        }
        else if((month == 4 && day >= 1 && day <= 30) || (month == 5 && day >= 1
                && day <= 31) || (month == 6 && day >=1 && day <=30))
        {
            result = "Summer";
        }
        else if((month == 7 && day >= 1 && day <= 31) || (month == 8 && day >=1
                && day <= 31) || (month == 9 && day >= 1 && day <= 30))
        {
            result = "Autumn";
        }
        else if((month == 10 && day >= 1 && day <= 31) || (month == 11 && day >=1
                && day <= 30) || (month == 12 && day >= 1 && day <= 31))
        {
            result = "Winter";
        }
        return result;
    }
}
