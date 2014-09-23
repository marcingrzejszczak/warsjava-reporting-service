package pl.warsjawa.reporting.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "persons")
class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id

    String loanId, firstName, lastName

}
