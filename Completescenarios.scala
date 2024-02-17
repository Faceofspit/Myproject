
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class kri extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://qc-performance.enlivencem.com")
    .inferHtmlResources(AllowList(), DenyList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*"""))
    .acceptHeader("application/json, text/plain, */*")
    .acceptEncodingHeader("gzip, deflate, br")
    .acceptLanguageHeader("en")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36")
  
  private val headers_0 = Map(
  		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
  		"accept-language" -> "en-US,en;q=0.9",
  		"pragma" -> "no-cache",
  		"sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "document",
  		"sec-fetch-mode" -> "navigate",
  		"sec-fetch-site" -> "none",
  		"sec-fetch-user" -> "?1",
  		"upgrade-insecure-requests" -> "1"
  )
  
  private val headers_1 = Map(
  		"accept" -> "*/*",
  		"accept-language" -> "en-US,en;q=0.9",
  		"origin" -> "https://qc-performance.enlivencem.com",
  		"pragma" -> "no-cache",
  		"sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "script",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "cross-site"
  )
  
  private val headers_2 = Map(
  		"accept" -> "*/*",
  		"content-type" -> "application/json",
  		"origin" -> "https://qc-performance.enlivencem.com",
  		"pragma" -> "no-cache",
  		"sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin",
  		"x-requested-with" -> "XMLHttpRequest"
  )
  
  private val headers_3 = Map(
  		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
  		"accept-language" -> "en-US,en;q=0.9",
  		"pragma" -> "no-cache",
  		"sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "document",
  		"sec-fetch-mode" -> "navigate",
  		"sec-fetch-site" -> "same-origin",
  		"upgrade-insecure-requests" -> "1"
  )
  
  private val headers_4 = Map(
  		"accept" -> "*/*",
  		"accept-language" -> "en-US,en;q=0.9",
  		"pragma" -> "no-cache",
  		"sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin"
  )
  
  private val headers_6 = Map(
  		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
  		"accept-language" -> "en-US,en;q=0.9",
  		"origin" -> "null",
  		"pragma" -> "no-cache",
  		"sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "document",
  		"sec-fetch-mode" -> "navigate",
  		"sec-fetch-site" -> "same-origin",
  		"sec-fetch-user" -> "?1",
  		"upgrade-insecure-requests" -> "1"
  )
  
  private val headers_9 = Map(
  		"accept" -> "*/*",
  		"accept-language" -> "en-US,en;q=0.9",
  		"origin" -> "https://qc-performance.enlivencem.com",
  		"pragma" -> "no-cache",
  		"sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin"
  )
  
  private val headers_10 = Map(
  		"accept" -> "application/json",
  		"accept-language" -> "en-US,en;q=0.9",
  		"authorization" -> "bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIyVFI1SFRncjJHcVZkUTVjM3Z6Qzk0X3N6eTIxTXRXaEhGLWxkMWZJeXcwIn0.eyJleHAiOjE3MDk4MzIxNTksImlhdCI6MTcwNzI0MDE2NSwiYXV0aF90aW1lIjoxNzA3MjQwMTU5LCJqdGkiOiIyN2Q5ZWZiMi1lYjAyLTRiZDAtYWMyOC1iMGQxZTZkODkyZmQiLCJpc3MiOiJodHRwczovL3FjLXBlcmZvcm1hbmNlLmVubGl2ZW5jZW0uY29tL2F1dGgvcmVhbG1zL1BUZW5hbnRPbmUiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiMDM3NzhjNGItYjRjZC00MDY0LTllZjktNDkyOGNkN2Y1NWQyIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZW5saXZlbi1ndWkiLCJub25jZSI6IjYyMTdlZDQ2LTlkYTItNDU0ZC04NjhjLWIxZDNhYmFiN2RmNyIsInNlc3Npb25fc3RhdGUiOiI4YmI3ZjgwNC03N2RiLTQ1MTctODAyMS05OTAwN2Q4MDEwZWQiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJTdWJzY3JpYmVyIEhlYWQiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwdG9uZXN1YnVzZXIxIn0.fGnEgNEG-1TWCX-2znsDvOEiLlg7I_DJm6yyPMTvJYXz4uNeuKhBb2PK9WrQkRufKTyanE8m8RjBa7uANHP1sIZ53yyu9_ku_ox1jexZMP8JLnIV_bH_P5KbCbtOI4crFUE0RYSXltZAqZuY2NJUharff-m-i5KhT7F4IDxdSsGxMwXqtxIb7rBTD4FWUU3x3i5gVwTYvlUsN1L6nuNxdPr3Z1WXtMQzxhQefNjriKMUHWRL1d4WRQLfoB72lz8i_GCdQxF5vFQtEey6LeMn5gMMAgFM0ze60Yz29Llza9XtpknVKmzkCue8RAfKRtLNW8miFIybP1MpICdSPeipag",
  		"pragma" -> "no-cache",
  		"sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin"
  )
  
  private val headers_11 = Map(
  		"authorization" -> "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIyVFI1SFRncjJHcVZkUTVjM3Z6Qzk0X3N6eTIxTXRXaEhGLWxkMWZJeXcwIn0.eyJleHAiOjE3MDk4MzIxNTksImlhdCI6MTcwNzI0MDE2NSwiYXV0aF90aW1lIjoxNzA3MjQwMTU5LCJqdGkiOiIyN2Q5ZWZiMi1lYjAyLTRiZDAtYWMyOC1iMGQxZTZkODkyZmQiLCJpc3MiOiJodHRwczovL3FjLXBlcmZvcm1hbmNlLmVubGl2ZW5jZW0uY29tL2F1dGgvcmVhbG1zL1BUZW5hbnRPbmUiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiMDM3NzhjNGItYjRjZC00MDY0LTllZjktNDkyOGNkN2Y1NWQyIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZW5saXZlbi1ndWkiLCJub25jZSI6IjYyMTdlZDQ2LTlkYTItNDU0ZC04NjhjLWIxZDNhYmFiN2RmNyIsInNlc3Npb25fc3RhdGUiOiI4YmI3ZjgwNC03N2RiLTQ1MTctODAyMS05OTAwN2Q4MDEwZWQiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJTdWJzY3JpYmVyIEhlYWQiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwdG9uZXN1YnVzZXIxIn0.fGnEgNEG-1TWCX-2znsDvOEiLlg7I_DJm6yyPMTvJYXz4uNeuKhBb2PK9WrQkRufKTyanE8m8RjBa7uANHP1sIZ53yyu9_ku_ox1jexZMP8JLnIV_bH_P5KbCbtOI4crFUE0RYSXltZAqZuY2NJUharff-m-i5KhT7F4IDxdSsGxMwXqtxIb7rBTD4FWUU3x3i5gVwTYvlUsN1L6nuNxdPr3Z1WXtMQzxhQefNjriKMUHWRL1d4WRQLfoB72lz8i_GCdQxF5vFQtEey6LeMn5gMMAgFM0ze60Yz29Llza9XtpknVKmzkCue8RAfKRtLNW8miFIybP1MpICdSPeipag",
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
  
  private val headers_13 = Map(
  		"access-control-allow-origin" -> "https://192.168.1.29:30141",
  		"authorization" -> "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIyVFI1SFRncjJHcVZkUTVjM3Z6Qzk0X3N6eTIxTXRXaEhGLWxkMWZJeXcwIn0.eyJleHAiOjE3MDk4MzIxNTksImlhdCI6MTcwNzI0MDE2NSwiYXV0aF90aW1lIjoxNzA3MjQwMTU5LCJqdGkiOiIyN2Q5ZWZiMi1lYjAyLTRiZDAtYWMyOC1iMGQxZTZkODkyZmQiLCJpc3MiOiJodHRwczovL3FjLXBlcmZvcm1hbmNlLmVubGl2ZW5jZW0uY29tL2F1dGgvcmVhbG1zL1BUZW5hbnRPbmUiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiMDM3NzhjNGItYjRjZC00MDY0LTllZjktNDkyOGNkN2Y1NWQyIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZW5saXZlbi1ndWkiLCJub25jZSI6IjYyMTdlZDQ2LTlkYTItNDU0ZC04NjhjLWIxZDNhYmFiN2RmNyIsInNlc3Npb25fc3RhdGUiOiI4YmI3ZjgwNC03N2RiLTQ1MTctODAyMS05OTAwN2Q4MDEwZWQiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJTdWJzY3JpYmVyIEhlYWQiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwdG9uZXN1YnVzZXIxIn0.fGnEgNEG-1TWCX-2znsDvOEiLlg7I_DJm6yyPMTvJYXz4uNeuKhBb2PK9WrQkRufKTyanE8m8RjBa7uANHP1sIZ53yyu9_ku_ox1jexZMP8JLnIV_bH_P5KbCbtOI4crFUE0RYSXltZAqZuY2NJUharff-m-i5KhT7F4IDxdSsGxMwXqtxIb7rBTD4FWUU3x3i5gVwTYvlUsN1L6nuNxdPr3Z1WXtMQzxhQefNjriKMUHWRL1d4WRQLfoB72lz8i_GCdQxF5vFQtEey6LeMn5gMMAgFM0ze60Yz29Llza9XtpknVKmzkCue8RAfKRtLNW8miFIybP1MpICdSPeipag",
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
  
  private val headers_14 = Map(
  		"access-control-allow-origin" -> "https://192.168.1.29:30141",
  		"authorization" -> "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIyVFI1SFRncjJHcVZkUTVjM3Z6Qzk0X3N6eTIxTXRXaEhGLWxkMWZJeXcwIn0.eyJleHAiOjE3MDk4MzIxNTksImlhdCI6MTcwNzI0MDE2NSwiYXV0aF90aW1lIjoxNzA3MjQwMTU5LCJqdGkiOiIyN2Q5ZWZiMi1lYjAyLTRiZDAtYWMyOC1iMGQxZTZkODkyZmQiLCJpc3MiOiJodHRwczovL3FjLXBlcmZvcm1hbmNlLmVubGl2ZW5jZW0uY29tL2F1dGgvcmVhbG1zL1BUZW5hbnRPbmUiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiMDM3NzhjNGItYjRjZC00MDY0LTllZjktNDkyOGNkN2Y1NWQyIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZW5saXZlbi1ndWkiLCJub25jZSI6IjYyMTdlZDQ2LTlkYTItNDU0ZC04NjhjLWIxZDNhYmFiN2RmNyIsInNlc3Npb25fc3RhdGUiOiI4YmI3ZjgwNC03N2RiLTQ1MTctODAyMS05OTAwN2Q4MDEwZWQiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJTdWJzY3JpYmVyIEhlYWQiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwdG9uZXN1YnVzZXIxIn0.fGnEgNEG-1TWCX-2znsDvOEiLlg7I_DJm6yyPMTvJYXz4uNeuKhBb2PK9WrQkRufKTyanE8m8RjBa7uANHP1sIZ53yyu9_ku_ox1jexZMP8JLnIV_bH_P5KbCbtOI4crFUE0RYSXltZAqZuY2NJUharff-m-i5KhT7F4IDxdSsGxMwXqtxIb7rBTD4FWUU3x3i5gVwTYvlUsN1L6nuNxdPr3Z1WXtMQzxhQefNjriKMUHWRL1d4WRQLfoB72lz8i_GCdQxF5vFQtEey6LeMn5gMMAgFM0ze60Yz29Llza9XtpknVKmzkCue8RAfKRtLNW8miFIybP1MpICdSPeipag",
  		"content-type" -> "application/json",
  		"origin" -> "https://qc-performance.enlivencem.com",
  		"pragma" -> "no-cache",
  		"read_for" -> "CONFIG",
  		"sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin"
  )
  
  private val headers_27 = Map(
  		"access-control-allow-origin" -> "https://192.168.1.29:30141",
  		"activityid" -> "OCE_LAYOUT_MASTER_SUBSCRIBER_LIST_VIEW",
  		"authorization" -> "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIyVFI1SFRncjJHcVZkUTVjM3Z6Qzk0X3N6eTIxTXRXaEhGLWxkMWZJeXcwIn0.eyJleHAiOjE3MDk4MzIxNTksImlhdCI6MTcwNzI0MDE2NSwiYXV0aF90aW1lIjoxNzA3MjQwMTU5LCJqdGkiOiIyN2Q5ZWZiMi1lYjAyLTRiZDAtYWMyOC1iMGQxZTZkODkyZmQiLCJpc3MiOiJodHRwczovL3FjLXBlcmZvcm1hbmNlLmVubGl2ZW5jZW0uY29tL2F1dGgvcmVhbG1zL1BUZW5hbnRPbmUiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiMDM3NzhjNGItYjRjZC00MDY0LTllZjktNDkyOGNkN2Y1NWQyIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZW5saXZlbi1ndWkiLCJub25jZSI6IjYyMTdlZDQ2LTlkYTItNDU0ZC04NjhjLWIxZDNhYmFiN2RmNyIsInNlc3Npb25fc3RhdGUiOiI4YmI3ZjgwNC03N2RiLTQ1MTctODAyMS05OTAwN2Q4MDEwZWQiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJTdWJzY3JpYmVyIEhlYWQiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwdG9uZXN1YnVzZXIxIn0.fGnEgNEG-1TWCX-2znsDvOEiLlg7I_DJm6yyPMTvJYXz4uNeuKhBb2PK9WrQkRufKTyanE8m8RjBa7uANHP1sIZ53yyu9_ku_ox1jexZMP8JLnIV_bH_P5KbCbtOI4crFUE0RYSXltZAqZuY2NJUharff-m-i5KhT7F4IDxdSsGxMwXqtxIb7rBTD4FWUU3x3i5gVwTYvlUsN1L6nuNxdPr3Z1WXtMQzxhQefNjriKMUHWRL1d4WRQLfoB72lz8i_GCdQxF5vFQtEey6LeMn5gMMAgFM0ze60Yz29Llza9XtpknVKmzkCue8RAfKRtLNW8miFIybP1MpICdSPeipag",
  		"content-type" -> "application/json",
  		"moduleid" -> "UD",
  		"origin" -> "https://qc-performance.enlivencem.com",
  		"pragma" -> "no-cache",
  		"sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin"
  )
  
  private val headers_35 = Map(
  		"access-control-allow-origin" -> "https://192.168.1.29:30141",
  		"authorization" -> "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIyVFI1SFRncjJHcVZkUTVjM3Z6Qzk0X3N6eTIxTXRXaEhGLWxkMWZJeXcwIn0.eyJleHAiOjE3MDk4MzIxNTksImlhdCI6MTcwNzI0MDE2NSwiYXV0aF90aW1lIjoxNzA3MjQwMTU5LCJqdGkiOiIyN2Q5ZWZiMi1lYjAyLTRiZDAtYWMyOC1iMGQxZTZkODkyZmQiLCJpc3MiOiJodHRwczovL3FjLXBlcmZvcm1hbmNlLmVubGl2ZW5jZW0uY29tL2F1dGgvcmVhbG1zL1BUZW5hbnRPbmUiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiMDM3NzhjNGItYjRjZC00MDY0LTllZjktNDkyOGNkN2Y1NWQyIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZW5saXZlbi1ndWkiLCJub25jZSI6IjYyMTdlZDQ2LTlkYTItNDU0ZC04NjhjLWIxZDNhYmFiN2RmNyIsInNlc3Npb25fc3RhdGUiOiI4YmI3ZjgwNC03N2RiLTQ1MTctODAyMS05OTAwN2Q4MDEwZWQiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJTdWJzY3JpYmVyIEhlYWQiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwdG9uZXN1YnVzZXIxIn0.fGnEgNEG-1TWCX-2znsDvOEiLlg7I_DJm6yyPMTvJYXz4uNeuKhBb2PK9WrQkRufKTyanE8m8RjBa7uANHP1sIZ53yyu9_ku_ox1jexZMP8JLnIV_bH_P5KbCbtOI4crFUE0RYSXltZAqZuY2NJUharff-m-i5KhT7F4IDxdSsGxMwXqtxIb7rBTD4FWUU3x3i5gVwTYvlUsN1L6nuNxdPr3Z1WXtMQzxhQefNjriKMUHWRL1d4WRQLfoB72lz8i_GCdQxF5vFQtEey6LeMn5gMMAgFM0ze60Yz29Llza9XtpknVKmzkCue8RAfKRtLNW8miFIybP1MpICdSPeipag",
  		"content-type" -> "application/json",
  		"origin" -> "https://qc-performance.enlivencem.com",
  		"pragma" -> "no-cache",
  		"sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin",
  		"selected-role" -> "Subscriber Head"
  )
  
  private val headers_57 = Map(
  		"accept" -> "*/*",
  		"accept-language" -> "en-US,en;q=0.9",
  		"origin" -> "https://qc-performance.enlivencem.com",
  		"pragma" -> "no-cache",
  		"sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "font",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin"
  )
  
  private val headers_115 = Map(
  		"access-control-allow-origin" -> "https://192.168.1.29:30141",
  		"activityid" -> "ENL_WORKQUEUE_UPDATE",
  		"authorization" -> "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIyVFI1SFRncjJHcVZkUTVjM3Z6Qzk0X3N6eTIxTXRXaEhGLWxkMWZJeXcwIn0.eyJleHAiOjE3MDk4MzIxNTksImlhdCI6MTcwNzI0MDE2NSwiYXV0aF90aW1lIjoxNzA3MjQwMTU5LCJqdGkiOiIyN2Q5ZWZiMi1lYjAyLTRiZDAtYWMyOC1iMGQxZTZkODkyZmQiLCJpc3MiOiJodHRwczovL3FjLXBlcmZvcm1hbmNlLmVubGl2ZW5jZW0uY29tL2F1dGgvcmVhbG1zL1BUZW5hbnRPbmUiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiMDM3NzhjNGItYjRjZC00MDY0LTllZjktNDkyOGNkN2Y1NWQyIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZW5saXZlbi1ndWkiLCJub25jZSI6IjYyMTdlZDQ2LTlkYTItNDU0ZC04NjhjLWIxZDNhYmFiN2RmNyIsInNlc3Npb25fc3RhdGUiOiI4YmI3ZjgwNC03N2RiLTQ1MTctODAyMS05OTAwN2Q4MDEwZWQiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJTdWJzY3JpYmVyIEhlYWQiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwdG9uZXN1YnVzZXIxIn0.fGnEgNEG-1TWCX-2znsDvOEiLlg7I_DJm6yyPMTvJYXz4uNeuKhBb2PK9WrQkRufKTyanE8m8RjBa7uANHP1sIZ53yyu9_ku_ox1jexZMP8JLnIV_bH_P5KbCbtOI4crFUE0RYSXltZAqZuY2NJUharff-m-i5KhT7F4IDxdSsGxMwXqtxIb7rBTD4FWUU3x3i5gVwTYvlUsN1L6nuNxdPr3Z1WXtMQzxhQefNjriKMUHWRL1d4WRQLfoB72lz8i_GCdQxF5vFQtEey6LeMn5gMMAgFM0ze60Yz29Llza9XtpknVKmzkCue8RAfKRtLNW8miFIybP1MpICdSPeipag",
  		"content-type" -> "application/json",
  		"moduleid" -> "UD",
  		"origin" -> "https://qc-performance.enlivencem.com",
  		"pragma" -> "no-cache",
  		"sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin"
  )
  
  private val uri1 = "https://connect.facebook.net/en_US/sdk.js"

  val login_scenario = scenario("Login")  
    .exec(
      http("Login-tenantId")
        .get("/Enliven/?tenantId=PTenantone")
        .headers(headers_0)
        .resources(
          http("modern_es6")
            .get(uri1 + "?hash=6b2593aa3f6b51713f7423277d37c89d&ua=modern_es6")
            .headers(headers_1)
        )
    )
    .pause(4)
	
    .exec(
      http("getClientSecretKey")
        .post("/enliven-EIS-services/idam/public/getClientSecretKey")
        .headers(headers_2)
        .body(RawFileBody("kr/0002_request.json"))
        .resources(
          http("Auth")
            .get("/auth/realms/PTenantone/protocol/openid-connect/auth?client_id=enliven-gui&redirect_uri=https%3A%2F%2Fqc-performance.enlivencem.com%2FEnliven%2F%3FtenantId%3DPTenantone&state=22c07c94-392c-48da-8841-03f80f2a073a&response_mode=fragment&response_type=code&scope=openid&nonce=6217ed46-9da2-454d-868c-b1d3abab7df7")
            .headers(headers_3),
          http("getSystemVariables")
            .get("/auth/realms/PTenantone/enliven_resource/getSystemVariables")
            .headers(headers_4),
          http("getAppDetails")
            .get("/enliven-EIS-integration/enlivenWebhook/getAppDetails")
            .headers(headers_4)
        )
    )
	
    .pause(20)
    .exec(
      http("auth")
        .post("/auth/realms/PTenantOne/login-actions/authenticate?session_code=P788OTWeM8UgnDW40p3mejWqBYvGCyDZg8kJCG_cHkU&execution=569eb383-c34b-438a-a5ce-c27511d5f65a&client_id=enliven-gui&tab_id=G9XyfvXgsvA")
        .headers(headers_6)
        .formParam("username", "ptonesubuser1")
        .formParam("password", "Admin@123")
        .resources(
          http("modern_es6")
            .get(uri1 + "?hash=6b2593aa3f6b51713f7423277d37c89d&ua=modern_es6")
            .headers(headers_1)
        )
    )
    .pause(5)


	val data_search_list_page = scenario("Data search list page") 
    exec(
      http("Data-search-list-page-sub-preview-view")
        .get("https://qc-performance.enlivencem.com/Enliven/?tenantId=PTenantone#/oce/sub-preview-view"))
        .pause(15)
		
	
	val data_search_open_360 = scenario("Data-search-open-360") 
    .exec(
      http("open-360-Pe-icon-7-stroke.woff?d7yf1v")
        .get("/Enliven/assets/scss/common/pe-icon-7-stroke/fonts/Pe-icon-7-stroke.woff?d7yf1v")
        .headers(headers_57)
        .resources(
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0058_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0059_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0060_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0061_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0062_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0063_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0064_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0065_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0066_request.json")),
          http("read-form-db-data")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_13)
            .body(RawFileBody("kr/0067_request.json")),
          http("read-form-db-data")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_13)
            .body(RawFileBody("kr/0068_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0069_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0070_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0071_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0072_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0073_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0074_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0075_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0076_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0077_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0078_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0079_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0080_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0081_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0082_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0083_request.json")),
          http("read-form-db-data")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_13)
            .body(RawFileBody("kr/0084_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0085_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0086_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0087_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0088_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0089_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0090_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0091_request.json")),
          http("read-form-db-data")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_13)
            .body(RawFileBody("kr/0092_request.json")),
          http("search")
            .post("/enliven-work-queue/workqueue/search")
            .headers(headers_35)
            .body(RawFileBody("kr/0093_request.json")),
          http("getUsers")
            .post("/enliven-EIS-integration/idam/getUsers")
            .headers(headers_13)
            .body(RawFileBody("kr/0094_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0095_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0096_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0097_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0098_request.json"))
        )
    )
    .pause(1)
    .exec(
      http("search")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_35)
        .body(RawFileBody("kr/0099_request.json"))
        .resources(
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0100_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0101_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0102_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0103_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0104_request.json")),
          http("search")
            .post("/enliven-work-queue/workqueue/search")
            .headers(headers_35)
            .body(RawFileBody("kr/0105_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0106_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0107_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0108_request.json"))
        )
    )
    .pause(6)
    .exec(
      http("search")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_35)
        .body(RawFileBody("kr/0109_request.json"))
    )
    .pause(12)
	
	val data_search_close = scenario("Data search open 360 close") 
    .exec(
      http("data-search-close-getNextSequenceNumber")
        .post("/enliven-EIS-services/core/getNextSequenceNumber")
        .headers(headers_13)
        .body(RawFileBody("kr/0110_request.json"))
        .resources(
          http("SENSITIVE_DATA")
            .post("/enliven-EIS-services/core/crud/read/SENSITIVE_DATA")
            .headers(headers_13)
            .body(RawFileBody("kr/0111_request.json")),
          http("SENSITIVE_DATA")
            .post("/enliven-EIS-services/core/crud/read/SENSITIVE_DATA")
            .headers(headers_13)
            .body(RawFileBody("kr/0112_request.json")),
          http("TICKETS")
            .post("/enliven-EIS-services/core/crud/read/TICKETS")
            .headers(headers_13)
            .body(RawFileBody("kr/0114_request.json"))
        )
    )
    .pause(2)
	
	val workQueueSearchOpen360Requests = scenario("work Queue search open 360") 
    .exec(
      http("workQueueSearchOpen360-update")
        .post("/enliven-work-queue/workqueue/update")
        .headers(headers_115)
        .body(RawFileBody("kr/0115_request.json"))
        .resources(
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0116_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0117_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0118_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0119_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0120_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0121_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0122_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0123_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0124_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0125_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0126_request.json")),
          http("search")
            .post("/enliven-work-queue/workqueue/search")
            .headers(headers_35)
            .body(RawFileBody("kr/0127_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0128_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0129_request.json")),
          http("read-form-db-data")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_13)
            .body(RawFileBody("kr/0130_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0131_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0132_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0133_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0134_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0135_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0136_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0137_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0138_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0139_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0140_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0141_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0142_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0143_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0144_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0145_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_13)
            .body(RawFileBody("kr/0146_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0147_request.json")),
          http("read-form-db-data")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_13)
            .body(RawFileBody("kr/0148_request.json")),
          http("read-form-db-data")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_13)
            .body(RawFileBody("kr/0149_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0150_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0151_request.json")),
          http("getUsers")
            .post("/enliven-EIS-integration/idam/getUsers")
            .headers(headers_13)
            .body(RawFileBody("kr/0152_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0153_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0154_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0155_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0156_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0157_request.json")),
          http("search")
            .post("/enliven-work-queue/workqueue/search")
            .headers(headers_35)
            .body(RawFileBody("kr/0158_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0159_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0160_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0161_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0162_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0163_request.json"))
        )
    )
    .pause(7)
	
	
	val workQueuePendingRequests = scenario("work queue pending")
    .exec(
      http("workQueuePending-search")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_35)
        .body(RawFileBody("kr/0164_request.json"))
        .resources(
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0165_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("kr/0166_request.json"))
        )
    )
    .pause(15)
    .exec(
      http("search")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_35)
        .body(RawFileBody("kr/0167_request.json"))
    )
	
	val scn = scenario("Open360").exec(login_scenario, data_search_list_page, data_search_open_360, data_search_close, workQueueSearchOpen360Requests, workQueuePendingRequests)

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
