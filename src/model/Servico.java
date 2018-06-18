package model;

    public class Servico {

	private int serCod;
        
        private String serNome;

	private int serTime;

	private int serValor;

	private boolean serRemove;

    public int getSerCod() {
        return serCod;
    }

    public void setSerCod(int serCod) {
        this.serCod = serCod;
    }

    public String getSerNome() {
        return serNome;
    }

    public void setSerNome(String serNome) {
        this.serNome = serNome;
    }

    public int getSerTime() {
        return serTime;
    }

    public void setSerTime(int serTime) {
        this.serTime = serTime;
    }

    public int getSerValor() {
        return serValor;
    }

    public void setSerValor(int serValor) {
        this.serValor = serValor;
    }

    public boolean isSerRemove() {
        return serRemove;
    }

    public void setSerRemove(boolean serRemove) {
        this.serRemove = serRemove;
    }



	public void VIS_SERV() {

	}

	public int GRAV_SERV(int SER_COD) {
		return 0;
	}

}
