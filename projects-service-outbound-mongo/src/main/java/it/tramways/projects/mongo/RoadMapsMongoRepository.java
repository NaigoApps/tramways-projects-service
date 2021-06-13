package it.tramways.projects.mongo;

import it.tramways.projects.mongo.model.RoadMapEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoadMapsMongoRepository extends MongoRepository<RoadMapEntity, Long> {

}
