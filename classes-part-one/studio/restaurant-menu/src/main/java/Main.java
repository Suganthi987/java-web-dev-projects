import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        MenuItems burger = new MenuItems("Burger",12.99,"Burger","Main Course",true);
        MenuItems pizza = new MenuItems("Pizza" , 11.99,"Pizza","Main Course",true);
        MenuItems shrimpCocktail = new MenuItems("Shrimp cocktail", 12.99,"shrimp cocktail","appetizer",true);
        Menu menu = new Menu();
        menu.addItem(burger);
        menu.addItem(pizza);
        menu.addItem(shrimpCocktail);
        burger.printMenuItems(burger);
        //pizza.printMenuItems(pizza);
        //shrimpCocktail.printMenuItems(shrimpCocktail);
          

    }
}
