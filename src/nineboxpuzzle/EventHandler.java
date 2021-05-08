package nineboxpuzzle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener{
    
    private int positionX;
    private int positionY;
    private GameDriver gameEngine;

    @Override
    public void actionPerformed(ActionEvent e) {
        gameEngine.makeMove(positionX, positionY);
    }
    
    EventHandler(GameDriver gameEngine, int positionX, int positionY) {
        this.gameEngine = gameEngine;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
}
