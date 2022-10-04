package service;

import camp.nextstep.edu.missionutils.Console;
import domain.Car;
import utils.SplitCarName;
import view.GameMessage;

public class GameService {

   Car car;
   GameMessage gameMessage = new GameMessage();
   SplitCarName splitCarName;
   public void setGame(){
      car = setCarName();
   }

   private Car setCarName() {
      gameMessage.getStartMessage();
      return getCarNameByUser(Console.readLine());
   }

   private Car getCarNameByUser(String input) {
      splitCarName = new SplitCarName(input);
      try {
         car = new Car(splitCarName.getCarName());
         return car;
      } catch (IllegalArgumentException e){
         System.out.println(e);
         return setCarName();
      }

   }

}


