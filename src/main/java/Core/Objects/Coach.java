package Core.Objects;

public class Coach {
    int minutes;
    String name;

    public Coach(String name, int minutes) {
        this.name = name;
        this.minutes = minutes;
    }

    public String getName() {
        return name;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setName(String name) {
        this.name = name;
    }
}
