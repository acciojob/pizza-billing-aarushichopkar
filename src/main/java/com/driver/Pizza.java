package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int basePrice;
    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int paperBagPrice;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean takeaway;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.basePrice = isVeg ? 300 : 400;
        this.extraCheesePrice = 80;
        this.extraToppingsPrice = 70;
        this.paperBagPrice = 20;
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.takeaway = false;
        this.bill = "";
        generateBill();
    }

    public int getPrice(){
        int total = basePrice;
        if (extraCheeseAdded) total += extraCheesePrice;
        if (extraToppingsAdded) total += extraToppingsPrice;
        if (takeaway) total += paperBagPrice;
        return total;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!extraCheeseAdded) {
            extraCheeseAdded = true;
            generateBill();
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!extraToppingsAdded) {
            extraToppingsAdded = true;
            generateBill();
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!takeaway) {
            takeaway = true;
            generateBill();
        }
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }

    private void generateBill() {
        StringBuilder sb = new StringBuilder();
        sb.append("Base Price Of The Pizza: ").append(basePrice).append("\n");

        if (extraCheeseAdded) {
            sb.append("Extra Cheese Added: ").append(extraCheesePrice).append("\n");
        }

        if (extraToppingsAdded) {
            sb.append("Extra Toppings Added: ").append(extraToppingsPrice).append("\n");
        }

        if (takeaway) {
            sb.append("Paperbag Added: ").append(paperBagPrice).append("\n");
        }

        sb.append("Total Price: ").append(getPrice()).append("\n");

        this.bill = sb.toString();
    }
}
