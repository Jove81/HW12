public class supplier implements Sklad {
    public static void supplier (){
        //поставщики
        new Thread(() -> {
            while (true){
                try {
                    int i = (int) (Math.random()*200);
                    Sklad.put(new Item(i));
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();
    }
}