package cart;

public class Apple extends Item{//inherit Item.java properties

    private String type;

    public Apple() {//to follow Parent class if constructor present
        super("Apple", "a");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
}