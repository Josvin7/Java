package josvin;

import java.util.List;

/**
 * Created With IntelliJ IDEA .
 *
 * @author Josvin
 * description:
 * path: javaee_study-josvin-DuckShop
 * date: 2020/8/13 17:10
 */
public class DuckShop {
    private List<Duck> ducks;

    public List<Duck> getDucks() {
        return ducks;
    }

    public void setDucks(List<Duck> ducks) {
        this.ducks = ducks;
    }

    @Override
    public String toString() {
        return "DuckShop{" +
                "ducks=" + ducks +
                '}';
    }
}
