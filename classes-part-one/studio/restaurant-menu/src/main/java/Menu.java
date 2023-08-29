import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItems> menuitems = new ArrayList<>();
    private Date lastupdated = new Date();
    public Menu(ArrayList<MenuItems> menuitems, Date lastupdated){
        this.menuitems = menuitems;
        this.lastupdated = lastupdated;
    }
}
