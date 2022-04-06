import business.*;
import data.SpiritDataMock;
import helper.Helper;
import model.Arm;
import model.Foot;
import model.Human;
import model.Spirit;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main (String[] args){

        humanBusinessImpl studentBusiness = new humanBusinessImpl();
        Optional<Human> human = studentBusiness.get("FEMALE");

        SpiritBusinessImpl spiritBusiness = new SpiritBusinessImpl();
        Optional<Spirit> spirit = spiritBusiness.get("MonSuperSpiritOne");

        ArmBusinessImpl armBusiness = new ArmBusinessImpl();
        List<Arm> arms = armBusiness.getList();

        FootBusinessImpl footBusiness = new FootBusinessImpl();
        List<Foot> foots = footBusiness.getList();

        Helper.generateJson(human);
        Helper.generateJson(spirit);
        Helper.generateJson(arms);
        Helper.generateJson(foots);
    }
}
