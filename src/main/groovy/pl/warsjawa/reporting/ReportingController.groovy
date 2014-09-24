package pl.warsjawa.reporting

import com.wordnik.swagger.annotations.Api
import com.wordnik.swagger.annotations.ApiOperation
import groovy.json.JsonOutput
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

import javax.persistence.EntityManager
import java.util.concurrent.Callable

import static ReportingApi.*

@Slf4j
@CompileStatic
@RestController
@RequestMapping(API_URL)
@Api(value = "reportingService", description = "Serves reporting data on loan applications")
class ReportingController {

    @Autowired
    private EntityManager entityManager

    @RequestMapping(
            value = REPORTING_APPLICATION_ROOT_URL,
            method = RequestMethod.GET,
            produces = API_VERSION_1)
    @ApiOperation(value = "Async storing of loan application data",
            notes = "This will asynchronously stores loan application data")
    Callable<String> reportAllLoans() {
        return {
            def query = entityManager.createQuery("""SELECT NEW pl.warsjawa.reporting.domain.LoanData(c.loanId, c.firstName, c.lastName, l.fraudStatus, l.decision, l.amount)
                                                        FROM Client as c, LoanApplication as l WHERE c.loanId = l.loanId""")
            List resultList = query.getResultList()
            def json = JsonOutput.toJson(resultList)

            log.debug("""Reponse JSON created: $json""")

            return json
        }
    }
}
