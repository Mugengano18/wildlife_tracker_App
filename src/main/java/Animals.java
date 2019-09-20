
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;
public abstract class Animals {
    public int  id;
    public String name;
    public String health;
    public int Age;
    public Timer timer;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHealth() {
        return health;
    }

    public int  getAge() {
        return Age;
    }



}
