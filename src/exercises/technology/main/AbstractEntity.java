package exercises.technology.main;

public abstract class AbstractEntity {
    private static int idCounter = 0;
    private int id;

    public AbstractEntity(){
        this.id = idCounter;
        idCounter  ++;
    }

    public int getId() {
        return id;
    }
}
