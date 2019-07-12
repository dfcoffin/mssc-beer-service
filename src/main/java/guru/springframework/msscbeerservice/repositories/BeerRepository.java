package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by Donald F. Coffin on 07/05/2019 at 13:21
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
