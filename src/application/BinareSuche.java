package application;

public class BinareSuche {

    public void searchBinary(int[] einheiten, int anfang, int ende, int zahl) {
        
        int grenze = anfang + ((ende - anfang) / 2);
        
        if (einheiten.length == 0) {
            System.out.println("Array leer.");
            return;
        }
        
        if (grenze >= einheiten.length){
            System.out.println(zahl + " nicht im Array enthalten.");
            return;
        }

        if (zahl > einheiten[grenze]) {
            searchBinary(einheiten, grenze + 1, ende, zahl);
        } else if (zahl < einheiten[grenze] && anfang != grenze) {
            searchBinary(einheiten, anfang, grenze - 1, zahl);
        } else if(zahl == einheiten[grenze]) {
            System.out.println(zahl + " an Position " + grenze + " enthalten.");
        } else{
            System.out.println(zahl + " nicht im Array enthalten.");
        }
    }

    public static void main(String[] args) {
        int[] testArr = { 5, 3, 5, 228, 14, 69, 18, 27, 109, 85};					//Arrays.sort(testArr);
        Selectionsort.selectionsort(testArr); 										//Es wird anhand des Selectionsort sortiert.
        BinareSuche bs = new BinareSuche();											//neue BinäreSuche Instanz
        bs.searchBinary(testArr, 0, testArr.length - 1, 228);						
    }
}