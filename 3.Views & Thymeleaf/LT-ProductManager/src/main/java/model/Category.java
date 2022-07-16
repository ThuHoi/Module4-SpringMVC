package model;

public class Category {
    private int id;
    private String nameCate;

    public Category() {
    }

    public Category(int id, String name) {
        this.id = id;
        this.nameCate = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCate() {
        return nameCate;
    }

    public void setNameCate(String nameCate) {
        this.nameCate = nameCate;
    }
}
