import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cell [][] island = Cell.createField();
        System.out.println("�������������� ������ "+ island [0][0].cellList.size());
        island[0][0].eat();
        System.out.println("����� ��� "+ island [0][0].cellList.size());




    }
}
