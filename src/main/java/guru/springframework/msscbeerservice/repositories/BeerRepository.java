package guru.springframework.msscbeerservice.repositories;

import com.sun.xml.bind.v2.model.core.ID;
import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Donald F. Coffin on 07/05/2019 at 13:21
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, ID> {
}
