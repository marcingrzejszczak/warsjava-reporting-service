package pl.warsjawa.marketing

import com.wordnik.swagger.annotations.Api
import com.wordnik.swagger.annotations.ApiOperation
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.web.bind.annotation.*

import javax.validation.constraints.NotNull
import java.util.concurrent.Callable

import static ReportingApi.*

@CompileStatic
@Slf4j
@RestController
@RequestMapping(API_URL)
@Api(value = "reportingService", description = "Serves reporting data on loan applications")
class ReportingController {

    @RequestMapping(
            value = REPORTING_APPLICATION_URL,
            method = RequestMethod.PUT,
            consumes = API_VERSION_1,
            produces = API_VERSION_1)
    @ApiOperation(value = "Async storing of loan application data",
            notes = "This will asynchronously stores loan application data")
    Callable<Void> prepareMarketingOffer(@PathVariable @NotNull String loanApplicationId, @RequestBody @NotNull String loanDetails) {
        return {
            log.debug("request received: $loanApplicationId -> $loanDetails")
        }
    }
}
