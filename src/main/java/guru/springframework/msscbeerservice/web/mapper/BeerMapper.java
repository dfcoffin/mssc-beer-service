package guru.springframework.msscbeerservice.web.mapper;

import guru.sfg.brewery.model.BeerDto;
import guru.springframework.msscbeerservice.domain.Beer;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

/**
 * Created by Donald F. Coffin on 07/10/2019 at 01:13
 */

@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    BeerDto beerToBeerDtoWithInventory(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
