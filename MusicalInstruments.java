class MusicalInstruments {
    String name;
    String color;
    String size;
    double price;
    String brand;

    public void play() {
        System.out.println("Playing with toys!");
    }

    public static void main(String[] args) {
        Toys toy1 = new Toys();
        toy1.name = "Keyboard";
        toy1.color = "Black";
        toy1.size = "Medium";
        toy1.price = 99.99;
        toy1.brand = "XYZ Instruments";
        System.out.println(toy1.name + " " + toy1.color + " " + toy1.size + " " + toy1.price + " " + toy1.brand);
        toy1.play();

        Toys toy2 = new Toys();
        toy2.name = "Guitar";
        toy2.color = "Red";
        toy2.size = "Large";
        toy2.price = 149.99;
        toy2.brand = "ABC Music";
        System.out.println(toy2.name + " " + toy2.color + " " + toy2.size + " " + toy2.price + " " + toy2.brand);
        toy2.play();

        Toys toy3 = new Toys();
        toy3.name = "Drums";
        toy3.color = "Blue";
        toy3.size = "Large";
        toy3.price = 199.99;
        toy3.brand = "Rock Beats";
        System.out.println(toy3.name + " " + toy3.color + " " + toy3.size + " " + toy3.price + " " + toy3.brand);
        toy3.play();
    }
}
