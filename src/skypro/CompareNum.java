package skypro;

import java.util.Comparator;

public class CompareNum implements Comparator<SomeNumber> {
    @Override
    public int compare(SomeNumber o1, SomeNumber o2) {
        return Integer.compare(o1.getNum(),o2.getNum());
//        if(o1.getNum()>o2.getNum()){
//            return 1;
//        } else if (o1.getNum()<o2.getNum()) {
//            return -1;
//        }
//        return 0;
    }
}


