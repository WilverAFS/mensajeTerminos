/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensajeterminos;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author Wilver
 */
public class BtnAceptar extends JButton implements MouseListener{
    
    private Color colorBtnNormal = new Color(102,204,255);
    private Color colorBtnOver = new Color(153,204,255);
    private Color colorBtnPressed = new Color(51,153,255);
    
    private Color colorTxtNormal = new Color(0,0,0);
    private Color colorTxtOver = new Color(60, 63, 65);
    private Color colorTxtPressed = new Color(255, 255, 255);
    
    public BtnAceptar() {
        this.setForeground(colorTxtNormal);
        this.setBackground(colorBtnNormal);
        this.setPreferredSize(new Dimension(100,30));
        this.setSize(100,30);
        this.setCursor(new Cursor(12));
        this.setText("Aceptar");
        addMouseListener(this);
    }

    public Color getColorBtnNormal() {
        return colorBtnNormal;
    }

    public void setColorBtnNormal(Color colorBtnNormal) {
        this.colorBtnNormal = colorBtnNormal;
        this.setBackground(this.colorBtnNormal);
    }
    
    public Color getColorBtnOver() {
        return colorBtnOver;
    }

    public void setColorBtnOver(Color colorBtnOver) {
        this.colorBtnOver = colorBtnOver;
    }

    public Color getColorBtnPressed() {
        return colorBtnPressed;
    }

    public void setColorBtnPressed(Color colorBtnPressed) {
        this.colorBtnPressed = colorBtnPressed;
    }

    public Color getColorTxtNormal() {
        return colorTxtNormal;
    }

    public void setColorTxtNormal(Color colorTxtNormal) {
        this.colorTxtNormal = colorTxtNormal;
        this.setForeground(this.colorTxtNormal);
    }

    public Color getColorTxtOver() {
        return colorTxtOver;
    }

    public void setColorTxtOver(Color colorTxtOver) {
        this.colorTxtOver = colorTxtOver;
    }

    public Color getColorTxtPressed() {
        return colorTxtPressed;
    }

    public void setColorTxtPressed(Color colorTxtPressed) {
        this.colorTxtPressed = colorTxtPressed;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.setBackground(this.colorBtnPressed);
        this.setForeground(this.colorTxtPressed);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBackground(this.colorBtnOver);
        this.setForeground(this.colorTxtOver);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(this.colorBtnNormal);
        this.setForeground(this.colorTxtNormal);
    }
    
}
