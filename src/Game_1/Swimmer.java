package Game_1;
/*This class creates all information for swimmers*/
public class Swimmer {

    private int coorX, coorY, speed, advance;
    private long time;
    private String name;
    
    public Swimmer (int coorX, int coorY, long time, int speed, String name) {
        this.coorX = coorX;
        this.coorY = coorY;
        this.time = time;
        this.speed = speed;
        this.name = name;
    }
    public int getAdvance() {
        return advance;
    }

    public void setAdvance(int advance) {
        this.advance = advance;
    }

    public int getCoorX() {
        return coorX;
    }

    public void setCoorX(int coorX) {
        this.coorX = coorX;
    }

    public int getCoorY() {
        return coorY;
    }

    public void setCoorY(int coorY) {
        this.coorY = coorY;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
