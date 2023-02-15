package queue;

import java.util.LinkedList;
import java.util.Queue;

public class principalqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue <Integer> cola = new LinkedList<Integer>();
		cola.add(1);
		cola.add(2);
		cola.add(3);
		cola.add(4);
		cola.add(5);
		
		System.out.println("El inicio de la queue es: " + cola.peek());
		
		int tamaño = cola.size();
		while (!cola.isEmpty())
		{
			System.out.println("Elementos en queue: " + cola.remove());
		}
	}

}
