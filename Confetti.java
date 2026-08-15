import processing.core.PApplet;

public class Confetti {
    //instance varaibles 
    private int xPos;
    private int yPos;
    private int size;
    private int r,g,b;

    //constructer/methods
    public Confetti(int x,int y, int s){
        xPos = x;
        yPos = y;
        size = s;
    }

    public Confetti(){
        xPos = (int)(Math.random()*700)+50;
        yPos = 0;
        size = 20;
        r = (int)(Math.random()*256);
        g= (int)(Math.random()*256);
        b= (int)(Math.random()*256);
    }

    //other methods
    public int getXPos() {return xPos;}

    public int getYPos() {return yPos;}

    public int getsize() {return size;}

    public int getR(){return r;}

    public int getG(){return g;}

    public int getB(){return b;}


    public void fall(int speed) {
        yPos += speed;
        xPos += (int)(Math.random()*10-5);
        if (yPos>600) {
            yPos = 0;
        }
    }
}
