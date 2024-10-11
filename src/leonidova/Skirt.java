package leonidova;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женская юбка: Размер - " + size + ", Цена - " + price + ", Цвет - " + color);
    }
}