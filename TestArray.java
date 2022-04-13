import org.junit.Test;
import ru.geekbrains.java3.lesson6.MainApp;

public class TestArray {
    @Test
    public void test1arrayAfter4() {
        int [] in = new int [] {1, 3, 2, 5, 3};
        int[] out = new int[] {7, 8, 10};
        Assertions.assetArrayEquals (out, MainApp.arrayAfter4(in));
    }
    @Test
    public void test2arrayAfter4() {
        int [] in = new int [] {1, 3, 7, 4, 6, 5, 3};
        Assertions.assetThrows (RuntimeException.class, ()->{
            MainApp.arrayAfter4(in);
        });
    }
    @Test
    public void test1arrayContains() {
        int [] in = new int [] {1, 3, 2, 5, 3};
        Assertions.assetFalse (MainApp.arrayContains(in));
    }
    @Test
    public void test2arrayContains() {
        int [] in = new int [] {1, 3,  4, 6};
        Assertions.assetTrue (MainApp.arrayContains(in);
    }
}
