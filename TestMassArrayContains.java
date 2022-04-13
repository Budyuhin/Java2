import com.sun.jdi.connect.Connector;
import com.sun.jdi.connect.IllegalConnectorArgumentsException;
import ru.geekbrains.java3.lesson6.MainApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestMassArrayContains {
    public static Stream<Arguments> dataForContains (){
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments (new int[]{2, 3, 6, 4, 8}, false));
        list.add(Arguments.arguments (new int[]{2, 2, 3}, true));
        list.add(Arguments.arguments (new int[]{4, 4, 4, 4,}, false));
        list.add(Arguments.arguments (new int[]{1, 1, 1, 1,}, false));
        return list.stream();
    }
    @ParameterizedTest
    @MetodSource('dataForContains')
    public void massTestArrayContains (int [] in, boolean flag) {
        Assertions.assertEquals (flag, MainApp.arrayContains(in));
    }

}
