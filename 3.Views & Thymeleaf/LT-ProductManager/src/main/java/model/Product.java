package model;

public class Product {
    private int idP;
    private String name;
    private double price;
    private String img;
    private Category category;
    private boolean status;

    public Product() {
    }

    public Product(int id, String name, double price, String img, Category category, boolean status) {
        this.idP = id;
        this.name = name;
        this.price = price;
        this.img = img;
        this.category = category;
        this.status = status;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
