package it.tramways.projects.mongo;

import it.tramways.projects.api.model.RoadMap;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoadMapsMongoRepository extends MongoRepository<RoadMap, Long> {

}
