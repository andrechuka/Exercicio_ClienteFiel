package Sistema;


import java.util.ArrayList;


import Model.Cliente;
import Model.ClienteFiel;


public class Loja {
	public static void main(String[] args) {
		
		
		ArrayList<Cliente> listaClientes;
		listaClientes = new ArrayList<Cliente>();
		
		listaClientes.add(new Cliente("Andre 1 ","andre@1.com", 1000.0));
		listaClientes.add(new Cliente("Andre 2  ","andre@2.com", 2000.0));
		listaClientes.add(new ClienteFiel("Andre 3 ", "andre@3.com", 2000.0, 5));
		
		for (Cliente c: listaClientes) {
			if (c.comprar(1500.0))
				System.out.println("Compra efetuada para o cliente  >>> "+ c.getNome());
			else {
				System.out.println("Linha de crédito insuficiente para "+c.getNome());
		}
			
			
		}
		for (Cliente c: listaClientes) {
			System.out.println(c.exibirFatura());
		}
	}
}
		
		
		
		
		
	

