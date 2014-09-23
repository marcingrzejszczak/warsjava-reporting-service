package pl.warsjawa.reporting.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id

    private String loanId
    private String job
    private int amount
    private String fraudStatus
    private String decision

}
