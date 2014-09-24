package pl.warsjawa.reporting.domain

class LoanData {

    String loanId, firstName, lastName, fraudStatus, decision
    int amount

    LoanData(String loanId, String firstName, String lastName, String fraudStatus, String decision, int amount) {
        this.loanId = loanId
        this.firstName = firstName
        this.lastName = lastName
        this.fraudStatus = fraudStatus
        this.decision = decision
        this.amount = amount
    }

}
