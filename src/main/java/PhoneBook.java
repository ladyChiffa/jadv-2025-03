import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, String> phoneBook = new HashMap<>();

    public int add (String name, String phoneNum) {
        phoneBook.put(name, phoneNum);
        return phoneBook.size();
    }
}
