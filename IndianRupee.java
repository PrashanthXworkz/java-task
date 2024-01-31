public class IndianRupee {
    private int denomination;
    private String currencyCode;
    private String currencyName;
    private String country;
    private String symbol;
    private String color;
    private String frontImage;
    private String backImage;
    private int widthInMillimeters;
    private int heightInMillimeters;

    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return denomination;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFrontImage(String frontImage) {
        this.frontImage = frontImage;
    }

    public String getFrontImage() {
        return frontImage;
    }

    public void setBackImage(String backImage) {
        this.backImage = backImage;
    }

    public String getBackImage() {
        return backImage;
    }

    public void setWidthInMillimeters(int widthInMillimeters) {
        this.widthInMillimeters = widthInMillimeters;
    }

    public int getWidthInMillimeters() {
        return widthInMillimeters;
    }

    public void setHeightInMillimeters(int heightInMillimeters) {
        this.heightInMillimeters = heightInMillimeters;
    }

    public int getHeightInMillimeters() {
        return heightInMillimeters;
    }

    public static void main(String args[]) {
        IndianRupee rupee = new IndianRupee();
        rupee.setDenomination(500);
        rupee.setCurrencyCode("INR");
        rupee.setCurrencyName("Indian Rupee");
        rupee.setCountry("India");
        rupee.setSymbol("₹");
        rupee.setColor("Purple");
        rupee.setFrontImage("front.jpg");
        rupee.setBackImage("back.jpg");
        rupee.setWidthInMillimeters(150);
        rupee.setHeightInMillimeters(65);

        System.out.println(rupee.denomination + " " + rupee.currencyCode + " " + rupee.currencyName + " " + rupee.country
                + " " + rupee.symbol + " " + rupee.color + " " + rupee.frontImage + " " + rupee.backImage + " "
                + rupee.widthInMillimeters + " " + rupee.heightInMillimeters);
    }
}
