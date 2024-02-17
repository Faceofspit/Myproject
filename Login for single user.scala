import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class Login extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://qc-performance.enlivencem.com")
    .inferHtmlResources(AllowList(), DenyList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*"""))
    .acceptHeader("application/json, text/plain, */*")
    .acceptEncodingHeader("gzip, deflate, br")
    .acceptLanguageHeader("en")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36")
	
  private val headers_17 = Map(
    "access-control-allow-origin" -> "https://192.168.1.29:30141",
    "authorization" -> "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIyVFI1SFRncjJHcVZkUTVjM3Z6Qzk0X3N6eTIxTXRXaEhGLWxkMWZJeXcwIn0.eyJleHAiOjE3MDk3Mzc4ODUsImlhdCI6MTcwNzE0NTg5NSwiYXV0aF90aW1lIjoxNzA3MTQ1ODg1LCJqdGkiOiI4MTg2YjcyMC03NjcyLTQ0MWYtOWFmNy1jNWNiYTMwYjc2YmUiLCJpc3MiOiJodHRwczovL3FjLXBlcmZvcm1hbmNlLmVubGl2ZW5jZW0uY29tL2F1dGgvcmVhbG1zL1BUZW5hbnRPbmUiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiMDM3NzhjNGItYjRjZC00MDY0LTllZjktNDkyOGNkN2Y1NWQyIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZW5saXZlbi1ndWkiLCJub25jZSI6ImZhZDNiY2ZjLTA2ZjQtNDVlNi04YTJhLWQyMzc2ZmYyNTZhYSIsInNlc3Npb25fc3RhdGUiOiIzZGE2YTc1ZS1mNTQ5LTRkZTQtYjk0My00NzEwZmVjZjk0MjMiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJTdWJzY3JpYmVyIEhlYWQiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwdG9uZXN1YnVzZXIxIn0.grc59UpCxrZRuInHbGxjhq0et54eiRf71anjj9uSis7_GpVWiLG48vAyJFmKGzJsVyHGQHqwxiMeJrGeKPaJojS72twhHYi79AcwSiTw3LrN9eCuhsHvJ3vLuOrGx1YIN49TOi7Yizbl8aUAXbjUFpE_Wgneoal42rHuNnPQDrnUWFIhUBxgIhVjMEfEKm5TmcyPKq3g48zhGJBaRmc1p-16ree-wTLJ734BpnCuWFtJWqFJPzrHcfz484wGqRiSNEaOEl5IIAwLPuEmSuYlVDa0-YKbHCXb0CCNbowvGVqTIoI3e8ULZ63I-uUo7J1HzBZG4lOrSoaae_kBYJyiCw",
    "content-type" -> "application/json",
    "origin" -> "https://qc-performance.enlivencem.com",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin"
  )

  val username = "ptonesubuser1"
  val password = "Admin@123"

  val loginScenario = scenario("Login")
    .exec(http("Open Login Page")
      .get("/Enliven/?tenantId=PTenantOne")) // Initial GET request to open the login page
    .pause(1) // Pause to mimic human behavior
    .exec(http("Submit Login Form")
      .post("/auth/realms/PTenantOne/protocol/openid-connect/token") // POST request to submit login credentials
      .formParam("username", username)
      .formParam("password", password)
      .formParam("grant_type", "password")
      .formParam("client_id", "admin-cli")
      .check(status.is(200))) // Assuming 200 is the successful login status code
    .exec(http("Data search list page")
      .get("https://qc-performance.enlivencem.com/Enliven/?tenantId=PTenantone#/oce/sub-preview-view")) 
    .pause(5) // Adjust this pause duration as needed
    .exec(http("open-360")
        .post("/enliven-EIS-integration/query/getData")
        .headers(headers_17)
        .body(RawFileBody("k/0055_request.json")))
      .pause(5)
	
  setUp(
    loginScenario.inject(atOnceUsers(1))
  ).protocols(httpProtocol)

}
