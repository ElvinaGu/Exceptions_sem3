package src.checked;

public class CheckAmountOfData extends UserData {

    public CheckAmountOfData(String[] arr) {
        super(arr);
    }
    public void checkAmount()
    {
        if (arr.length != 6) {
            throw new RuntimeException("Количество введенных данных не соответствует необходимому");
        }
    }
}
