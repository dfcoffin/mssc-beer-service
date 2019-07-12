package guru.springframework.msscbeerservice.services.inventory;

import java.util.UUID;

/**
 * Created by Donald F. Coffin on 07/12/2019 at 16:38
 */
public interface BeerInventoryService {

    Integer getOnHandInventory(UUID beerId);
}
