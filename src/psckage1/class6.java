package psckage1;

public class class6 {
    public static void main(String []args){
        int accidents=2;
        double basic =500;
        // 1 accidents =$50
        // 2 accidents =$120
        // 3 accidents =$220
        // 4 accidents  =$370
        // 5 accidents =$570
        // 6 or more accidents = no insurance

        if (accidents==1){
            System.out.println(500+50);

        }else if(accidents==2){
            System.out.println(500+120);
        }else if(accidents==3){
            System.out.println(500+220);
        }else if(accidents==4){
            System.out.println(500+370);
        }else if(accidents==5){
            System.out.println(500+570);
        }else if(accidents>=6){
            System.out.println("no insurance");
        }else{
            System.out.println("wrong writing");
        }


    }

}
