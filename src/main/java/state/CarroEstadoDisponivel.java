package state;

public class CarroEstadoDisponivel extends CarroEstado{
	private CarroEstadoDisponivel() {};
    private static CarroEstadoDisponivel instance = new CarroEstadoDisponivel();
    public static CarroEstadoDisponivel getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Disponível";
    }
     
   public boolean reservar(Carro carro) {
         carro.setEstado(CarroEstadoReservado.getInstance());
         return true;
   }
}
