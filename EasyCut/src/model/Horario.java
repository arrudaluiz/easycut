package model;

public class Horario {

	private int HOR_ID;

	private String HOR_START;

	private boolean HOR_ACTIVE;

	private String HOR_FINISH;

    public Horario(int HOR_ID, String HOR_START, boolean HOR_ACTIVE, String HOR_FINISH) {
        this.HOR_ID = HOR_ID;
        this.HOR_START = HOR_START;
        this.HOR_ACTIVE = HOR_ACTIVE;
        this.HOR_FINISH = HOR_FINISH;
    }

    public int getHOR_ID() {
        return HOR_ID;
    }

    public void setHOR_ID(int HOR_ID) {
        this.HOR_ID = HOR_ID;
    }

    public String getHOR_START() {
        return HOR_START;
    }

    public void setHOR_START(String HOR_START) {
        this.HOR_START = HOR_START;
    }

    public boolean isHOR_ACTIVE() {
        return HOR_ACTIVE;
    }

    public void setHOR_ACTIVE(boolean HOR_ACTIVE) {
        this.HOR_ACTIVE = HOR_ACTIVE;
    }

    public String getHOR_FINISH() {
        return HOR_FINISH;
    }

    public void setHOR_FINISH(String HOR_FINISH) {
        this.HOR_FINISH = HOR_FINISH;
    }

}
