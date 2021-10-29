package day04;

public class Prison {
    private String[] lock = new String[100];

    public void openFreeCells() {

        //Konstruktor helyett
       System.out.print("1.nap: ");
        for (int i = 0; i < lock.length; i++) {
            lock[i] = "nyitva";
            System.out.print(lock[i] + " ");
        }

        //Első művelet
        System.out.println();
        System.out.print("2.nap: ");
        for (int i = 1; i < lock.length; i += 2) {
            lock[i] = "zárva";
        }
        for (String t: lock) {
            System.out.print(t + " ");
        }

        System.out.println();

        //Többi műveletek
        int loop = 3;
        for (int j = 1; j < lock.length - 1; j++) {
            System.out.print(loop + ".nap: ");
            for (int i = (loop -1); i < lock.length; i += loop) {
                if (lock[i].equals("zárva")) {
                    lock[i] = "nyitva";
                } else lock[i] = "zárva";
            }
            for (String t: lock) {
                System.out.print(t + " ");
            }
            System.out.println();
            loop++;
        }
    }
}
