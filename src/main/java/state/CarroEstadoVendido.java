package state;

public class CarroEstadoVendido extends CarroEstado{
	private CarroEstadoVendido() {};
    private static CarroEstadoVendido instance = new CarroEstadoVendido();
    public static CarroEstadoVendido getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Vendido";
    }
     
   public boolean indisponibilizar(Carro carro) {
         carro.setEstado(CarroEstadoEmFalta.getInstance());
         return true;
   }
}
