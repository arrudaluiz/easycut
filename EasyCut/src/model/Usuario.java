package model;

public class Usuario {

	private int USU_COD;

    public int getUSU_COD() {
        return USU_COD;
    }

    public void setUSU_COD(int USU_COD) {
        this.USU_COD = USU_COD;
    }

    public String getUSU_LOGIN() {
        return USU_LOGIN;
    }

    public void setUSU_LOGIN(String USU_LOGIN) {
        this.USU_LOGIN = USU_LOGIN;
    }

    public String getUSU_PASSWORD() {
        return USU_PASSWORD;
    }

    public void setUSU_PASSWORD(String USU_PASSWORD) {
        this.USU_PASSWORD = USU_PASSWORD;
    }

    public String getUSU_NAME() {
        return USU_NAME;
    }

    public void setUSU_NAME(String USU_NAME) {
        this.USU_NAME = USU_NAME;
    }

    public String getUSU_CPF() {
        return USU_CPF;
    }

    public void setUSU_CPF(String USU_CPF) {
        this.USU_CPF = USU_CPF;
    }

    public boolean isUSU_TYPE() {
        return USU_TYPE;
    }

    public void setUSU_TYPE(boolean USU_TYPE) {
        this.USU_TYPE = USU_TYPE;
    }

    public boolean isUSU_REMOVE() {
        return USU_REMOVE;
    }

    public void setUSU_REMOVE(boolean USU_REMOVE) {
        this.USU_REMOVE = USU_REMOVE;
    }

	private String USU_LOGIN;

	private String USU_PASSWORD;

	private String USU_NAME;

	private String USU_CPF;

	private boolean USU_TYPE;

	private boolean USU_REMOVE;

	public int GRAV_USER() {
		return 0;
	}

	public void SELECT_USER() {

	}

}