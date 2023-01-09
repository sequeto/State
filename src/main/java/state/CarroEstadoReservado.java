package state;

public class CarroEstadoReservado extends CarroEstado{
	private CarroEstadoReservado() {};
    private static CarroEstadoReservado instance = new CarroEstadoReservado();
    public static CarroEstadoReservado getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Reservado";
    }
     
   public boolean alugar(Carro carro) {
         carro.setEstado(CarroEstadoAlugado.getInstance());
         return true;
   }
}
