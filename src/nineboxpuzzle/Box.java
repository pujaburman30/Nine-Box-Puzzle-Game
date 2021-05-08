package nineboxpuzzle;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Box extends JButton {
    private int positionX;
    private int positionY;
    
    public int getPositionX() {
        return positionX;
    }
    
    public int getPositionY() {
        return positionY;
    }
    
    Box(int positionX, int positionY, int num) {
        super(String.valueOf(num));
        this.positionX = positionX;
        this.positionY = positionY;
        setBackground(Color.WHITE);
        setFont(new Font("Tahoma", Font.BOLD, 20));
        setFocusable(false);
    }
}
