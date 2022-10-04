package view;

import java.util.Map;

public class GameMessage {
    public void getGetCarNAmeMessage(){
        System.out.println("경주할자동차이름(이름은쉼표(,)기준으로구분)");
    }
    public void getGetGameNumberMessage(){
        System.out.println("시도할 횟수");
    }

    public void getCarState(String name, int state){
        String position="";
        for(int i =0;i<state;i++){
            position+="-";
        }
        System.out.println(name +" : " + position);
    }
}
