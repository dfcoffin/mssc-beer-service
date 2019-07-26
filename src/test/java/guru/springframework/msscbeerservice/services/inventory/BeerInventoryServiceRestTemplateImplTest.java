package guru.springframework.msscbeerservice.services.inventory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by Donald F. Coffin on 07/12/2019 at 17:11
 */

@Disabled // Utility for manual testing
@SpringBootTest
class BeerInventoryServiceRestTemplateImplTest {

    @Autowired
    BeerInventoryService beerInventoryService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getOnhandInventory() {

        //TODO: Evolve to use UPC
//        Integer qoh = beerInventoryService.getOnHandInventory(BeerLoader.BEER_1_UUID);
//
//        System.out.println(qoh);
    }
}