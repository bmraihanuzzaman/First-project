package psckage1;

public class class5 {
    public static void main(String[]args){
        int years = 13;
        int salary=10000;
        //more than 5 years 5% bonus
        //more than 10 years 10% bonus
        //more than 15 years 30% bonus
        if(years>=5 && years<10){
            System.out.println(salary*0.05);
        }else if(years>=10 && years<15){
            System.out.println(salary*0.10);
        }else if(years>=15){
            System.out.println(salary*0.30);
        }else{
            System.out.println("you cannot get bonus");
        }
    }
}
