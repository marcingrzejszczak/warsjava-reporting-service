package pl.warsjawa.marketing.domain

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Person {

    @Id
    private String id
    private String firstName
    private String lastName

}
