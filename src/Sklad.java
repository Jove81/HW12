import java.util.concurrent.ArrayBlockingQueue;

public interface Sklad {
    ArrayBlockingQueue<Item> Sklad = new ArrayBlockingQueue<>(100);//вместимость склада
}
