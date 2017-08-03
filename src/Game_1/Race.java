package Game_1;

import java.util.Random;

public class Race {

    static Swimmer[] swimmer;
    static Random rnd;
    static int[] speed;
    static int speed_standart = 240;

    public static void Restart() {
        swimmer[0].setSpeed(speed_standart);
        swimmer[1].setSpeed(230);
        swimmer[2].setSpeed(speed_standart);
        swimmer[3].setSpeed(250);
        swimmer[4].setSpeed(100);

        swimmer[0].setAdvance(10);
        swimmer[1].setAdvance(10);
        swimmer[2].setAdvance(10);
        swimmer[3].setAdvance(10);
        swimmer[4].setAdvance(10);
    }

    public static void Register_Swimmers() {
        rnd = new Random();
        swimmer = new Swimmer[5];

        swimmer[0] = new Swimmer(0, 0, 0, 0, "-");
        swimmer[1] = new Swimmer(0, 0, 0, 0, "-");
        swimmer[2] = new Swimmer(0, 0, 0, 0, "-");
        swimmer[3] = new Swimmer(0, 0, 0, 0, "-");
        swimmer[4] = new Swimmer(0, 0, 0, 0, "-");

        swimmer[0].setName("Michael Phelps");
        swimmer[1].setName("Ian Thorphe");
        swimmer[2].setName("Ryan Lochte");
        swimmer[3].setName("Mark Spitz");
        swimmer[4].setName("Alexander Popov");

        swimmer[0].setSpeed(speed_standart);
        swimmer[1].setSpeed(230);
        swimmer[2].setSpeed(speed_standart);
        swimmer[3].setSpeed(250);
        swimmer[4].setSpeed(100);

        swimmer[0].setTime(0);
        swimmer[1].setTime(0);
        swimmer[2].setTime(0);
        swimmer[3].setTime(0);
        swimmer[4].setTime(0);

        swimmer[0].setCoorY(Swimming_Race.lblswimmer1.getLocation().y);
        swimmer[1].setCoorY(Swimming_Race.lblswimmer2.getLocation().y);
        swimmer[2].setCoorY(Swimming_Race.lblswimmer3.getLocation().y);
        swimmer[3].setCoorY(Swimming_Race.lblswimmer4.getLocation().y);
        swimmer[4].setCoorY(Swimming_Race.lblswimmer5.getLocation().y);

        swimmer[0].setCoorX(Swimming_Race.lblswimmer1.getLocation().x);
        swimmer[1].setCoorX(Swimming_Race.lblswimmer2.getLocation().x);
        swimmer[2].setCoorX(Swimming_Race.lblswimmer3.getLocation().x);
        swimmer[3].setCoorX(Swimming_Race.lblswimmer4.getLocation().x);
        swimmer[4].setCoorX(Swimming_Race.lblswimmer5.getLocation().x);

        swimmer[0].setAdvance(10);
        swimmer[1].setAdvance(10);
        swimmer[2].setAdvance(10);
        swimmer[3].setAdvance(10);
        swimmer[4].setAdvance(10);
    }

    public static void iniciar(boolean a, boolean b, boolean c, boolean d, boolean e) {

        if (a == true) {
            Thread_ h1 = new Thread_(swimmer[0].getName());
           Thread_.a = false;
            h1.start();
        }
        if (b == true) {
            Thread_ h2 = new Thread_(swimmer[1].getName());
            Thread_.b = false;
            h2.start();
        }
        if (c == true) {
            Thread_ h3 = new Thread_(swimmer[2].getName());
            Thread_.c = false;
            h3.start();
        }
        if (d == true) {
            Thread_ h4 = new Thread_(swimmer[3].getName());
            Thread_.d = false;
            h4.start();
        }
        if (e == true) {
            Thread_ h5 = new Thread_(swimmer[4].getName());
            Thread_.e = false;
            h5.start();
        }
        
    }
}
