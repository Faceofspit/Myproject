
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Open360 extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://qc-performance.enlivencem.com")
    .inferHtmlResources(AllowList(), DenyList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*"""))
    .acceptHeader("application/json, text/plain, */*")
    .acceptEncodingHeader("gzip, deflate, br")
    .acceptLanguageHeader("en")
    .authorizationHeader("Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIyVFI1SFRncjJHcVZkUTVjM3Z6Qzk0X3N6eTIxTXRXaEhGLWxkMWZJeXcwIn0.eyJleHAiOjE3MDk2ODYyMjYsImlhdCI6MTcwNzA5NDIyNywiYXV0aF90aW1lIjoxNzA3MDk0MjI2LCJqdGkiOiI0YWNjNmY0NC1mZjg0LTQ0YjYtOGIzYy00M2NjN2Q0YzYzMmIiLCJpc3MiOiJodHRwczovL3FjLXBlcmZvcm1hbmNlLmVubGl2ZW5jZW0uY29tL2F1dGgvcmVhbG1zL1BUZW5hbnRPbmUiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiMDM3NzhjNGItYjRjZC00MDY0LTllZjktNDkyOGNkN2Y1NWQyIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZW5saXZlbi1ndWkiLCJub25jZSI6IjE5ZGZmNTgyLTI5OGItNDAwYi04N2ViLWQwYmVjNWEzYzRhZiIsInNlc3Npb25fc3RhdGUiOiI5NzliYzMxOS1iYjAwLTQwOWEtYjQyNC1hYjg3OGY4ZjRmYmYiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJTdWJzY3JpYmVyIEhlYWQiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwdG9uZXN1YnVzZXIxIn0.gDDU3yovqujvtH-LLWdERfEnfO33ZUU5A3VTWHKIfJk0KN8VYnZ_0owXIxrh-4JINBGGpVkOHjDdu6bPu3VosDJeS746nF_fO84BkEHgJiO3_8taPqJfgQ6cv-GgtJ2SWCj_oDN2ZcqZJ0u1dNz_iwEEJvFGO3o7W67ZaLwfS3oB8NayTbCHd8sLK03EjyNriV1N_H4R930Z_f1Y2tA19ibW7duMt6SPLf7SqC1Zriff61pqxeh07vvH02CDM1VVnT_ZAecJaAySr5tKs5jN12gW419N1DcFeQK8BfZqZYBH1Aw3p6_Mvy5K22-7aoixATQGYvyQnE97RcqfoHpHXA")
    .contentTypeHeader("application/json")
    .originHeader("https://qc-performance.enlivencem.com")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36")
  
  private val headers_0 = Map(
  		"access-control-allow-origin" -> "https://192.168.1.29:30141",
  		"pragma" -> "no-cache",
  		"sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin"
  )
  
  private val headers_36 = Map(
  		"access-control-allow-origin" -> "https://192.168.1.29:30141",
  		"pragma" -> "no-cache",
  		"sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin",
  		"selected-role" -> "Subscriber Head"
  )
  
  private val headers_63 = Map(
  		"access-control-allow-origin" -> "https://192.168.1.29:30141",
  		"activityid" -> "ENL_WORKQUEUE_UPDATE",
  		"moduleid" -> "UD",
  		"pragma" -> "no-cache",
  		"sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin"
  )


 val scn = scenario("Open360")
  .group("Open360_Requests") {
    exec(http("request_0")
        .post("/enliven-EIS-integration/query/getData")
        .headers(headers_0)
        .body(RawFileBody("open360/0000_request.json"))
        .resources(
          http("request_1")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0001_request.json")),
          http("request_2")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0002_request.json")),
          http("request_3")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_0)
            .body(RawFileBody("open360/0003_request.json")),
          http("request_4")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0004_request.json")),
          http("request_5")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0005_request.json")),
          http("request_6")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0006_request.json")),
          http("request_7")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0007_request.json")),
          http("request_8")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0008_request.json")),
          http("request_9")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0009_request.json")),
          http("request_10")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0010_request.json")),
          http("request_11")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_0)
            .body(RawFileBody("open360/0011_request.json")),
          http("request_12")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0012_request.json")),
          http("request_13")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0013_request.json")),
          http("request_14")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_0)
            .body(RawFileBody("open360/0014_request.json")),
          http("request_15")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0015_request.json")),
          http("request_16")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0016_request.json")),
          http("request_17")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0017_request.json")),
          http("request_18")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0018_request.json")),
          http("request_19")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0019_request.json")),
          http("request_20")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0020_request.json")),
          http("request_21")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0021_request.json")),
          http("request_22")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0022_request.json")),
          http("request_23")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0023_request.json")),
          http("request_24")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_0)
            .body(RawFileBody("open360/0024_request.json")),
          http("request_25")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0025_request.json")),
          http("request_26")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0026_request.json")),
          http("request_27")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0027_request.json")),
          http("request_28")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0028_request.json")),
          http("request_29")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0029_request.json")),
          http("request_30")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0030_request.json")),
          http("request_31")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0031_request.json")),
          http("request_32")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0032_request.json")),
          http("request_33")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0033_request.json")),
          http("request_34")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0034_request.json")),
          http("request_35")
            .post("/enliven-EIS-integration/idam/getUsers")
            .headers(headers_0)
            .body(RawFileBody("open360/0035_request.json")),
          http("request_36")
            .post("/enliven-work-queue/workqueue/search")
            .headers(headers_36)
            .body(RawFileBody("open360/0036_request.json")),
          http("request_37")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0037_request.json")),
          http("request_38")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0038_request.json")),
          http("request_39")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0039_request.json")),
          http("request_40")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0040_request.json")),
          http("request_41")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0041_request.json")),
          http("request_42")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0042_request.json"))
        )
    )
    .pause(1)
    .exec(
      http("request_43")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_36)
        .body(RawFileBody("open360/0043_request.json"))
        .resources(
          http("request_44")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0044_request.json")),
          http("request_45")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0045_request.json")),
          http("request_46")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0046_request.json")),
          http("request_47")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0047_request.json"))
        )
    )
    .pause(1)
    .exec(
      http("request_48")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_36)
        .body(RawFileBody("open360/0048_request.json"))
        .resources(
          http("request_49")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0049_request.json")),
          http("request_50")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0050_request.json"))
        ))
  }
  .group("Open360_Filter_Requests") {
    exec(http("request_51")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_36)
        .body(RawFileBody("open360/0051_request.json"))
    )
    .pause(13)
    .exec(
      http("request_52")
        .post("/enliven-EIS-integration/query/getData")
        .headers(headers_0)
        .body(RawFileBody("open360/0052_request.json"))
    )
    .pause(5)
    .exec(
      http("request_53")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_36)
        .body(RawFileBody("open360/0053_request.json"))
    );
  }
  .group("Open360_Close_Requests") {
    exec(http("request_54")
        .post("/enliven-EIS-services/core/getNextSequenceNumber")
        .headers(headers_0)
        .body(RawFileBody("open360/0054_request.json"))
        .resources(
          http("request_55")
            .post("/enliven-EIS-services/core/crud/read/SENSITIVE_DATA")
            .headers(headers_0)
            .body(RawFileBody("open360/0055_request.json")),
          http("request_56")
            .post("/enliven-EIS-services/core/crud/read/SENSITIVE_DATA")
            .headers(headers_0)
            .body(RawFileBody("open360/0056_request.json")),
          http("request_57")
            .post("/enliven-EIS-services/core/crud/read/TICKETS")
            .headers(headers_0)
            .body(RawFileBody("open360/0057_request.json")),
          http("request_58")
            .post("/enliven-EIS-services/core/crud/create/TICKETS")
            .headers(headers_0)
            .body(RawFileBody("open360/0058_request.json"))
        ))
  }
  .group("WorkQueue_Search_Requests") {
    exec( http("request_59")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_36)
        .body(RawFileBody("open360/0059_request.json"))
    )
    .pause(19)
    .exec(
      http("request_60")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_36)
        .body(RawFileBody("open360/0060_request.json"))
    )
    .pause(19)
    .exec(
      http("request_61")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_36)
        .body(RawFileBody("open360/0061_request.json"))
    )
    .pause(19)
    .exec(
      http("request_62")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_36)
        .body(RawFileBody("open360/0062_request.json"))
    )
    .pause(1)
    .exec(
      http("request_63")
        .post("/enliven-work-queue/workqueue/update")
        .headers(headers_63)
        .body(RawFileBody("open360/0063_request.json"))
        .resources(
          http("request_64")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0064_request.json")),
          http("request_65")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0065_request.json")),
          http("request_66")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0066_request.json")),
          http("request_67")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0067_request.json")),
          http("request_68")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0068_request.json")),
          http("request_69")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0069_request.json")),
          http("request_70")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_0)
            .body(RawFileBody("open360/0070_request.json")),
          http("request_71")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0071_request.json")),
          http("request_72")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0072_request.json")),
          http("request_73")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0073_request.json")),
          http("request_74")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0074_request.json")),
          http("request_75")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0075_request.json")),
          http("request_76")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0076_request.json")),
          http("request_77")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0077_request.json")),
          http("request_78")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0078_request.json")),
          http("request_79")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_0)
            .body(RawFileBody("open360/0079_request.json")),
          http("request_80")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0080_request.json")),
          http("request_81")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0081_request.json")),
          http("request_82")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0082_request.json")),
          http("request_83")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0083_request.json")),
          http("request_84")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0084_request.json")),
          http("request_85")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0085_request.json")),
          http("request_86")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0086_request.json")),
          http("request_87")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0087_request.json")),
          http("request_88")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0088_request.json")),
          http("request_89")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0089_request.json")),
          http("request_90")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_0)
            .body(RawFileBody("open360/0090_request.json")),
          http("request_91")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0091_request.json")),
          http("request_92")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_0)
            .body(RawFileBody("open360/0092_request.json")),
          http("request_93")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0093_request.json")),
          http("request_94")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0094_request.json")),
          http("request_95")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0095_request.json")),
          http("request_96")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0096_request.json")),
          http("request_97")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0097_request.json")),
          http("request_98")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0098_request.json")),
          http("request_99")
            .post("/enliven-EIS-integration/idam/getUsers")
            .headers(headers_0)
            .body(RawFileBody("open360/0099_request.json")),
          http("request_100")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0100_request.json")),
          http("request_101")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0101_request.json")),
          http("request_102")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0102_request.json")),
          http("request_103")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0103_request.json")),
          http("request_104")
            .post("/enliven-work-queue/workqueue/search")
            .headers(headers_36)
            .body(RawFileBody("open360/0104_request.json")),
          http("request_105")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0105_request.json")),
          http("request_106")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0106_request.json")),
          http("request_107")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0107_request.json")),
          http("request_108")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0108_request.json")),
          http("request_109")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0109_request.json")),
          http("request_110")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0110_request.json")),
          http("request_111")
            .post("/enliven-work-queue/workqueue/search")
            .headers(headers_36)
            .body(RawFileBody("open360/0111_request.json")),
          http("request_112")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0112_request.json")),
          http("request_113")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_0)
            .body(RawFileBody("open360/0113_request.json"))
        )
    )
    .pause(10)
    .exec(
      http("request_114")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_36)
        .body(RawFileBody("open360/0114_request.json"))
    );
  }
  .group("WorkQueue_Filter_Requests") {
    exec(http("request_115")
        .post("/enliven-EIS-integration/query/getData")
        .headers(headers_0)
        .body(RawFileBody("open360/0115_request.json"))
        .resources(
          http("request_116")
            .post("/enliven-work-queue/workqueue/search")
            .headers(headers_36)
            .body(RawFileBody("open360/0116_request.json"))
        ))
  }
  .group("WorkQueue_Close_Request") {
    exec( http("request_117")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_36)
        .body(RawFileBody("open360/0117_request.json")))
  }


	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
