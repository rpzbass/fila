package aplication;

import java.util.LinkedList;
import java.util.Queue;

import entities.Client;

public class ClientTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		Queue<Client> fila = new LinkedList<>();   //lista encadeada que representa uma fila
		
		
		
			
		fila.add(new Client("jorge","teste@teste")); //enfilerar
		fila.add(new Client("joao" , "joao@joao.com"));
		fila.add(new Client("maria","maria@maria.com"));
	    fila.add(new Client("jose","jose@jose.com"));
	    fila.add(new Client("fulano","fulano@fulano.com"));
		fila.add(new Client("mario","mario@mario.com"));
		fila.add(new Client("juliana","juliana@juliana.com"));
		
		System.out.print("----Fila de usuarios----\n\n");
		
		System.out.print(fila.toString() +"\n\n");
		
		
		while(fila.size() >= 0 ) {
			if(fila.size() == 0) { 
				System.out.print("Todos os usuarios foram atendidos");
				break;
			}
			System.out.print(fila.size()  + " USUARIOS EM ESPERA  "+ "\n\n" );
			System.out.print(" USUARIO EM ATENDIMENTO \n "+ fila.remove());	
			Thread.sleep(5000);
			System.out.print("\n\n");
			
			
			
		}
		
		
		
		
		
		
		
		
	
			
	
	
	
	}

	
	
	
	
	

	
	
}
