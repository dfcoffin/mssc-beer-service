package guru.sfg.common.events;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.NoArgsConstructor;

/**
 * Created by Donald F. Coffin on 07/25/2019 at 22:15
 */
@NoArgsConstructor
public class BrewBeerEvent extends BeerEvent {

    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
