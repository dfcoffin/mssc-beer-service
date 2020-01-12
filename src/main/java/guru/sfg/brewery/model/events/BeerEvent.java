package guru.sfg.brewery.model.events;

import guru.sfg.brewery.model.BeerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Donald F. Coffin on 07/25/2019 at 22:11
 */
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -6135178287250020759L;

    private BeerDto beerDto;
}
