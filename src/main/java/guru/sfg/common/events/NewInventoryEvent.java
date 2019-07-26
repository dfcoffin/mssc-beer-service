package guru.sfg.common.events;

import guru.springframework.msscbeerservice.web.model.BeerDto;
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
