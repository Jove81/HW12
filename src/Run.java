public class Run {
    public static void main(String[] args){
        seaport();
    }
    public static void seaport(){
        new Thread(() -> {
            Ships.CreateShips();
            supplier.supplier();
            // количество кранов 3 и они все грузят один корабль.
            Crane.Crane();
            Crane.Crane();
            Crane.Crane();

        }).start();

    }
}