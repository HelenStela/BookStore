import java.util.Iterator;
import java.util.List;

/**
 * Created by Elena on 22.03.2016.
 */
public class MEth {

    //Просто метод перевода в String, может пригодиться на собеседовании)
    public String toString(List<Long> numbers) {
        StringBuilder sb = new StringBuilder();
        try {
            if (numbers.size() > 0) {
                Iterator<Long> iterator = numbers.iterator();
                while (iterator.hasNext()) {
                    sb.append(iterator.next());
                    if (iterator.hasNext()) {
                        sb.append(",");
                    }
                }
            }
        } catch (NullPointerException eception) {
            eception.printStackTrace();

        } catch (Exception e) {
            System.out.println(" Непонятное исключение");
        }
        return sb.toString();
    }

}
