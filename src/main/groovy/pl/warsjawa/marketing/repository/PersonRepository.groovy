package pl.warsjawa.marketing.repository

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource
import pl.warsjawa.marketing.domain.Person

@RepositoryRestResource(collectionResourceRel = "persons", path = "persons")
interface PersonRepository extends PagingAndSortingRepository<Person, String> {

    @RestResource(path = 'firstName', rel = 'firstName')
    List<Person> findByFirstName(@Param("firstName") String firstName)

    @RestResource(path = 'lastName', rel = 'lastName')
    List<Person> findByLastName(@Param("lastName") String lastName)

}
