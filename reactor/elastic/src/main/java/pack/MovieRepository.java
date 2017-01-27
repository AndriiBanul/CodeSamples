package pack;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by Andrii_Banul on 1/27/2017.
 */
public interface MovieRepository extends ElasticsearchRepository<Movie, Long> {
    public List<Movie> findByName(String name);

    public List<Movie> findByRatingBetween(Double beginning, Double end);
}
