package data;

import enums.HumanTypeEnum;
import model.Human;
import model.Spirit;

import java.util.Arrays;
import java.util.List;

public class SpiritDataMock {

    /**
     * Get spirit
     *
     * @return new spirit
     */
    public static Spirit getFirstSpirit() {
        return new Spirit(
                "cQ5nwC",
                "MonSuperSpiritOne"
        );
    }

    /**
     * Get spirit
     *
     * @return array of all spirit
     */
    public static List<Spirit> getList() {
        return Arrays.asList(
                getFirstSpirit()
        );
    }
}
