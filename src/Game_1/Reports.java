package Game_1;

import java.util.ArrayList;

class Reports {

    public static ArrayList list = new ArrayList<>();
    public static ArrayList list_swimmers = new ArrayList();
    public static ArrayList list_long = new ArrayList();
    private String for_text;
    /*This method adds the time for the swimmers in a list*/
    void Time(int a) {

        list.add(a);
        Timer();

    }
    /*This method cheks if all players finish the race and set the time in the panel and activate the buttons*/
    public void Timer() {
        if ((Thread_.a == true) && (Thread_.b == true) && (Thread_.c == true) && (Thread_.d == true) && (Thread_.e == true)) {
            Swimming_Race.lbltimer.setText("Duracion de la carrera: " + list.get((list.size() - 1)) + " segundos");
            Swimming_Race.btnrestart.setEnabled(true);
            Swimming_Race.btnstatistics.setEnabled(true);
            Swimming_Race.limit = 0;
        }
    }
    /*This method cheks if all players finish the race and calls other methods 
    and add the information in the text area*/
    public void Report(String name) {
        list_swimmers.add(name);
        if ((Thread_.a == true) && (Thread_.b == true) && (Thread_.c == true) && (Thread_.d == true) && (Thread_.e == true)) {
            Report1();
            Report2();
            Report3();
            Report4();
            Report5();
            Swimming_Race.txtreport.setText(for_text);
            list_long.clear();
            list_swimmers.clear();
            list.clear();
        }
    }
    /*This method checks which player came first and last and sum or subtraction numbers*/
    public void Report1() {

        if (String.valueOf(list_swimmers.get(0)).equals(Race.swimmer[0].getName())) {
            Swimming_Race.swimmer1wins += 1;
        } else if (String.valueOf(list_swimmers.get(0)).equals(Race.swimmer[1].getName())) {
            Swimming_Race.swimmer2wins += 1;
        } else if (String.valueOf(list_swimmers.get(0)).equals(Race.swimmer[2].getName())) {
            Swimming_Race.swimmer3wins += 1;
        } else if (String.valueOf(list_swimmers.get(0)).equals(Race.swimmer[3].getName())) {
            Swimming_Race.swimmer4wins += 1;
        } else if (String.valueOf(list_swimmers.get(0)).equals(Race.swimmer[4].getName())) {
            Swimming_Race.swimmer5wins += 1;
        }
        for_text = "Ganadas=\n" + Race.swimmer[0].getName() + "=" + Swimming_Race.swimmer1wins;
        for_text = for_text + "\n" + Race.swimmer[1].getName() + "=" + Swimming_Race.swimmer2wins;
        for_text = for_text + "\n" + Race.swimmer[2].getName() + "=" + Swimming_Race.swimmer3wins;
        for_text = for_text + "\n" + Race.swimmer[3].getName() + "=" + Swimming_Race.swimmer4wins;
        for_text = for_text + "\n" + Race.swimmer[4].getName() + "=" + Swimming_Race.swimmer5wins;
        int last=(list_swimmers.size()-1);
        if (String.valueOf(list_swimmers.get(last)).equals(Race.swimmer[0].getName())) {
            Swimming_Race.swimmer1defeats -= 1;
        } else if (String.valueOf(list_swimmers.get(last)).equals(Race.swimmer[1].getName())) {
            Swimming_Race.swimmer2defeats -= 1;
        } else if (String.valueOf(list_swimmers.get(last)).equals(Race.swimmer[2].getName())) {
            Swimming_Race.swimmer3defeats -= 1;
        } else if (String.valueOf(list_swimmers.get(last)).equals(Race.swimmer[3].getName())) {
            Swimming_Race.swimmer4defeats -= 1;
        } else if (String.valueOf(list_swimmers.get(last)).equals(Race.swimmer[4].getName())) {
            Swimming_Race.swimmer5defeats -= 1;
        }
    }
    /*This method adds how many times have been played*/
    public void Report2() {
        for_text = for_text + "\nVeces jugadas= " + Swimming_Race.games;
    }
    /*This method checks which player is best player by wins*/
    public void Report3() {
        if (Swimming_Race.swimmer1wins > Swimming_Race.swimmer2wins && Swimming_Race.swimmer1wins > Swimming_Race.swimmer3wins && Swimming_Race.swimmer1wins > Swimming_Race.swimmer4wins && Swimming_Race.swimmer1wins > Swimming_Race.swimmer5wins) {
            for_text = for_text + "\nMaximo ganador= \n" + Race.swimmer[0].getName();
        } else if (Swimming_Race.swimmer2wins > Swimming_Race.swimmer1wins && Swimming_Race.swimmer2wins > Swimming_Race.swimmer3wins && Swimming_Race.swimmer2wins > Swimming_Race.swimmer4wins && Swimming_Race.swimmer2wins > Swimming_Race.swimmer5wins) {
            for_text = for_text + "\nMaximo ganador= \n" + Race.swimmer[1].getName();
        } else if (Swimming_Race.swimmer3wins > Swimming_Race.swimmer1wins && Swimming_Race.swimmer3wins > Swimming_Race.swimmer2wins && Swimming_Race.swimmer3wins > Swimming_Race.swimmer4wins && Swimming_Race.swimmer3wins > Swimming_Race.swimmer5wins) {
            for_text = for_text + "\nMaximo ganador= \n" + Race.swimmer[2].getName();
        } else if (Swimming_Race.swimmer4wins > Swimming_Race.swimmer1wins && Swimming_Race.swimmer4wins > Swimming_Race.swimmer2wins && Swimming_Race.swimmer4wins > Swimming_Race.swimmer3wins && Swimming_Race.swimmer4wins > Swimming_Race.swimmer5wins) {
            for_text = for_text + "\nMaximo ganador= \n" + Race.swimmer[3].getName();
        } else if (Swimming_Race.swimmer5wins > Swimming_Race.swimmer1wins && Swimming_Race.swimmer5wins > Swimming_Race.swimmer2wins && Swimming_Race.swimmer5wins > Swimming_Race.swimmer3wins && Swimming_Race.swimmer5wins > Swimming_Race.swimmer4wins) {
            for_text = for_text + "\nMaximo ganador= \n" + Race.swimmer[4].getName();
        }
    }
    /*This method checks which player is worst player by defeats*/
    public void Report4() {
        if (Swimming_Race.swimmer1defeats < Swimming_Race.swimmer2defeats && Swimming_Race.swimmer1defeats < Swimming_Race.swimmer3defeats && Swimming_Race.swimmer1defeats < Swimming_Race.swimmer4defeats && Swimming_Race.swimmer1defeats < Swimming_Race.swimmer5defeats) {
            for_text = for_text + "\nMás derrotas= \n" + Race.swimmer[0].getName();
        } else if (Swimming_Race.swimmer2defeats < Swimming_Race.swimmer1defeats && Swimming_Race.swimmer2defeats < Swimming_Race.swimmer3defeats && Swimming_Race.swimmer2defeats < Swimming_Race.swimmer4defeats && Swimming_Race.swimmer2defeats < Swimming_Race.swimmer5defeats) {
            for_text = for_text + "\nMás derrotas= \n" + Race.swimmer[1].getName();
        } else if (Swimming_Race.swimmer3defeats < Swimming_Race.swimmer1defeats && Swimming_Race.swimmer3defeats < Swimming_Race.swimmer2defeats && Swimming_Race.swimmer3defeats < Swimming_Race.swimmer4defeats && Swimming_Race.swimmer3defeats < Swimming_Race.swimmer5defeats) {
            for_text = for_text + "\nMás derrotas= \n" + Race.swimmer[2].getName();
        } else if (Swimming_Race.swimmer4defeats < Swimming_Race.swimmer1defeats && Swimming_Race.swimmer4defeats < Swimming_Race.swimmer2defeats && Swimming_Race.swimmer4defeats < Swimming_Race.swimmer3defeats && Swimming_Race.swimmer4defeats < Swimming_Race.swimmer5defeats) {
            for_text = for_text + "\nMás derrotas= \n" + Race.swimmer[3].getName();
        } else if (Swimming_Race.swimmer5defeats < Swimming_Race.swimmer1defeats && Swimming_Race.swimmer5defeats < Swimming_Race.swimmer2defeats && Swimming_Race.swimmer5defeats < Swimming_Race.swimmer3defeats && Swimming_Race.swimmer5defeats < Swimming_Race.swimmer4defeats) {
            for_text = for_text + "\nMás derrotas= \n" + Race.swimmer[4].getName();
        }

    }
    /*This method cheks if the players have a equals time and sum the variable draws*/
    public void Report5() {
        for (int i = 0; i < (list_long.size() - 1); i++) {
            Object timer = list_long.get(i);
            list_long.remove(i);
            if (list_long.contains(timer)) {
                Swimming_Race.draws += 1;
                break;
            }
            list_long.set(i, timer);
        }
        for_text = for_text + "\nEmpates= " + Swimming_Race.draws;

    }
    /*This method adds the time player in milliseconds in a list*/
    void Time_long(long tt_long) {
        list_long.add(tt_long);
    }

}
