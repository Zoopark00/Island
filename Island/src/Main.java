import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cell[][] island = Cell.createField();

        for (int i = 0; i < 10; i++) {
            System.out.println("первоначальный размер " + island[0][0].cellList.size());
            island[0][0].eat();
            System.out.println("После еды " + island[0][0].cellList.size());
            island[0][0].sex();
            System.out.println("После размножения " + island[0][0].cellList.size());
        }


    }
}
