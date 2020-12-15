package com.company;


public class Movement {

   public void run(Clock clock){
       int countMinutes = 1;
       boolean stop = false;
       while(!stop ){
           int currentBall = clock.getAllBalls().getFirstBall();
           if (! clock.getMinuteTrack().addBall(currentBall)) {
               clock.getAllBalls().copyAndRemove(clock.getMinuteTrack());
               if (! clock.getFiveMinuteTrack().addBall(currentBall)) {
                   clock.getAllBalls().copyAndRemove(clock.getFiveMinuteTrack());
                   if (! clock.getOneHourTrack().addBall(currentBall)) {
                       clock.getAllBalls().copyAndRemove(clock.getOneHourTrack());
                       clock.getAllBalls().addBall(currentBall);
                   }
               }
           }
           stop = validateWithInitialOrder(clock.getAllBalls());
          /* System.out.println("iteracion m: "+ countMinutes);
           System.out.println(clock.getAvailableBalls().toString());
           System.out.println(clock.getOneMinuteQueue().toString());
           System.out.println(clock.getFiveMinuteQueue().toString());
           System.out.println(clock.getOneHourQueue().toString());
*/
           if (stop) {
               System.out.println(clock.getAllBalls().getSize()+ " balls cycle after "+ countMinutes/(24*60)+" days");
           }
        countMinutes++;
       }
}

    private boolean validateWithInitialOrder(TrackQueue availableBalls) {
       for (int i =0; i< availableBalls.getSize(); i++){
            if(availableBalls.getQueue().get(i)!= i){
                return false;
            }
       }
       return true;
    }
}
