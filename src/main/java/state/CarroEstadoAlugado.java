package state;

public class CarroEstadoAlugado extends CarroEstado{
	private CarroEstadoAlugado() {};
    private static CarroEstadoAlugado instance = new CarroEstadoAlugado();
    public static CarroEstadoAlugado getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Evadido";
    }
     
   public boolean vender(Carro carro) {
         carro.setEstado(CarroEstadoVendido.getInstance());
         return true;
   }
}
