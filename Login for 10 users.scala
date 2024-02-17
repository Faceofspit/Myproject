import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class LoginSimulation extends Simulation {

  val baseURL = "https://qc-performance.enlivencem.com"
  val loginPath = "/Enliven/?tenantId=PTenantone#/oce/sub-preview-view"
  val username = "ptonesubuser1"
  val password = "Admin@123"

  val loginScenario = scenario("Login")
    .exec(http("Open Login Page")
      .get(loginPath))
    .pause(1)
    .exec(http("Submit Login Form")
      .post("/auth/realms/PTenantone/protocol/openid-connect/token")
      .formParam("username", username)
      .formParam("password", password)
      .formParam("grant_type", "password")
      .formParam("client_id", "admin-cli")
      .check(status.is(200))) // Assuming 200 is the successful login status code

  setUp(
    loginScenario.inject(atOnceUsers(1))
  ).protocols(http.baseUrl(baseURL))
}
