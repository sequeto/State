package state;

public class Carro {
	private String placa;
    private CarroEstado estado;    

    public Carro() {
        this.estado = CarroEstadoDisponivel.getInstance();
    }
    
    public void setEstado(CarroEstado estado) {
        this.estado = estado;
    }
    
    public boolean vender() {
        return estado.vender(this);
    }
    
    public boolean alugar() {
        return estado.alugar(this);
    }
    
    public boolean reservar() {
        return estado.reservar(this);
    }
    
    public boolean colocarEmFalta() {
        return estado.indisponibilizar(this);
    }
    
    public boolean disponibilizar() {
        return estado.disponibilizar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public CarroEstado getEstado() {
        return estado;
    }  
}
