import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем группы
        Group group1 = new Group("Группа A");
        Group group2 = new Group("Группа B");
        Group group3 = new Group("Группа C");

        // Создаем потоки и добавляем группы
        Stream stream1 = new Stream();
        stream1.addGroup(group1);
        stream1.addGroup(group2);

        Stream stream2 = new Stream();
        stream2.addGroup(group3);

        Stream stream3 = new Stream();
        stream3.addGroup(group1);
        stream3.addGroup(group2);
        stream3.addGroup(group3);

        // Создаем список потоков
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        // Создаем сервис и контроллер
        StreamService streamService = new StreamService();
        Controller controller = new Controller(streamService);

        // Сортируем потоки
        controller.sortStreams(streams);

        // Выводим количество групп в каждом потоке после сортировки
        for (Stream stream : streams) {
            System.out.println("Количество групп в потоке: " + stream.getGroups().size());
        }
    }
}
