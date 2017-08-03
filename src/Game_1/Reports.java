package Game_1;

import java.util.ArrayList;
import java.util.Random;
//import javax.swing.JOptionPane;

class Reports {

    public static ArrayList list = new ArrayList<>();
    public static ArrayList list_swimmers = new ArrayList();
    public static ArrayList list_winners = new ArrayList();;
    public static ArrayList list_losers = new ArrayList();;
    private int best_swimmer, worst_swimmer;
    private int swimmer1wins, swimmer2wins, swimmer3wins, swimmer4wins, swimmer5wins;
    private int swimmer1defeats, swimmer2defeats, swimmer3defeats, swimmer4defeats, swimmer5defeats;
    private int draws;

    void Time(int a) {
        
        list.add(a);
        Timer();
        
    }

    public void Timer() {
        if ((Thread_.a == true) && (Thread_.b == true) && (Thread_.c == true) && (Thread_.d == true) && (Thread_.e == true)) {
            Swimming_Race.lbltimer.setText("Duracion de la carrera: " + list.get((list.size() - 1)) + " segundos");
            Swimming_Race.btnrestart.setEnabled(true);
        }
    }

    public void Report(String name) {
        list_swimmers.add(name);
        if ((Thread_.a == true) && (Thread_.b == true) && (Thread_.c == true) && (Thread_.d == true) && (Thread_.e == true)) {
        Report2();
        Report3();
        Report4();
        /*
        Report1();
        
        
        
        Report5();*/
    }}

    public void Report1() {

    }

    public void Report2() {
        if ((Thread_.a == true) && (Thread_.b == true) && (Thread_.c == true) && (Thread_.d == true) && (Thread_.e == true)) {
            Swimming_Race.lblreport_2.setText("Veces jugadas: " + Swimming_Race.games);
        }
    }

    public void Report3() {
        if ((Thread_.a == true) && (Thread_.b == true) && (Thread_.c == true) && (Thread_.d == true) && (Thread_.e == true)) {
            list_winners.add(list_swimmers.get(0));
            String text = "Con más victorias: ";
            Swimming_Race.lblreport_3.setText(text+list_swimmers.get(0));
        }
    }
  
    public void Report4() {
        if ((Thread_.a == true) && (Thread_.b == true) && (Thread_.c == true) && (Thread_.d == true) && (Thread_.e == true)) {
            list_losers.add(list_swimmers.get((list_swimmers.size() - 1)));
            String text="Con más derrotas: ";
            Swimming_Race.lblreport_4.setText(text+(list_swimmers.get(list_swimmers.size()-1)));
        }
    }

    public void Report5() {
        
    }

}
