package lambda;

public interface TestInterface {

    //随便什么名字，lambda并不关心，因为FI只有一个接口，并且根据参数来匹配
    public void anyStringAsName(TestBean1 bean1,TestBean2 bean2);
}
