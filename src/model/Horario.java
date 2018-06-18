package model;

public class Horario {

	private int horID;

	private String horStart;
        
        private boolean horActive;

	private String horFinish;

        
    public int getHorID() {
        return horID;
    }

    public void setHorID(int horID) {
        this.horID = horID;
    }

    public String getHorStart() {
        return horStart;
    }

    public void setHorStart(String horStart) {
        this.horStart = horStart;
    }

    public boolean isHorActive() {
        return horActive;
    }

    public void setHorActive(boolean horActive) {
        this.horActive = horActive;
    }

    public String getHorFinish() {
        return horFinish;
    }

    public void setHorFinish(String horFinish) {
        this.horFinish = horFinish;
    }
}
