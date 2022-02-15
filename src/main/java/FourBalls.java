import processing.core.PApplet;

public class FourBalls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int SPEED1 = 0;
    int SPEED2 = 0;
    int SPEED3 = 0;
    int SPEED4 = 0;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle1((float) (HEIGHT * 0.2));
        drawCircle2((float) (HEIGHT * 0.4));
        drawCircle3((float) (HEIGHT * 0.6));
        drawCircle4((float) (HEIGHT * 0.8));

    }

    private void drawCircle1(float y) {
        ellipse(SPEED1,y,DIAMETER, DIAMETER);
        SPEED1 += 1;
    }
    private void drawCircle2(float y) {
        ellipse(SPEED2,y,DIAMETER, DIAMETER);
        SPEED2 += 2;
    }
    private void drawCircle3(float y) {
        ellipse(SPEED3,y,DIAMETER, DIAMETER);
        SPEED3 += 3;
    }
    private void drawCircle4(float y) {
        ellipse(SPEED4,y,DIAMETER, DIAMETER);
        SPEED4 += 4;
    }
}
