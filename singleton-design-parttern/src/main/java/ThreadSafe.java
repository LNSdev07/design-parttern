
// cách tạo thứ 3: khi có nhiều luồng gọi đến singleton này
public class ThreadSafe {
    private static volatile ThreadSafe instance;

    private ThreadSafe(){}

    private static synchronized ThreadSafe getInstance(){
        if(instance == null) instance = new ThreadSafe();
        return instance;
    }
}
