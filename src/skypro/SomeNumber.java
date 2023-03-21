package skypro;

import java.util.Comparator;
import java.util.Objects;

public class SomeNumber  {
    private int num;

    public SomeNumber(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }



    @Override
    public String toString() {
        return "SomeNumber{" +
                "num=" + num +
                '}';
    }

}