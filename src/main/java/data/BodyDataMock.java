package data;

import enums.BodyTypeEnum;

import model.Body;

public class BodyDataMock {

    /**
     * Get Fat Body
     *
     * @return Body FAT attribut enum
     */
    static BodyTypeEnum getFatBody(){
        return BodyTypeEnum.FAT;
    }
    /**
     * Get Fat Body
     *
     * @return Body NORMAL attribut enum
     */
    static Body getNormalBody(){
        Body obj = new Body();
        obj.setType(BodyTypeEnum.NORMAL);
        return obj;
    }
    /**
     * Get Fat Body
     *
     * @return Body FIT attribut enum
     */
    static Body getFitBody(){
        Body obj = new Body();
        obj.setType(BodyTypeEnum.FIT);
        return obj;
    }
    /**
     * Get Fat Body
     *
     * @return Body OVERWEIGHT attribut enum
     */
    static Body getOverBody(){
        Body obj = new Body();
        obj.setType(BodyTypeEnum.OVERWEIGHT);
        return obj;
    }
}
