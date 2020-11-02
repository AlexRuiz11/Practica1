package jardineria;

import java.util.Date;

public class Main {
	


	public static void main(String[] args) {
		
	Cliente builder = new Cliente("Pepe","Alex","Ruiz",625253514,"Elfax","Ladirec1","Ladirec2","Zaragoza","Zaragoza","España",48953,null,10000);
	
	Pedido builderPedido= new Pedido(null, null, null, "En camino", "Comentario", null);
	
	System.out.println(builder);
	System.out.println(builderPedido);
	}
 
}
