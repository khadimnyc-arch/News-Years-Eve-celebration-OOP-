// Times Square New Year's Eve Scene with Perspective
// Starter code - students will add confetti particles
import java.util.*;
import processing.core.PApplet;

public class Sketch extends PApplet {
    Confetti[] confetti = new Confetti[150];
    public void setup(){
        textAlign(CENTER,CENTER);
        for(int i =0; i<confetti.length;i++){
            confetti[i] = new Confetti();
        }
        
    }

    public void settings() {
         size(800, 600);
    } // end settings method

    public void draw() {
        // Night sky background
        background(10, 15, 35);
        
        // Draw from back to front for proper layering
        drawSideBuildings();
        drawBillboards();
        drawCenterBuilding();
        
        // TODO: Students will add confetti here!
        // Hint: confetti closer to camera should be larger and fall faster
        for(int i = 0; i < confetti.length; i++){
        fill(confetti[i].getR(),confetti[i].getG(),confetti[i].getB());
        rect(confetti[i].getXPos(),confetti[i].getYPos(),confetti[i].getsize(),confetti[i].getsize());
        confetti[i].fall((int)((Math.random()*4)+1));
        }




    } // end draw method

    public void drawSideBuildings() {
        // LEFT BUILDING - angles inward toward center
        fill(30, 35, 55);
        quad(0, 50,     
            250, 150,   
            250, 600,   
            0, 600);    
        
        // RIGHT BUILDING - angles inward toward center
        fill(28, 32, 52);
        quad(550, 150,  
            800, 50,    
            800, 600,   
            550, 600);  
    } // end drawSideBuildings method

    public void drawBillboards() {
        // LEFT SIDE BILLBOARDS (angled perspective)
        
        // Orange billboard - top
        fill(255, 100, 20);
        quad(20, 180, 220, 240, 220, 310, 20, 270);
        fill(255);
        textSize(18);
        text("BROADWAY", 120, 260);
        
        // Blue billboard
        fill(20, 100, 200);
        quad(20, 320, 220, 360, 220, 430, 20, 400);
        fill(255);
        text("TIMES SQUARE", 120, 380);
        
        // Green billboard  
        fill(50, 200, 100);
        quad(20, 450, 220, 480, 220, 550, 20, 520);
        
        // RIGHT SIDE BILLBOARDS (angled perspective)
        
        // Magenta billboard - "BIGGEST PARTY"
        fill(200, 20, 150);
        quad(580, 240, 780, 180, 780, 270, 580, 310);
        fill(255);
        text("BIGGEST", 680, 240);
        text("PARTY!", 680, 265);
        
        // Purple billboard
        fill(100, 20, 180);
        quad(580, 360, 780, 320, 780, 400, 580, 430);
        fill(255);
        text("NYC", 680, 375);
        
        // Yellow billboard
        fill(220, 180, 30);
        quad(580, 480, 780, 450, 780, 520, 580, 550);
        fill(255);
        text("2025", 680, 500);
    } // end drawBillboards method

    public void drawCenterBuilding() {
        // Main center building (ball drop tower)
        // This is the focal point - straight and centered
        
        fill(35, 45, 75);
        rect(325, 120, 150, 480);
        
        // Top of building detail
        fill(45, 55, 85);
        rect(325, 120, 150, 40);
        
        // The Ball Drop Ball
        fill(200, 220, 255);
        circle(400, 180, 60);
        
        // Ball details (geometric pattern)
        stroke(255, 255, 200);
        strokeWeight(2);
        noFill();
        circle(400, 180, 60);
        circle(400, 180, 45);
        circle(400, 180, 30);
        strokeWeight(1);
        stroke(0);
        
        // Main display screen
        fill(15, 40, 90);
        rect(340, 250, 120, 180);
        
        // Year display
        fill(255);
        textSize(56);
        text("2025", 400, 310);
        
        // Happy New Year
        textSize(24);
        text("HAPPY", 400, 370);
        text("NEW YEAR", 400, 400);
    } // end drawCenterBuilding method

    

} // end Sketch class
