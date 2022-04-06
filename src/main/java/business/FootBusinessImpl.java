package business;

import data.FootDataMock;
import model.Foot;

import java.util.List;

public class FootBusinessImpl implements FootBusiness {

    List<Foot> foots = FootDataMock.getList();

    /**
     * Get all Foot
     *
     * @return all Foot in array
     */
    @Override
    public List<Foot> getList() {
        return foots;
    }
}
