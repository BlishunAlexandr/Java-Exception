import java.time.LocalDate;
import java.util.Scanner;

public class DataUser {

    String lastName, firstName, middleName, birthDate, phone, gender;


    DataUser()  {
        try (Scanner scanner = new Scanner(System.in))  {
            System.out.print("Введите фамилию, имя, отчество, дату рождения, номер телефона и гендер: ");
            String data = scanner.nextLine();
            String[] dataUser = data.split("\\s+");
            System.out.println(dataUser.length);
            if (dataUser.length != 6) {
                throw new IllegalArgumentException("Неверное кол-во данных");
            }

            this.lastName = dataUser[0];
            this.firstName = dataUser[1];
            this.middleName = dataUser[2];
            this.birthDate = dataUser[3];
            this.phone = dataUser[4];
            this.gender = dataUser[5];
            LocalDate birthDate = parseBirthDate.parseBirthDate(this.birthDate);
            Long phone = Phone.Phone(this.phone);
            char gender = Gender.Gender(this.gender);

        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
            System.exit(1);
        }
        FileHandler file = new FileHandler(this);
    }
}
