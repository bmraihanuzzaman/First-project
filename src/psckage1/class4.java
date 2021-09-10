package psckage1;

public class class4 {
    public static void main(String[] args) {
//if income less than $25000 is considered to low income.
        //if income $25001-$78000 lower middle income.
        //if income $78001-$187000 upper middle income.
        //if income $187001/+ upper income.
        int income = 30000;

        if (income < 25000) {
            System.out.println("low income");
        } else if (income >= 25001 && income <= 78000) {
            System.out.println("lower middle income");
        } else if (income >= 78001 && income <= 187000) {
            System.out.println("upper middle income");
        } else if (income > 187001) {
            System.out.println("upper income");
        } else {
            System.out.println("out put print");

        }
    }
}




    






