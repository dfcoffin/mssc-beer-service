package guru.sfg.brewery.model.events;

import guru.sfg.brewery.model.BeerDto;
import lombok.NoArgsConstructor;

/**
 * Created by Donald F. Coffin on 07/26/2019 at 14:54
 */
@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
