public class Crane implements Sklad, priorityShips {

    public static void Crane(){

        new Thread(() -> {
            while (true) {
                try {
                    Ships.addItemToShip(Sklad.take());
                    Thread.sleep(1000);
                    System.out.println("Г - Кран "+Thread.currentThread().getName()+" грузит корбаль - "+priorityShipsNames.get(0));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}