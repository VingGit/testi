import org.ejml.simple.SimpleMatrix;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class test {
    public static void main(String[] args){
        Random rand = new Random();
        NumberFormat formatter = new DecimalFormat("#0.00");

        SimpleMatrix m1 = SimpleMatrix.random_DDRM(5,5,1,10,rand);
        SimpleMatrix  m2  = SimpleMatrix.random_DDRM(5,5,1,10,rand);
        SimpleMatrix  m3 = SimpleMatrix.random_DDRM(5,5,1,10,rand);
        SimpleMatrix  m4 = SimpleMatrix.random_DDRM(5,5,1,10,rand);
        System.out.println("random matriisi 1");
        System.out.println(m1);
        System.out.println("random matriisi 2");
        System.out.println(m2);
        System.out.println("random matriisi 3");
        System.out.println(m3);
        System.out.println("random matriisi 4");
        System.out.println(m4);
        System.out.println("joku handen lasku tai jotain emt");
        System.out.println(jokuHandenHomoLaskuTaiJotain(m1,m2,m3,m4));
    }

    public static SimpleMatrix jokuHandenHomoLaskuTaiJotain(SimpleMatrix m1,SimpleMatrix m2,SimpleMatrix m3,SimpleMatrix m4){
        return m3.mult((m1.scale(2.0)).plus(m2.scale(2.0)).mult(m3.invert().minus(m4)));
    }

}
