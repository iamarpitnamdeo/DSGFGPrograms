package DesignPatterns.Builders;

public class Client {
    public static void main(String[] args) {
        //Sandwich sandwich = new Sandwich();
        Sandwich sandwich = Sandwich.getBuilder().setNoOfBreads(2)
                .setNoOfOnions(3).setNoOfPickles(2).build();
    }
}
