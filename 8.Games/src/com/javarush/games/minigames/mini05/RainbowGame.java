package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Цвета радуги
*/

public class RainbowGame extends Game {

    //напишите тут ваш код
    public void initialize() {
        setScreenSize(10, 7);

            for (int j = 0; j < 10; j++) {
                setCellColor(j,0,Color.RED);
            }
            for (int j = 0; j < 10; j++) {
                setCellColor(j,1,Color.ORANGE);
            }
            for (int j = 0; j < 10; j++) {
                setCellColor(j,2,Color.YELLOW);
            }
            for (int j = 0; j < 10; j++) {
                setCellColor(j,3,Color.GREEN);
            }
            for (int j = 0; j < 10; j++) {
                setCellColor(j,4,Color.BLUE);
            }
            for (int j = 0; j < 10; j++) {
                setCellColor(j,5,Color.INDIGO);
            }
            for (int j = 0; j < 10; j++) {
                setCellColor(j,6,Color.VIOLET);
            }



    }
}
