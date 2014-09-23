package pl.warsjawa.reporting.domain

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class LoanApplication {

    @Id
    private String id
    private String job
    private int amount
    private String fraudStatus
    private String decision

}
