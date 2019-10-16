package a.b.c.entity;

public class S1 extends Student {
    private int id;
    private String name;

    public S1() {
    }

    public S1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
