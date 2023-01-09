package state;

public abstract class CarroEstado {
	public abstract String getEstado();

    public boolean vender(Carro carro) {
        return false;
    }

    public boolean alugar(Carro carro) {
        return false;
    }

    public boolean reservar(Carro carro) {
        return false;
    }

    public boolean indisponibilizar(Carro carro) {
        return false;
    }

    public boolean disponibilizar(Carro carro) {
        return false;
    }
}
