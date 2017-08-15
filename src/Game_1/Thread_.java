package Game_1;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread_ extends Thread {

    public static boolean a=true, b=true, c=true, d=true, e=true;
    /*This method adds a name for the player in the variable*/
    public Thread_(String name) {
        this.setName(name);
    }
    /*This method moves the images the players and create the time for each one*/
    @Override
    public void run() {

        if (getName().equals("Michael Phelps")) {
            
            int ti = (int) System.currentTimeMillis() / 1000;
            long ti_long = System.currentTimeMillis();

            for (int j = 0; j < 99; j++) {
                try {
                    Swimming_Race.lblswimmer1.setLocation(Swimming_Race.lblswimmer1.getLocation().x + Race.swimmer[0].getAdvance(), Swimming_Race.lblswimmer1.getLocation().y);

                    sleep(Race.swimmer[0].getSpeed());

                    if (Swimming_Race.lblswimmer1.getLocation().x > Swimming_Race.lblline.getLocation().x) {
                        int tf = (int) System.currentTimeMillis() / 1000;
                        int tt = tf - ti;
                        long tf_long = System.currentTimeMillis();
                        long tt_long = tf_long - ti_long;
                        Race.swimmer[0].setTime(tt_long);
                        j = 99;
                        a = true;
                        Reports rep  = new Reports();
                        rep.Time_long(tt_long);
                        rep.Time(tt);
                        rep.Report("Michael Phelps");
                    } else {
                        j++;
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread_.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            Swimming_Race.lblswimmer1.setLocation(Swimming_Race.lblswimmer1.getLocation().x, Swimming_Race.lblswimmer1.getLocation().y);
            this.stop();
        }

        if (getName().equals("Ian Thorphe")) {
            
            int ti = (int) System.currentTimeMillis() / 1000;
            long ti_long =  System.currentTimeMillis();
            for (int j = 0; j < 99; j++) {
                try {
                    Swimming_Race.lblswimmer2.setLocation(Swimming_Race.lblswimmer2.getLocation().x + Race.swimmer[1].getAdvance(), Swimming_Race.lblswimmer2.getLocation().y);

                    sleep(Race.swimmer[1].getSpeed());

                    if (Swimming_Race.lblswimmer2.getLocation().x > Swimming_Race.lblline.getLocation().x) {
                        int tf = (int) System.currentTimeMillis() / 1000;
                        int tt = tf - ti;
                        long tf_long = System.currentTimeMillis();
                        long tt_long = tf_long - ti_long;
                        Race.swimmer[1].setTime(tt_long);
                        j = 99;
                        b = true;
                        Reports rep  = new Reports();
                        rep.Time_long(tt_long);
                        rep.Time(tt);
                        rep.Report("Ian Thorphe");
                    } else {
                        j++;
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread_.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            Swimming_Race.lblswimmer2.setLocation(Swimming_Race.lblswimmer2.getLocation().x, Swimming_Race.lblswimmer2.getLocation().y);
            this.stop();
        }

        if (getName().equals("Ryan Lochte")) {
            
            int ti = (int) System.currentTimeMillis() / 1000;
            long ti_long =  System.currentTimeMillis();
            for (int j = 0; j < 99; j++) {
                try {
                    Swimming_Race.lblswimmer3.setLocation(Swimming_Race.lblswimmer3.getLocation().x + Race.swimmer[2].getAdvance(), Swimming_Race.lblswimmer3.getLocation().y);

                    sleep(Race.swimmer[2].getSpeed());

                    if (Swimming_Race.lblswimmer3.getLocation().x > Swimming_Race.lblline.getLocation().x) {
                        int tf = (int) System.currentTimeMillis() / 1000;
                        int tt = tf - ti;
                        long tf_long = System.currentTimeMillis();
                        long tt_long = tf_long - ti_long;
                        Race.swimmer[2].setTime(tt_long);
                        j = 99;
                        c = true;
                        Reports rep  = new Reports();
                        rep.Time_long(tt_long);
                        rep.Time(tt);
                        rep.Report("Ryan Lochte");
                    } else {
                        j++;
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            Swimming_Race.lblswimmer3.setLocation(Swimming_Race.lblswimmer3.getLocation().x, Swimming_Race.lblswimmer3.getLocation().y);
            this.stop();
        }

        if (getName().equals("Mark Spitz")) {
            
            int ti = (int) System.currentTimeMillis() / 1000;
            long ti_long =  System.currentTimeMillis();
            for (int j = 0; j < 99; j++) {
                try {
                    Swimming_Race.lblswimmer4.setLocation(Swimming_Race.lblswimmer4.getLocation().x + Race.swimmer[3].getAdvance(), Swimming_Race.lblswimmer4.getLocation().y);

                    sleep(Race.swimmer[3].getSpeed());

                    if (Swimming_Race.lblswimmer4.getLocation().x > Swimming_Race.lblline.getLocation().x) {
                        int tf = (int) System.currentTimeMillis() / 1000;
                        int tt = tf - ti;
                        long tf_long = System.currentTimeMillis();
                        long tt_long = tf_long - ti_long;
                        Race.swimmer[3].setTime(tt_long);
                        j = 99;
                        d = true;
                        Reports rep  = new Reports();
                        rep.Time_long(tt_long);
                        rep.Time(tt);
                        rep.Report("Mark Spitz");
                    } else {
                        j++;
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            Swimming_Race.lblswimmer4.setLocation(Swimming_Race.lblswimmer4.getLocation().x, Swimming_Race.lblswimmer4.getLocation().y);
            this.stop();
        }
        if (getName().equals("Alexander Popov")) {
           
            int ti = (int) System.currentTimeMillis() / 1000;
            long ti_long =  System.currentTimeMillis();

            for (int j = 0; j < 99; j++) {
                try {
                    Swimming_Race.lblswimmer5.setLocation(Swimming_Race.lblswimmer5.getLocation().x + Race.swimmer[4].getAdvance(), Swimming_Race.lblswimmer5.getLocation().y);

                    sleep(Race.swimmer[4].getSpeed());

                    if (Swimming_Race.lblswimmer5.getLocation().x > Swimming_Race.lblline.getLocation().x) {
                        int tf = (int) System.currentTimeMillis() / 1000;
                        int tt = tf - ti;
                        long tf_long = System.currentTimeMillis();
                        long tt_long = tf_long - ti_long;
                        Race.swimmer[4].setTime(tt_long);
                        j = 99;
                        e = true;
                        Reports rep  = new Reports();
                        rep.Time_long(tt_long);
                        rep.Time(tt);
                        rep.Report("Alexander Popov");
                    } else {
                        j++;
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread_.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            Swimming_Race.lblswimmer5.setLocation(Swimming_Race.lblswimmer5.getLocation().x, Swimming_Race.lblswimmer5.getLocation().y);
            this.stop();
        }

    }

}
