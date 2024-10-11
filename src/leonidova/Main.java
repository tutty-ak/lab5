package leonidova;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 20, "Синий"),
                new Pants(Size.L, 50, "Черный"),
                new Skirt(Size.S, 40, "Розовый"),
                new Tie(Size.XS,16, "Красный" )
        };

        Atelier atelier = new Atelier();
        System.out.println("Одеваем мужчин:");
        atelier.dressMan(clothes);

        System.out.println("Одеваем женщин:");
        atelier.dressWoman(clothes);
    }
}
