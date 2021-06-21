package application;

public class Selectionsort {

	public static int[] selectionsort(int[] A) {
		for (int i = 0; i < A.length-1; i++) {					//i wird auf Index 0 gesetzt. Schleife wird ausgeführt solange i kleiner ist als das Array -1
			int minIndex = i;									//minIndex wird ebenfalls auf 0 gesetzt
			for(int j = i + 1; j < A.length; j++) {				//Schleife: j wird auf i + 1 -> "1" gesetzt. Läuft solange wie j kleiner ist als die Länge des Arrays. j + 1 nach jedem durchlauf
				if(A[j] < A[minIndex]) {						//Prüfen ob j kleiner ist als der minIndex
					minIndex = j;											//Falls ja dann wird der minIndex auf dasselbe wie j gesetzt
				}
			}
			
			int tmp = A[minIndex];								//tmp wird auf dasselbe wie minIndex gesetzt
			A[minIndex] = A[i];									//minIndex geht zurück zum Index i
			A[i] = tmp;											//i wird ersetzt mit der Temporären variable und der durchlauf fängt von vorne an
		}
		
		return A;
	}
}
