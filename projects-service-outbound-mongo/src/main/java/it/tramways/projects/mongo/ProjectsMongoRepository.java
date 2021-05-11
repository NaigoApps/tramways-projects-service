package it.tramways.projects.mongo;

import it.tramways.projects.mongo.model.ProjectEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectsMongoRepository extends MongoRepository<ProjectEntity, Long> {

}
