
// cách tạo thứ 2

public class LazyInitialization{
    private static LazyInitialization instance = null;

    private LazyInitialization(){

    }

    public static LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
            return instance;
        }
        return instance;
    }
}
