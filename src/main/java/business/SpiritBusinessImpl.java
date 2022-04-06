package business;

import data.SpiritDataMock;
import model.Spirit;

import java.util.List;
import java.util.Optional;

public class SpiritBusinessImpl implements SpiritBusiness {

    List<Spirit> spirits = SpiritDataMock.getList();

    /**
     * Get Spirit by type
     *
     * @param name Spirit name
     * @return Spirit finds by name
     */
    @Override
    public Optional<Spirit> get(String name) {
        return spirits.stream()
                .filter(spirit -> spirit.getName().toString().equals(name))
                .findAny();
    }
    /**
     * Get all spirits
     *
     * @return all Spirit in array
     */
    @Override
    public List<Spirit> getList() {
        return spirits;
    }
}
