package coo.develhope.apispringrepository02.repositories;

import coo.develhope.apispringrepository02.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages",  collectionResourceDescription = @Description("Repository for programming languages"))
public interface ProgrammingLanguageRepository extends JpaRepository <ProgrammingLanguage, Long> {
}
