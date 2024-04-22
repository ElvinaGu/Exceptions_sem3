package src.checked;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhone extends UserData {
    public CheckPhone(String[] arr) {
        super(arr);
    }

    public boolean checkNumber() {
        Pattern pattern = Pattern.compile("\\d{11}");
        Matcher matcher = pattern.matcher(arr[4]);

        if (!matcher.matches()) throw new RuntimeException("Невалидные данные. " +
                "Введите мобильный одиннадцатизначный номер телефона.");
        return true;
    }
}
