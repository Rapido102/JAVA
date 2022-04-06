package business;

import data.HumanDataMock;
import model.Human;

import java.util.List;
import java.util.Optional;

public class humanBusinessImpl implements HumanBusiness {

    List<Human> humans = HumanDataMock.getList();
    /**
     * Get Human by type
     *
     * @param type Human type
     * @return Human finds by type
     */
    @Override
    public Optional<Human> get(String type) {
        return humans.stream()
                .filter(human -> human.getType().toString().equals(type))
                .findFirst();
    }
    /**
     * Get all Human
     *
     * @return all Human in array
     */
    @Override
    public List<Human> getList() {
        return humans;
    }
}
