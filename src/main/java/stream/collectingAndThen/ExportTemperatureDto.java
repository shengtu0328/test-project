package stream.collectingAndThen;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ExportTemperatureDto {
    private String name;
    private Double morningTemperature;
    private Double afternoonTemperature;
    private String classId;
    private String gradeId;
    private Integer personId;




    /**
     * @Description: TODO
     * @Author rqxiao
     * @Date 2020/12/14 13:00
     * @param personId
     * @param name
     * @return    
     */
    public ExportTemperatureDto(int personId, String name) {
        this.personId = personId;
        this.name = name;

    }









    public static void main(String[] args) {
        List<ExportTemperatureDto> temperatureList = new ArrayList();
        temperatureList.add(new ExportTemperatureDto(1, "haha"));
        temperatureList.add(new ExportTemperatureDto(2, "haha"));
        temperatureList.add(new ExportTemperatureDto(3, "haha"));
        temperatureList.add(new ExportTemperatureDto(4, "haha"));

        temperatureList.add(new ExportTemperatureDto(1, "hahaasdas"));
        temperatureList.add(new ExportTemperatureDto(2, "hahaasdas"));


        List<ExportTemperatureDto> result = temperatureList.stream().collect(
                collectingAndThen(
                        Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(ExportTemperatureDto::getPersonId))),
                        ArrayList::new
                )
        );

        result.forEach(System.out::println);

        /*
            输出结果为：
                personId为1的，其名称为haha
                personId为2的，其名称为haha
            因为TreeSet底层是使用TreeMap进行实现的，传入了根据getPersonId进行比较的比较器
            在判断personId相同时，其比较结果为0，然后就会替换其value值，而key值是不会变化的，
            又因为TreeSet是将传入的元素作为key的，所以使用TreeSet时，当比较器比较的结果相同时，以不会将原来的值替换成比较后的值
         */

    }
}