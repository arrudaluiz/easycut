package model;

    public class Servico {

	private int SER_COD;

    public int getSER_COD() {
        return SER_COD;
    }

    public void setSER_COD(int SER_COD) {
        this.SER_COD = SER_COD;
    }

    public String getSER_NOME() {
        return SER_NOME;
    }

    public void setSER_NOME(String SER_NOME) {
        this.SER_NOME = SER_NOME;
    }

    public int getSER_TIME() {
        return SER_TIME;
    }

    public void setSER_TIME(int SER_TIME) {
        this.SER_TIME = SER_TIME;
    }

    public int getSER_VALOR() {
        return SER_VALOR;
    }

    public void setSER_VALOR(int SER_VALOR) {
        this.SER_VALOR = SER_VALOR;
    }

    public boolean isSER_REMOVE() {
        return SER_REMOVE;
    }

    public void setSER_REMOVE(boolean SER_REMOVE) {
        this.SER_REMOVE = SER_REMOVE;
    }

	private String SER_NOME;

	private int SER_TIME;

	private int SER_VALOR;

	private boolean SER_REMOVE;

	public void VIS_SERV() {

	}

	public int GRAV_SERV(int SER_COD) {
		return 0;
	}

}
