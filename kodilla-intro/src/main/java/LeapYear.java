public class LeapYear {
    public static void main(String[] args){
        int exampleYear = 2002;

        System.out.println(leapYear(exampleYear));
    }

    private static boolean leapYear(int year){
        if(year%4==0) {
            if(year%100==0){
                return year % 400 == 0;
            }
            return true;
        }

        else return false;
    }
}
