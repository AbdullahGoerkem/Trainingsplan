package application;

import java.util.Arrays;

public class Quicksort {
	public int teilen(int einheiten[], final int erstesElement, final int letztesElement) {		//teilen-Methode: einheiten Array wird erstellt zusammen mit den Parametern erstesElement & letztesElement
		int pivotElement = einheiten[(erstesElement + letztesElement) / 2];						//pivotElement wird auf die Mitte des Arrays gesetzt
		
		int positionLinks = erstesElement;														//int positionLinks wird überschrieben mit dem Wert in erstesElement
		int positionRechts = letztesElement;													//int positionRechts wird überschrieben mit dem Wert in letztesElement
		
		while (positionLinks <= positionRechts) {												//schleife solange wie positionLinks kleiner gleich ist als positionRechts
			
			while(einheiten[positionLinks] < pivotElement) {									//schleife solange wie positionLinks kleiner ist als das PivotElement
				positionLinks++;																//positionLinks + 1
				
			}
			while(einheiten[positionRechts] > pivotElement) {									//schleife solange wie positionRechts größer ist als das PivotElement
				positionRechts--;																//positionRechts - 1
		}
			if (positionLinks <= positionRechts) {												
				int tmp = einheiten[positionLinks];
				einheiten[positionLinks] = einheiten[positionRechts];
				einheiten[positionRechts] = tmp;
				positionLinks++;
				positionRechts--;
			}
			/*
			 * Falls positionLinks kleiner, gleich ist als/wie positionRechts
			 * 		tmp wird auf dasselbe wie positionLinks gesetzt, positionLinks wird überschrieben mit positionRechts und positionRechts bekommt den tmp wert.
			 * 						Diese If-Schleife ist dazu da um die Werte der beiden Indexe zu tauschen und sie dann jeweils ein Index weiter vorankommen zu lassen
			 */
		}
			
		return positionLinks;
	}	
	public void quicksort(int einheiten[], final int erstesElement, final int letztesElement) {
		
		int index = teilen(einheiten, erstesElement, letztesElement);
		
		if (erstesElement < index -1) {
			quicksort(einheiten, erstesElement, index-1);
		}
		if (index < letztesElement) {
			quicksort(einheiten, index, letztesElement);
		}
	}
	/*
	 * Die quicksort Methode Sortiert die Elemente in den Teillisten.
	 * Er prüft zunächst kleiner oder größer ist als der Index und ruft somit die quicksort methode auf welche auch das tauschen und das erneute Teilen beinhaltet
	 */
	public static void main(String[] args) {
		int[] sortierenArray = {2, 0, 9, 3, 2, 7, 5, 1};
		System.out.println(Arrays.toString(sortierenArray));
		System.out.println(Arrays.toString(sortierenArray));
	}
}