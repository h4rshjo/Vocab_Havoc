/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.TimerTask;

/**
 *
 * @author Ryoji
 */
public class MyTimerTask extends TimerTask{

    Game myGame;

    MyTimerTask(Game myGame) {
        this.myGame = myGame;
    }
    
    public void run() {
        increment();
        myGame.getSec().setText(Integer.toString(myGame.num));
        myGame.getMin().setText(Integer.toString(myGame.num2) + " :");
        
        if (myGame.checker == 5){
            myGame.timer.cancel();
            
        }
         
            
    }
    
    public void increment(){
        
        if (myGame.num < 60){
            myGame.num++;
        }  
        else{
            myGame.num = myGame.num % 60;
            
        }
        
        if(myGame.num == 59){
            myGame.num2++;
        }
    }
}
