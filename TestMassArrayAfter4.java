import ru.geekbrains.java3.lesson6.MainApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestMassArrayAfter4 {
    public static Stream<Arguments> dataForAfter4 (){
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments (new int[]{2, 7, 9, 4, 1}, new int[]{3, 8}));
        list.add(Arguments.arguments (new int[]{2, 2, 3}, new int[]{3, 8}));
        list.add(Arguments.arguments (new int[]{4, 4, 4, 4,}, new int[]{3, 8}));
        list.add(Arguments.arguments (new int[]{1, 1, 1, 1,}, new int[]{3, 8}));
        return list.stream();
    }
    @ParameterizedTest
    @MetodSource('dataForAfter4')
    public void massTestArrayAfter4 (int [] in, int [] out) {
        Assertions.assertArrayEquals (out, MainApp.arrayAfter4(in));
    }
}
