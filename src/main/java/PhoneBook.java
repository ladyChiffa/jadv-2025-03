import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, String> phoneBook = new HashMap<>();

    public int add (String name, String phoneNum) {
        phoneBook.put(name, phoneNum);
        return phoneBook.size();
    }

    public String findByNumber(String phoneNum){
        for(Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(phoneNum)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String findByName(String name) {
        return phoneBook.get(name);
    }
}
