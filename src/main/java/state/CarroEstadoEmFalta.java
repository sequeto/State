package state;

public class CarroEstadoEmFalta extends CarroEstado{
	private CarroEstadoEmFalta() {};
    private static CarroEstadoEmFalta instance = new CarroEstadoEmFalta();
    
    public static CarroEstadoEmFalta getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Em Falta";
    }
}
