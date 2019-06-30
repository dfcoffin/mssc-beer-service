package guru.springframework.msscbeerservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Donald F. Coffin on 06/30/2019 at 01:47
 */
public class BeerPageList extends PageImpl<BeerDto> {

    public BeerPageList(List<BeerDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPageList(List<BeerDto> content) {
        super(content);
    }
}
