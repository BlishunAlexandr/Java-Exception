import java.io.FileWriter;
import java.io.IOException;

class FileHandler {

    public FileHandler(DataUser dataUser) {
        try (FileWriter writer = new FileWriter(dataUser.lastName + ".txt", true)) {
            // Формируем строку данных для записи в файл
            String dataLine = String.join(" ", dataUser.lastName, dataUser.firstName, dataUser.middleName, dataUser.phone, dataUser.birthDate, dataUser.gender);
            
            // Добавляем перевод строки в конце
            dataLine += "\n";
            
            // Записываем строку в файл
            writer.write(dataLine);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
