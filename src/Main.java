import java.awt.*;

public class Main {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        System.out.println("3...");
        wait(1000);
        System.out.println("2...");
        wait(1000);
        System.out.println("1...");
        wait(1000);
        System.out.println("Start");
        double time = System.currentTimeMillis();
        double timea = time + 3500;
        double timeb = time + 3600;
        boolean f = true;
        boolean g = true;
        while(true){
            /*
            PointerInfo a = MouseInfo.getPointerInfo();
            Point b = a.getLocation();
            int x = (int) b.getX();
            int y = (int) b.getY();
            */
            int num = 545;
            Color color = robot.getPixelColor(num+25, 254);
            // System.out.println(x + " " + y);

           if(color.getRed()==172 && color.getGreen()==172 && color.getBlue()==172) {
               //System.out.println(color);
               jump();
           }
            if(timea<time && time<timeb && f) {
                num += 25;
                timea = time + 7500;
                timeb = time + 7600;
                f = false;
                System.out.println("First Speedup!");
            }
            /*
            else if (time >= timec && time<= timed && g) {
                num += 25;
                g = false;
                System.out.println("Second Speedup!");
            }

             */
        }
    }
    public static void wait(int x){ //sleeps for 'x' amount of ms
        try {
            Thread.sleep(x);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public static void jump() throws AWTException {
        Robot bot = new Robot();
        bot.keyPress(32);
        bot.keyRelease(32);
    }
}