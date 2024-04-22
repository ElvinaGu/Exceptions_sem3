package src;

import src.checked.UserData;

import java.io.FileWriter;
import java.io.IOException;


public class AddFile extends UserData {

    public AddFile(String[] arr) {
        super(arr);
    }

    public void addFile() {
        String fn = arr[0] + ".txt";
        try (FileWriter fr = new FileWriter(fn, true)) {
            fr.write(String.format("<%s> <%s> <%s> <%s> <%s> <%s>%n", arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]));
            fr.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
