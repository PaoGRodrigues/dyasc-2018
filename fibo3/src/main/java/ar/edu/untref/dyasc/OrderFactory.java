package ar.edu.untref.dyasc;

public class OrderFactory {

    public static Order createOrder(String orderOption){
        Order order;
        if(orderOption.equals("d")){
            order = new DirectOrder();
        }else if(orderOption.equals("i")){
            order = new InverseOrder();
        }else{
            throw new RuntimeException("Opción no válida.");
        }
        
        return order;
    }
}
