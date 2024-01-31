class Tablet {
    static String brand = "Apple";
    static String model = "iPad Pro";
    static String color = "Space Gray";
    static int storageCapacity = 256; // Storage capacity in gigabytes
    static boolean hasCellularConnectivity = true;
    static String colorMode="dark";
    static int price=12000;

    public static void main(String[] args) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
        System.out.println("Has Cellular Connectivity: " + hasCellularConnectivity);
        System.out.println("Colormode is: " + colorMode);
		System.out.println("price is: " + price);
    }
}
