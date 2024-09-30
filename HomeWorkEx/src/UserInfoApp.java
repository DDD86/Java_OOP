import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class UserInfoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваши данные (Фамилия Имя Отчество ДатаРождения Телефон Пол):");
        String input = scanner.nextLine();
        scanner.close();

        try {
            String[] parts = input.split(" ");
            if (parts.length != 6) {
                throw new IllegalArgumentException("Неверное количество данных. Ожидалось 6.");
            }

            String surname = parts[0];
            String name = parts[1];
            String middleName = parts[2];
            LocalDate dateOfBirth = parseDate(parts[3]);
            long phoneNumber = parsePhoneNumber(parts[4]);
            char gender = parseGender(parts[5]);

            writeToFile(surname, name, middleName, dateOfBirth, phoneNumber, gender);
            System.out.println("Данные успешно сохранены.");
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } catch (DateTimeParseException e) {
            System.err.println("Ошибка: Неверный формат даты. Используйте формат dd.MM.yyyy.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи файла: ");
            e.printStackTrace();
        }
    }

    private static LocalDate parseDate(String dateStr) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(dateStr, formatter);
    }

    private static long parsePhoneNumber(String phoneNumberStr) {
        try {
            return Long.parseLong(phoneNumberStr);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неверный формат номера телефона.");
        }
    }

    private static char parseGender(String genderStr) {
        if (genderStr.length() != 1 || !(genderStr.equalsIgnoreCase("f") || genderStr.equalsIgnoreCase("m"))) {
            throw new IllegalArgumentException("Неверно указан пол. Ожидается 'f' или 'm'.");
        }
        return genderStr.toLowerCase().charAt(0);
    }

    private static void writeToFile(String surname, String name, String middleName, LocalDate dateOfBirth,
                                    long phoneNumber, char gender) throws IOException {
        String filename = surname + ".txt";
        String line = String.format("%s %s %s %s %d %c", surname, name, middleName, dateOfBirth, phoneNumber, gender);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(line);
            writer.newLine();
        }
    }
}
