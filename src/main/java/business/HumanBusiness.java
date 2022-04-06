package business;

import model.Human;

import java.util.List;
import java.util.Optional;

public interface HumanBusiness {
    /**
     * Get human by type
     *
     * @param type human type
     * @return human find by type
     */
    Optional<Human> get(String type);

    /**
     * Get Human list
     *
     * @return list of Humans
     */
    List<Human> getList();
}
