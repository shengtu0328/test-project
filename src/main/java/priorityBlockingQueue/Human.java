package priorityBlockingQueue;

/**
 * @Description: TODO
 * @Author rqxiao
 * @date 2020/12/1512:58
 */
public class Human {

    private int maney;
    private String name;
    public Human(int maney, String name){
        this.maney = maney;
        this.name = name;
    }

    public int getManey() {
        return maney;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + "[存款:"+getManey()+"]";
    }
}
