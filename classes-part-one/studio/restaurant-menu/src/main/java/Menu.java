import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItems> menu = new ArrayList<>();
    private Date lastupdated = new Date();
    public Menu(ArrayList<MenuItems> menu, Date lastupdated){
        this.menu = menu;
        this.lastupdated = lastupdated;
    }

    public Menu() {

    }
    public void addItem(MenuItems menuitem){
        menu.add(menuitem);
    }

}


