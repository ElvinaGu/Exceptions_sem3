package src;

import src.checked.*;
import src.myException.FormatDataException;

import java.util.Scanner;

public class UserView {
    String[] arr = data();

    public void checker(){

        CheckFIO checkFIO = new CheckFIO(arr);
        checkFIO.checkName();

        CheckAmountOfData checkAmountOfData = new CheckAmountOfData(arr);
        checkAmountOfData.checkAmount();

        CheckFormatData checkFormatData = new CheckFormatData(arr);
        try {
            checkFormatData.checkFormat();
        } catch (FormatDataException e) {
            e.printStackTrace();
            return;
        }

        CheckPhone checkPhone = new CheckPhone(arr);
        checkPhone.checkNumber();

        CheckGender checkGender = new CheckGender(arr);
        checkGender.genderCheck();

        AddFile addFile = new AddFile(arr);
        addFile.addFile();
    }

    private static String[] data() {
        String str = prompt("Введите данные в формате:\n" +
                "Фамилия Имя Отчество дата_рождения номер_телефона пол\n" +
                "Пол необходимо отметить символом латиницы 'f' (женский) или 'm' (мужской)\n");
        String[] arr = str.split(" ");
        return arr;
    }

    private static String prompt (String message){
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
