package src.myException;

import java.text.ParseException;

public class FormatDataException extends Exception {
    public FormatDataException() {
        super("Неверный формат даты. Необходимый формат: dd.mm.yyyy");
    }
}
