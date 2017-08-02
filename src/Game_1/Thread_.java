package Game_1;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread_ extends Thread {

    public Thread_(String name) {
        this.setName(name);
    }

    @Override
    public void run() {

        if (getName().equals("Michael Phelps")) {

            int ti = (int) System.currentTimeMillis() / 1000;

            for (int j = 0; j < 99; j++) {
                try {
                    Swimming_Race.lblswimmer1.setLocation(Swimming_Race.lblswimmer1.getLocation().x + Race.swimmer[0].getAdvance(), Swimming_Race.lblswimmer1.getLocation().y);

                    sleep(Race.swimmer[0].getSpeed());

                    if (Swimming_Race.lblswimmer1.getLocation().x > Swimming_Race.lblline.getLocation().x) {
                        int tf = (int) System.currentTimeMillis() / 1000;
                        int tt = tf - ti;
                        Race.swimmer[0].setTime(tt);
                        //Agregar el tiempo si quiero
                        //frmInicio.txtR.append("\n" + this.getName() + ":" + carrera.losCaballos[0].getTiempo() + " ms");
                        j = 99;
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
            for (int j = 0; j < 99; j++) {
                try {
                    Swimming_Race.lblswimmer2.setLocation(Swimming_Race.lblswimmer2.getLocation().x + Race.swimmer[1].getAdvance(), Swimming_Race.lblswimmer2.getLocation().y);

                    sleep(Race.swimmer[1].getSpeed());

                    if (Swimming_Race.lblswimmer2.getLocation().x > Swimming_Race.lblline.getLocation().x) {
                        int tf = (int) System.currentTimeMillis() / 1000;
                        int tt = tf - ti;
                        Race.swimmer[1].setTime(tt);
                        //Agregar tiempo si quiero
                        //frmInicio.txtR.append("\n" + this.getName() + ":" + carrera.losCaballos[1].getTiempo() + " ms");
                        j = 99;
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
            for (int j = 0; j < 99; j++) {
                try {
                    Swimming_Race.lblswimmer3.setLocation(Swimming_Race.lblswimmer3.getLocation().x + Race.swimmer[2].getAdvance(), Swimming_Race.lblswimmer3.getLocation().y);

                    sleep(Race.swimmer[2].getSpeed());

                    if (Swimming_Race.lblswimmer3.getLocation().x > Swimming_Race.lblline.getLocation().x) {
                        int tf = (int) System.currentTimeMillis() / 1000;
                        int tt = tf - ti;
                        Race.swimmer[2].setTime(tt);
                        //Agregar tiempo si quiero
                        //frmInicio.txtR.append("\n" + this.getName() + ":" + carrera.losCaballos[2].getTiempo() + " ms");
                        j = 99;
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
            for (int j = 0; j < 99; j++) {
                try {
                    Swimming_Race.lblswimmer4.setLocation(Swimming_Race.lblswimmer4.getLocation().x + Race.swimmer[3].getAdvance(), Swimming_Race.lblswimmer4.getLocation().y);

                    sleep(Race.swimmer[3].getSpeed());

                    if (Swimming_Race.lblswimmer4.getLocation().x > Swimming_Race.lblline.getLocation().x) {
                        int tf = (int) System.currentTimeMillis() / 1000;
                        int tt = tf - ti;
                        Race.swimmer[3].setTime(tt);
                        //Agregar tiempo si quiero
                        //frmInicio.txtR.append("\n" + this.getName() + ":" + carrera.losCaballos[3].getTiempo() + " ms");
                        j = 99;
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

            for (int j = 0; j < 99; j++) {
                try {
                    Swimming_Race.lblswimmer5.setLocation(Swimming_Race.lblswimmer5.getLocation().x + Race.swimmer[4].getAdvance(), Swimming_Race.lblswimmer5.getLocation().y);

                    sleep(Race.swimmer[4].getSpeed());

                    if (Swimming_Race.lblswimmer5.getLocation().x > Swimming_Race.lblline.getLocation().x) {
                        int tf = (int) System.currentTimeMillis() / 1000;
                        int tt = tf - ti;
                        Race.swimmer[4].setTime(tt);
                        //Agregar el tiempo si quiero
                        //frmInicio.txtR.append("\n" + this.getName() + ":" + carrera.losCaballos[4].getTiempo() + " ms");
                        j = 99;
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
