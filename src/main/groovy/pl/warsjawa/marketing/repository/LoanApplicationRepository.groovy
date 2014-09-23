package pl.warsjawa.marketing.repository

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource
import pl.warsjawa.marketing.domain.LoanApplication

@RepositoryRestResource(collectionResourceRel = "loans", path = "loans")
interface LoanApplicationRepository extends  PagingAndSortingRepository<LoanApplication, String> {

    @RestResource(path = 'amount', rel = 'amount')
    List<LoanApplication> findByAmount(@Param("amount") int amount)

    @RestResource(path = 'fraudStatus', rel = 'fraudStatus')
    List<LoanApplication> findByFraudStatus(@Param("fraudStatus") String fraudStatus)

    @RestResource(path = 'decision', rel = 'decision')
    List<LoanApplication> findByDecision(@Param("decision") String decision)

}
