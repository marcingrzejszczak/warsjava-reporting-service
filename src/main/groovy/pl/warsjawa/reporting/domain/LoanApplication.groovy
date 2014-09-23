package pl.warsjawa.reporting.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id

    String loanId, job, fraudStatus, decision
    int amount

}
