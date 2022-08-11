import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public interface priorityShips {
    ArrayList<ArrayBlockingQueue<Item>> priorityShips = new ArrayList<>();//очередь кораблей
    ArrayList<String> priorityShipsNames = new ArrayList<>();//очередь имён кораблей
}