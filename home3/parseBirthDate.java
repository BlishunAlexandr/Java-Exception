import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class parseBirthDate {
    static LocalDate parseBirthDate(String birthDate) {
        try {
            return LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (java.time.format.DateTimeParseException e) {
            throw new IllegalArgumentException("Неверный формат даты рождения. Используйте формат dd.MM.yyyy.");
        }
    }
}
