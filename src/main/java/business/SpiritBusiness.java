package business;

import model.Spirit;

import java.util.List;
import java.util.Optional;

public interface SpiritBusiness {
    /**
     * Get Spirit by type
     *
     * @param name Spirit name
     * @return Spirit finds by name
     */
    Optional<Spirit> get(String name);

    /**
     * Get Spirit list
     *
     * @return list of Spirits
     */
    List<Spirit> getList();
}

