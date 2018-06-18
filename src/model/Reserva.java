package model;

public class Reserva {

	private int resId;

	private String resHorario;

	private String resObs;

	private String resClosed;
        
        private int usuarioFunCod;
        
        private int usuarioCliCod;
        
        private int servicoSerCod;
        
        private String horariosHorId;

    public int getUsuarioFunCod() {
        return usuarioFunCod;
    }

    public void setUsuarioFunCod(int UsuarioFunCod) {
        this.usuarioFunCod = UsuarioFunCod;
    }

    public int getUsuarioCliCod() {
        return usuarioCliCod;
    }

    public void setUsuarioCliCod(int UsuarioCliCod) {
        this.usuarioCliCod = UsuarioCliCod;
    }

    public int getServicoSerCod() {
        return servicoSerCod;
    }

    public void setServicoSerCod(int ServicoSerCod) {
        this.servicoSerCod = ServicoSerCod;
    }

    public String getHorariosHorId() {
        return horariosHorId;
    }

    public void setHorariosHorId(String horariosHorId) {
        this.horariosHorId = horariosHorId;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getResHorario() {
        return resHorario;
    }

    public void setResHorario(String resHorario) {
        this.resHorario = resHorario;
    }

    public String getResObs() {
        return resObs;
    }

    public void setResObs(String resObs) {
        this.resObs = resObs;
    }

    public String getResClosed() {
        return resClosed;
    }

    public void setResClosed(String resClosed) {
        this.resClosed = resClosed;
    }

	public void VIS_RESERV() {

	}

	public void GRAV_RESERV() {

	}

}


