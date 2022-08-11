import java.util.concurrent.ArrayBlockingQueue;

public class Ships implements priorityShips {


    public static void CreateShips() {
        String[] ShipNames = {"Чайка", "Ласточка", "Грузоход", "Андреев", "Ленин", "Чехов", "Сухогруз", "Тайвань", "Мореход", "Океан", "Севастополь", "Настромо"};

        new Thread(() -> {
            for (int i = 0; i < ShipNames.length; i++) {

                try {
                    String name = ShipNames[i];
                    int rq = (int) (1 + Math.random() * 10);//случайная вместимость корабля
                    ArrayBlockingQueue<Item> Ship = new ArrayBlockingQueue<>(rq);
                    //ArrayBlockingQueue<String> ShipName = new ArrayBlockingQueue<>(rq);
                    priorityShips.add(Ship);
                    priorityShipsNames.add(name);
                    System.out.println(">------------- Прибыл корабль " + name + " вместимостью:" + rq);
                    System.out.println("Кораблей в очереди: " + priorityShips.size());
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();
    }


    public static void addItemToShip(Item item) {

        try {
            ArrayBlockingQueue<Item> cargo = priorityShips.get(0);
            String ShipsName = priorityShipsNames.get(0);
            try {
                cargo.add(item);
                System.out.println("Груз " + Item.id + " погружен на корабль - " + ShipsName);

            } catch (IllegalStateException e) {
                System.out.println("-"+ShipsName+"- загружен, отправка!--------------->");
                priorityShips.remove(cargo);
                priorityShipsNames.remove(0);
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Корабль еще не пришвартовался!");
        }
    }
}
