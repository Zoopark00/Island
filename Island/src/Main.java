import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Cell[][] island = Cell.createField();
        for (int k = 0; k < 10; k++) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                executorService.execute(island[i][j]);
            }
        }
        executorService.shutdown();

        while (!executorService.isTerminated()) {
            Thread.sleep(500);
        }


        Cell.move(island);
        }

    }
}
