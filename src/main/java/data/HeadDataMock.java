package data;

import enums.BodyTypeEnum;
import enums.HeadSizeEnum;
import model.Head;

import java.util.Arrays;
import java.util.List;

public class HeadDataMock {
    /**
     * Get Fat Body
     *
     * @return Head LARGE attribut enum
     */
     static Head getLargeHead() {
        return new Head( HeadSizeEnum.LARGE);
    }
    /**
     * Get Fat Body
     *
     * @return Head MEDIUM attribut enum
     */
     static Head getMediumHead() {
        return new Head(HeadSizeEnum.MEDIUM);
    }
    /**
     * Get Fat Body
     *
     * @return Head SMALL attribut enum
     */
     public static HeadSizeEnum getSmallHead()    {
        return HeadSizeEnum.SMALL;
    }
}
