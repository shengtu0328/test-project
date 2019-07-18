package uuid;

import java.util.UUID;

/**
 * @Auther: rqxiao
 * @Date: 2019-7-17 09:49
 * @Description:
 */
public class Test {


    private String getId(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("第"+i+"次循环：         "+new Test().getId());
        }
       /*
        *     第1次循环：         d93d954031ba46f189218b70fb515e81
            第2次循环：         39bb777fc3174d3eae567af9c36e9b91
            第3次循环：         004cf5d069f242fdaeadb0c3b617a177
            第4次循环：         1a34a35b3819435a9bf3cf57e84723e3
            第5次循环：         36bddeeb80cf474692ebb2a820143ac4
            第6次循环：         14118998dcfb434888fb89cfe86872f6
            第7次循环：         23d13d893163462e83c735ddeed70324
            第8次循环：         ac5ea675f91c418cae8b30372d4197a6
            第9次循环：         fd139e9da15e4b51a8341ae46b6fbdec
            第10次循环：         3f8b227e2f514160a0e0f7abb6fe63db
        */
    }
}
