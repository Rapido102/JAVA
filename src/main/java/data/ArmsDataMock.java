package data;

import model.Arm;
import java.util.Arrays;
import java.util.List;

public class ArmsDataMock {
    /**
     * Get Arm list
     *
     * @return Arm in an array
     */
    public static List<Arm> getList(){

        return Arrays.asList(
                new Arm(1),
                new Arm(5)
        );
    }
}
