package data;

import enums.HumanTypeEnum;
import model.Human;

import java.util.Arrays;
import java.util.List;

public class HumanDataMock {

    /**
     * Get Male human
     *
     * @return Obj of male human
     */
    public static Human getMaleHuman() {
        Human male = new Human("sprit", "opt", HumanTypeEnum.MALE);
        return male;
    }
    /**
     * Get Male human
     *
     * @return Obj of female human
     */
    public static Human getFemaleHuman() {
        Human female = new Human("sprit", "opt", HumanTypeEnum.FEMALE);
        female.setArms(4);
        female.setBody(BodyDataMock.getFatBody());
        female.setFoots(2);
        female.setHead(HeadDataMock.getSmallHead());
        return female;
    }
    /**
     * Get list of all humans
     *
     * @return Array of all humans
     */
    public static List<Human> getList() {
        return Arrays.asList(
                getMaleHuman(),
                getFemaleHuman()
        );
    }

}
