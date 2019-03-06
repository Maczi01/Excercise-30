import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class EulerZadanieTest {

    @Test
    public void forSmallNumbers(){
        EulerZadanie ez = new EulerZadanie();
        double result = ez.EulerEx6Algorythm(10);
        Assert.assertThat(result, CoreMatchers.equalTo(2640.0));
    }

    @Test
    public void forBiggerNumbers(){
        EulerZadanie ez = new EulerZadanie();
        double result = ez.EulerEx6Algorythm(50);
        Assert.assertThat(result, CoreMatchers.equalTo(1582700.0));
    }

    @Test
    public void forBiggestNumbers(){
        EulerZadanie ez = new EulerZadanie();
        double result = ez.EulerEx6Algorythm(100);
        Assert.assertThat(result, CoreMatchers.equalTo(25164150.0));
    }



}
