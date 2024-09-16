import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {
    private final List<Actor> queue;

    public Market(){
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришел в магазин.");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь.");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {
        if (queue.isEmpty()) {
            System.out.println("Очередь пуста. Никто не может сделать заказ.");
            return;
        }

        for(Actor actor : queue) {
            if(!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал свой заказ.");
            } else {
                System.out.println(actor.getName() + " уже сделал заказ.");
            }
        }
    }

    @Override
    public void giveOrders() {
        if (queue.isEmpty()) {
            System.out.println("Очередь пуста. Некому выдавать заказы.");
            return;
        }

        for(Actor actor : queue) {
            if(actor.isMakeOrder() && !actor.isTakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ.");
            } else if (actor.isTakeOrder()) {
                System.out.println(actor.getName() + " уже получил свой заказ.");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        if (queue.isEmpty()) {
            System.out.println("Очередь пуста. Никто не может покинуть магазин.");
            return;
        }

        List<Actor> releasedActors = new ArrayList<>();
        for(Actor actor : queue) {
            if(actor.isTakeOrder()) {
                releasedActors.add(actor);
                System.out.println(actor.getName() + " готов покинуть магазин.");
            }
        }
        releaseFromMarket(releasedActors);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        if (actors.isEmpty()) {
            System.out.println("Никто не покинул магазин.");
            return;
        }

        for(Actor actor : actors) {
            System.out.println(actor.getName() + " вышел из магазина.");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        System.out.println("Обновление состояния магазина...");
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
}
