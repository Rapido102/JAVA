package business;

import data.ArmsDataMock;
import model.Arm;

import java.util.List;

public class ArmBusinessImpl implements ArmBusiness {
    List<Arm> arms = ArmsDataMock.getList();

    /**
     * Get all Arm
     *
     * @return all Arm in array
     */
    @Override
    public List<Arm> getList() {
        return arms;
    }
}
