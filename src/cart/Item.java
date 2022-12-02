package cart;

public class Item{
    //creating class members
    //Class instantiating requires 'Float' which is an object; 'float' is a primitive type
    private String name = ""; 
    private String code = "";
    private Float price = 0.0f; //f stands for float
    private Integer quantity = 0;

    //constructor: to ensure that name and code is needed for Item identification 
    public Item(String name, String code){
        this.name = name;
        this.code = code;
    }

    //command + shift + p then source action then Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    //method to calculate TotalPrice
    public Float totalPrice(){
        return this.price * this.quantity;
    }

}