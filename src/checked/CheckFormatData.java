package src.checked;

import src.myException.FormatDataException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckFormatData extends UserData {
    public CheckFormatData(String[] arr) {
        super(arr);
    }

    public void checkFormat() throws FormatDataException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.mm.yyyy");
        try {
            formatter.parse(arr[3]);
        } catch (ParseException e) {
            throw new FormatDataException();
        }
    }
}
