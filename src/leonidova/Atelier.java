package leonidova;

public class Atelier {
    public void dressWoman(Clothes[] clothes) {
        for (Clothes cloth : clothes) {
            if (cloth instanceof WomenClothing) {
                ((WomenClothing) cloth).dressWoman();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        for (Clothes cloth : clothes) {
            if (cloth instanceof MenClothing) {
                ((MenClothing) cloth).dressMan();
            }
        }
    }
}
