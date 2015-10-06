/*************************************
 **          Lucas Rotun            **
 ** Lab04B - The purpose of this    **
 **    program is to demonstrate    **
 **   knowledge of calling methods, **
 **    and use correct parameter    **
 **    passing with some of the     **
 **     graphics methods found      **
 **      in the Expo class.         **
 *************************************/


import java.awt.*;
import java.applet.*;


public class Lab04Bst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        Expo.drawRectangle(g,100,100,300,300);
        Expo.drawRectangle(g,50,50,250,250);
        Expo.drawLine(g,100,100,50,50);
        Expo.drawLine(g,300,300,250,250);
        Expo.drawLine(g,100,300,50,250);
        Expo.drawLine(g,300,100,250,50);






        // DRAW TARGET 
        Expo.setColor(g,Expo.black);
        Expo.fillCircle(g,600,200,125);
        Expo.setColor(g,Expo.white);
        Expo.fillCircle(g,600,200,100);
        Expo.setColor(g,Expo.blue);
        Expo.fillCircle(g,600,200,75);
        Expo.setColor(g,Expo.red);
        Expo.fillCircle(g,600,200,50);
        Expo.setColor(g,Expo.yellow);
        Expo.fillCircle(g,600,200,25);
        
        
       
  






        // DRAW TRIANGLE
        Expo.setColor(g,Expo.black);
        Expo.drawLine(g,700,650,900,650);
        Expo.drawLine(g,800,650,800,450);
        Expo.drawLine(g,700,650,800,450);
        Expo.drawLine(g,900,650,800,450);
        Expo.drawLine(g,700,650,840,530);
        Expo.drawLine(g,900,650,760,530);






        // DRAW SMILEY FACE
        Expo.drawOval(g,625,800,80,120);
        Expo.drawCircle(g,655,760,18);
        Expo.drawCircle(g,595,760,18);
        Expo.drawPoint(g,595,760);
        Expo.drawPoint(g,655,760);
        Expo.drawArc(g,595,760,25,30,300,60);
        Expo.drawArc(g,655,760,25,30,300,60);
        Expo.drawArc(g,625,825,60,25,90,270);


        
        
        
        // DRAW JPII
        Expo.fillRectangle(g,50,565,75,625);
        Expo.fillRectangle(g,50,595,125,625);
        Expo.fillRectangle(g,115,625,150,500);
        Expo.fillRectangle(g,200,500,175,625);
        Expo.fillRectangle(g,175,500,250,530);
        Expo.fillRectangle(g,250,530,225,570);
        Expo.fillRectangle(g,250,570,175,550);
        Expo.fillRectangle(g,300,500,450,530); 
        Expo.fillRectangle(g,300,625,450,595); 
        Expo.fillRectangle(g,325,500,360,600);
        Expo.fillRectangle(g,425,500,390,600);
       





    }

}


