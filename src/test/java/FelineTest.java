import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {
    @Mock
    Feline feline;

    @Test
    public void felineGetFamilyTest() {
        Feline feline = new Feline();
        String expected = "Кошачьи";

        assertEquals(expected, feline.getFamily());
    }

    @Test
    public void eatMeatReturnsPredator() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        assertEquals(expectedFood, cat.getFood());
    }

    @Test
    public void felineGetKittensTest() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedKittenCount = 1;

        assertEquals(expectedKittenCount, feline.getKittens());

    }
}
