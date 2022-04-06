package data;

import model.Foot;

import java.util.Arrays;
import java.util.List;

public class FootDataMock {
    /**
     * Get Foot list
     *
     * @return Foot in an array
     */
    public static List<Foot> getList(){
        return Arrays.asList(
                new Foot(4),
                new Foot(0),
                new Foot(1),
                new Foot(3),
                new Foot(2)
        );
    }
}
