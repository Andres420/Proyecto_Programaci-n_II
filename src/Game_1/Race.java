package Game_1;

import java.util.Random;

public class Race {

    static Swimmer[] swimmer;
    static Random rnd;
    static int[] speed;
    static int speed_standart = 240;

    public static void Register_Horses() {
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
        swimmer[1].setSpeed(speed_standart);
        swimmer[2].setSpeed(speed_standart);
        swimmer[3].setSpeed(speed_standart);
        swimmer[4].setSpeed(speed_standart);

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

    }

    public static void iniciar() {

        Thread_ h1 = new Thread_(swimmer[0].getName());
        h1.start();

        Thread_ h2 = new Thread_(swimmer[1].getName());
        h2.start();

        Thread_ h3 = new Thread_(swimmer[2].getName());
        h3.start();

        Thread_ h4 = new Thread_(swimmer[3].getName());
        h4.start();

        Thread_ h5 = new Thread_(swimmer[4].getName());
    }
}
