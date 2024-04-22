package src.checked;

public class CheckFIO extends UserData{

    public CheckFIO(String[] arr) {
        super(arr);
    }

    public boolean checkName(){
        String str = arr[0] + arr[1] + arr[2];
        char[] chars = str.toCharArray();

        for (char c : chars){
            if (!Character.isLetter(c)) throw new RuntimeException("Введены неверные данные. Введите корректные ФИО.");
        }
        return true;
    }
}
