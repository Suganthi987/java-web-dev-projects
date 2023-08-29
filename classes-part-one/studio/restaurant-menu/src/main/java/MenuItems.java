public class MenuItems {
    private String name;
    private double price;
    private String description;
    private String  category;
    private boolean newitem = true;
    public MenuItems(String name,double price,String description, String category, boolean newitem){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newitem = newitem;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNewitem() {
        return newitem;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNewitem(boolean newitem) {
        this.newitem = newitem;
    }
}
