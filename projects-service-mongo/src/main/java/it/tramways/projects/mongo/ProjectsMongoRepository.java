package it.tramways.projects.mongo;

import it.tramways.projects.api.model.ProjectDescription;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectsMongoRepository extends MongoRepository<ProjectDescription, Long> {

}
