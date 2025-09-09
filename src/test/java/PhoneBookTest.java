import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PhoneBookTest {
    @Test
    public void testAdd(){
        // Arrange
        PhoneBook pb = new PhoneBook();

        // Act/Assert
        int count = pb.add("Алексей", "+79001112233");
        Assertions.assertEquals(1, count);
    }

    @Test
    public void testAddNumerous(){
        // Arrange
        PhoneBook pb = new PhoneBook();

        // Act/Assert
        pb.add("Алексей", "+79001112233");
        int count = pb.add("Максим", "+79001112244");
        Assertions.assertEquals(2, count);
    }

    @Test
    public void testAddRepeated(){
        // Arrange
        PhoneBook pb = new PhoneBook();

        // Act/Assert
        pb.add("Алексей", "+79001112233");
        int count = pb.add("Алексей", "+79001112244");
        Assertions.assertEquals(1, count);
    }
}
