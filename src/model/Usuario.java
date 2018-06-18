package model;

public class Usuario {

	private int usuCod;
        
        private String usuLogin;

	private String usuPassword;

	private String usuName;

	private String usuCpf;

	private boolean usuType;

	private boolean usuRemove;

    public int getUsuCod() {
        return usuCod;
    }

    public void setUsuCod(int usuCod) {
        this.usuCod = usuCod;
    }

    public String getUsuLogin() {
        return usuLogin;
    }

    public void setUsuLogin(String usuLogin) {
        this.usuLogin = usuLogin;
    }

    public String getUsuPassword() {
        return usuPassword;
    }

    public void setUsuPassword(String usuPassword) {
        this.usuPassword = usuPassword;
    }

    public String getUsuName() {
        return usuName;
    }

    public void setUsuName(String usuName) {
        this.usuName = usuName;
    }

    public String getUsuCpf() {
        return usuCpf;
    }

    public void setUsuCpf(String usuCpf) {
        this.usuCpf = usuCpf;
    }

    public boolean isUsuType() {
        return usuType;
    }

    public void setUsuType(boolean usuType) {
        this.usuType = usuType;
    }

    public boolean isUsuRemove() {
        return usuRemove;
    }

    public void setUsuRemove(boolean usuRemove) {
        this.usuRemove = usuRemove;
    }



	public int GRAV_USER() {
		return 0;
	}

	public void SELECT_USER() {

	}

}