package info.aakarsh.madassign1;



public class Item {
    int id;
    String name;
    String description;
    String date;


    public Item() {
    }

    public Item(int id, String name, String description, String date)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setPrice(String date) {
        this.date = date;
    }

}
