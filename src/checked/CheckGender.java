package src.checked;

public class CheckGender extends UserData{

    public CheckGender(String[] arr) {
        super(arr);
    }
    public void genderCheck(){
        String gender = arr[5];
        if (!gender.equals("m") && !gender.equals("f")) {
            throw new RuntimeException("Неверно выбран символ пола");
        }
    }
}
