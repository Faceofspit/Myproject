
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class B extends Simulation {

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
  		"authorization" -> "bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIyVFI1SFRncjJHcVZkUTVjM3Z6Qzk0X3N6eTIxTXRXaEhGLWxkMWZJeXcwIn0.eyJleHAiOjE3MTA0OTM5MzMsImlhdCI6MTcwNzkwMTkzNiwiYXV0aF90aW1lIjoxNzA3OTAxOTMzLCJqdGkiOiIyMTE2YjBjYS02YmQyLTQ1NjktOTJlNi03MDU4MDBiZTJkMjgiLCJpc3MiOiJodHRwczovL3FjLXBlcmZvcm1hbmNlLmVubGl2ZW5jZW0uY29tL2F1dGgvcmVhbG1zL1BUZW5hbnRPbmUiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiMDM3NzhjNGItYjRjZC00MDY0LTllZjktNDkyOGNkN2Y1NWQyIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZW5saXZlbi1ndWkiLCJub25jZSI6ImI5ZDkyNDk3LWI1MzItNGI0Zi04YWM0LTNmYTI3NTFmOGYxMSIsInNlc3Npb25fc3RhdGUiOiJkNzc5NGRhYS1mZmM2LTQxZjUtOWQzZC0xNzk2M2ZhNGEzNDgiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJTdWJzY3JpYmVyIEhlYWQiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwdG9uZXN1YnVzZXIxIn0.SnQU7sWCeLX3wKLBMt23zJJ1_tqD2X620f0Vh4KacUtqptbNbxE4FGJHm2k2EuMxv8eF5xM3huTUZuAbU_ikfNzBWYs2irhF_dydw5evgE8GRaBLsxmG0ETCjalkGZDzPdQvFA7EJU9GvgA3c_inp9R8erpPS26gWRXzEj90cqbJ8sSR8qBTqjoqWcfXff9J8lqFZdsXXGt5GSwE7XSeQecfSG53WPKaIVoAtGrrIRrCgFZepCw_QrKahhuszx-ZirpNQ4oJ_lMLxYDUpMARYHpc5cZFOHoBy2yO2n8ZG0S8C-KrmsQw6p6A_9dJVofsivp1mzMVH3TOyULhMZCoaw",
  		"pragma" -> "no-cache",
  		"sec-ch-ua" -> """Not A(Brand";v="99", "Google Chrome";v="121", "Chromium";v="121""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin"
  )
  
  private val headers_11 = Map(
  		"authorization" -> "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIyVFI1SFRncjJHcVZkUTVjM3Z6Qzk0X3N6eTIxTXRXaEhGLWxkMWZJeXcwIn0.eyJleHAiOjE3MTA0OTM5MzMsImlhdCI6MTcwNzkwMTkzNiwiYXV0aF90aW1lIjoxNzA3OTAxOTMzLCJqdGkiOiIyMTE2YjBjYS02YmQyLTQ1NjktOTJlNi03MDU4MDBiZTJkMjgiLCJpc3MiOiJodHRwczovL3FjLXBlcmZvcm1hbmNlLmVubGl2ZW5jZW0uY29tL2F1dGgvcmVhbG1zL1BUZW5hbnRPbmUiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiMDM3NzhjNGItYjRjZC00MDY0LTllZjktNDkyOGNkN2Y1NWQyIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZW5saXZlbi1ndWkiLCJub25jZSI6ImI5ZDkyNDk3LWI1MzItNGI0Zi04YWM0LTNmYTI3NTFmOGYxMSIsInNlc3Npb25fc3RhdGUiOiJkNzc5NGRhYS1mZmM2LTQxZjUtOWQzZC0xNzk2M2ZhNGEzNDgiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJTdWJzY3JpYmVyIEhlYWQiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwdG9uZXN1YnVzZXIxIn0.SnQU7sWCeLX3wKLBMt23zJJ1_tqD2X620f0Vh4KacUtqptbNbxE4FGJHm2k2EuMxv8eF5xM3huTUZuAbU_ikfNzBWYs2irhF_dydw5evgE8GRaBLsxmG0ETCjalkGZDzPdQvFA7EJU9GvgA3c_inp9R8erpPS26gWRXzEj90cqbJ8sSR8qBTqjoqWcfXff9J8lqFZdsXXGt5GSwE7XSeQecfSG53WPKaIVoAtGrrIRrCgFZepCw_QrKahhuszx-ZirpNQ4oJ_lMLxYDUpMARYHpc5cZFOHoBy2yO2n8ZG0S8C-KrmsQw6p6A_9dJVofsivp1mzMVH3TOyULhMZCoaw",
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
  		"authorization" -> "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIyVFI1SFRncjJHcVZkUTVjM3Z6Qzk0X3N6eTIxTXRXaEhGLWxkMWZJeXcwIn0.eyJleHAiOjE3MTA0OTM5MzMsImlhdCI6MTcwNzkwMTkzNiwiYXV0aF90aW1lIjoxNzA3OTAxOTMzLCJqdGkiOiIyMTE2YjBjYS02YmQyLTQ1NjktOTJlNi03MDU4MDBiZTJkMjgiLCJpc3MiOiJodHRwczovL3FjLXBlcmZvcm1hbmNlLmVubGl2ZW5jZW0uY29tL2F1dGgvcmVhbG1zL1BUZW5hbnRPbmUiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiMDM3NzhjNGItYjRjZC00MDY0LTllZjktNDkyOGNkN2Y1NWQyIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZW5saXZlbi1ndWkiLCJub25jZSI6ImI5ZDkyNDk3LWI1MzItNGI0Zi04YWM0LTNmYTI3NTFmOGYxMSIsInNlc3Npb25fc3RhdGUiOiJkNzc5NGRhYS1mZmM2LTQxZjUtOWQzZC0xNzk2M2ZhNGEzNDgiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJTdWJzY3JpYmVyIEhlYWQiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwdG9uZXN1YnVzZXIxIn0.SnQU7sWCeLX3wKLBMt23zJJ1_tqD2X620f0Vh4KacUtqptbNbxE4FGJHm2k2EuMxv8eF5xM3huTUZuAbU_ikfNzBWYs2irhF_dydw5evgE8GRaBLsxmG0ETCjalkGZDzPdQvFA7EJU9GvgA3c_inp9R8erpPS26gWRXzEj90cqbJ8sSR8qBTqjoqWcfXff9J8lqFZdsXXGt5GSwE7XSeQecfSG53WPKaIVoAtGrrIRrCgFZepCw_QrKahhuszx-ZirpNQ4oJ_lMLxYDUpMARYHpc5cZFOHoBy2yO2n8ZG0S8C-KrmsQw6p6A_9dJVofsivp1mzMVH3TOyULhMZCoaw",
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
  		"authorization" -> "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIyVFI1SFRncjJHcVZkUTVjM3Z6Qzk0X3N6eTIxTXRXaEhGLWxkMWZJeXcwIn0.eyJleHAiOjE3MTA0OTM5MzMsImlhdCI6MTcwNzkwMTkzNiwiYXV0aF90aW1lIjoxNzA3OTAxOTMzLCJqdGkiOiIyMTE2YjBjYS02YmQyLTQ1NjktOTJlNi03MDU4MDBiZTJkMjgiLCJpc3MiOiJodHRwczovL3FjLXBlcmZvcm1hbmNlLmVubGl2ZW5jZW0uY29tL2F1dGgvcmVhbG1zL1BUZW5hbnRPbmUiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiMDM3NzhjNGItYjRjZC00MDY0LTllZjktNDkyOGNkN2Y1NWQyIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZW5saXZlbi1ndWkiLCJub25jZSI6ImI5ZDkyNDk3LWI1MzItNGI0Zi04YWM0LTNmYTI3NTFmOGYxMSIsInNlc3Npb25fc3RhdGUiOiJkNzc5NGRhYS1mZmM2LTQxZjUtOWQzZC0xNzk2M2ZhNGEzNDgiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJTdWJzY3JpYmVyIEhlYWQiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwdG9uZXN1YnVzZXIxIn0.SnQU7sWCeLX3wKLBMt23zJJ1_tqD2X620f0Vh4KacUtqptbNbxE4FGJHm2k2EuMxv8eF5xM3huTUZuAbU_ikfNzBWYs2irhF_dydw5evgE8GRaBLsxmG0ETCjalkGZDzPdQvFA7EJU9GvgA3c_inp9R8erpPS26gWRXzEj90cqbJ8sSR8qBTqjoqWcfXff9J8lqFZdsXXGt5GSwE7XSeQecfSG53WPKaIVoAtGrrIRrCgFZepCw_QrKahhuszx-ZirpNQ4oJ_lMLxYDUpMARYHpc5cZFOHoBy2yO2n8ZG0S8C-KrmsQw6p6A_9dJVofsivp1mzMVH3TOyULhMZCoaw",
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
  
  private val headers_34 = Map(
  		"access-control-allow-origin" -> "https://192.168.1.29:30141",
  		"authorization" -> "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIyVFI1SFRncjJHcVZkUTVjM3Z6Qzk0X3N6eTIxTXRXaEhGLWxkMWZJeXcwIn0.eyJleHAiOjE3MTA0OTM5MzMsImlhdCI6MTcwNzkwMTkzNiwiYXV0aF90aW1lIjoxNzA3OTAxOTMzLCJqdGkiOiIyMTE2YjBjYS02YmQyLTQ1NjktOTJlNi03MDU4MDBiZTJkMjgiLCJpc3MiOiJodHRwczovL3FjLXBlcmZvcm1hbmNlLmVubGl2ZW5jZW0uY29tL2F1dGgvcmVhbG1zL1BUZW5hbnRPbmUiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiMDM3NzhjNGItYjRjZC00MDY0LTllZjktNDkyOGNkN2Y1NWQyIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZW5saXZlbi1ndWkiLCJub25jZSI6ImI5ZDkyNDk3LWI1MzItNGI0Zi04YWM0LTNmYTI3NTFmOGYxMSIsInNlc3Npb25fc3RhdGUiOiJkNzc5NGRhYS1mZmM2LTQxZjUtOWQzZC0xNzk2M2ZhNGEzNDgiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJTdWJzY3JpYmVyIEhlYWQiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwdG9uZXN1YnVzZXIxIn0.SnQU7sWCeLX3wKLBMt23zJJ1_tqD2X620f0Vh4KacUtqptbNbxE4FGJHm2k2EuMxv8eF5xM3huTUZuAbU_ikfNzBWYs2irhF_dydw5evgE8GRaBLsxmG0ETCjalkGZDzPdQvFA7EJU9GvgA3c_inp9R8erpPS26gWRXzEj90cqbJ8sSR8qBTqjoqWcfXff9J8lqFZdsXXGt5GSwE7XSeQecfSG53WPKaIVoAtGrrIRrCgFZepCw_QrKahhuszx-ZirpNQ4oJ_lMLxYDUpMARYHpc5cZFOHoBy2yO2n8ZG0S8C-KrmsQw6p6A_9dJVofsivp1mzMVH3TOyULhMZCoaw",
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
  
  private val headers_49 = Map(
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
  
  private val headers_106 = Map(
  		"access-control-allow-origin" -> "https://192.168.1.29:30141",
  		"activityid" -> "ENL_WORKQUEUE_UPDATE",
  		"authorization" -> "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIyVFI1SFRncjJHcVZkUTVjM3Z6Qzk0X3N6eTIxTXRXaEhGLWxkMWZJeXcwIn0.eyJleHAiOjE3MTA0OTM5MzMsImlhdCI6MTcwNzkwMTkzNiwiYXV0aF90aW1lIjoxNzA3OTAxOTMzLCJqdGkiOiIyMTE2YjBjYS02YmQyLTQ1NjktOTJlNi03MDU4MDBiZTJkMjgiLCJpc3MiOiJodHRwczovL3FjLXBlcmZvcm1hbmNlLmVubGl2ZW5jZW0uY29tL2F1dGgvcmVhbG1zL1BUZW5hbnRPbmUiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiMDM3NzhjNGItYjRjZC00MDY0LTllZjktNDkyOGNkN2Y1NWQyIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZW5saXZlbi1ndWkiLCJub25jZSI6ImI5ZDkyNDk3LWI1MzItNGI0Zi04YWM0LTNmYTI3NTFmOGYxMSIsInNlc3Npb25fc3RhdGUiOiJkNzc5NGRhYS1mZmM2LTQxZjUtOWQzZC0xNzk2M2ZhNGEzNDgiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJTdWJzY3JpYmVyIEhlYWQiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwdG9uZXN1YnVzZXIxIn0.SnQU7sWCeLX3wKLBMt23zJJ1_tqD2X620f0Vh4KacUtqptbNbxE4FGJHm2k2EuMxv8eF5xM3huTUZuAbU_ikfNzBWYs2irhF_dydw5evgE8GRaBLsxmG0ETCjalkGZDzPdQvFA7EJU9GvgA3c_inp9R8erpPS26gWRXzEj90cqbJ8sSR8qBTqjoqWcfXff9J8lqFZdsXXGt5GSwE7XSeQecfSG53WPKaIVoAtGrrIRrCgFZepCw_QrKahhuszx-ZirpNQ4oJ_lMLxYDUpMARYHpc5cZFOHoBy2yO2n8ZG0S8C-KrmsQw6p6A_9dJVofsivp1mzMVH3TOyULhMZCoaw",
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
  
  val userFeeder = csv("C:/Users/ChitragarKrishna(MJI/Music/gatling-charts-highcharts-bundle-3.9.5-bundle (1)/gatling-charts-highcharts-bundle-3.9.5/user-files/resources/data/usersfile.csv").circular

  val login_scenario = group("login_scenario") {
    exec(
      http("tenantId")
        .get("/Enliven/?tenantId=PTenantone")
        .headers(headers_0)
        .resources(
          http("modern_es6")
            .get(uri1 + "?hash=6b2593aa3f6b51713f7423277d37c89d&ua=modern_es6")
            .headers(headers_1)
        )
    )
    .pause(5)
    .exec(
      http("getClientSecretKey")
        .post("/enliven-EIS-services/idam/public/getClientSecretKey")
        .headers(headers_2)
        .body(RawFileBody("request/0002_request.json"))
        .resources(
          http("auth")
            .get("/auth/realms/PTenantone/protocol/openid-connect/auth?client_id=enliven-gui&redirect_uri=https%3A%2F%2Fqc-performance.enlivencem.com%2FEnliven%2F%3FtenantId%3DPTenantone&state=189bc327-59eb-471f-a1d3-ee53747b1aef&response_mode=fragment&response_type=code&scope=openid&nonce=7c790e45-f867-4587-84ab-545e812c8580")
            .headers(headers_3),
          http("getSystemVariables")
            .get("/auth/realms/PTenantone/enliven_resource/getSystemVariables")
            .headers(headers_4),
          http("getAppDetails")
            .get("/enliven-EIS-integration/enlivenWebhook/getAppDetails")
            .headers(headers_4)
        )
    )
    .pause(36)
    .exec(
      http("auth")
        .post("/auth/realms/PTenantOne/login-actions/authenticate?session_code=R58UUiktmq7qXMsCMzVhkB3JkzgliOU5N4otnh-_eHM&execution=569eb383-c34b-438a-a5ce-c27511d5f65a&client_id=enliven-gui&tab_id=0BtUgJqm1TI")
        .headers(headers_6)
        .formParam("username", "$username")
        .formParam("password", "$password")
        .resources(
          http("modern_es6")
            .get(uri1 + "?hash=6b2593aa3f6b51713f7423277d37c89d&ua=modern_es6")
            .headers(headers_1)
        )
    )}
    .pause(2)
   
   	val data_search_list_page = group("Data search list page") {
    exec(
      http("sub-preview-view")
        .get("https://qc-performance.enlivencem.com/Enliven/?tenantId=PTenantone#/oce/sub-preview-view"))}
    .pause(11)
   
   val data_search_open_360 = group("Data-search-open-360") {
    exec(
      http("getData")
        .post("/enliven-EIS-integration/query/getData")
        .headers(headers_13)
        .body(RawFileBody("b/0045_request.json"))
        .resources(
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0046_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0047_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0048_request.json"))
        )
    )
    .pause(8)
    .exec(
      http("Pe-icon-7-stroke.woff?d7yf1v")
        .get("/Enliven/assets/scss/common/pe-icon-7-stroke/fonts/Pe-icon-7-stroke.woff?d7yf1v")
        .headers(headers_49)
        .resources(
          http("search")
            .post("/enliven-work-queue/workqueue/search")
            .headers(headers_34)
            .body(RawFileBody("b/0050_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0051_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0052_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0053_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0054_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0055_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0056_request.json")),
          http("read-form-db-data")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_13)
            .body(RawFileBody("b/0057_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0058_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0059_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0060_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0061_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0062_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0063_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0064_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0065_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0066_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0067_request.json")),
          http("read-form-db-data")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_13)
            .body(RawFileBody("b/0068_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0069_request.json")),
          http("read-form-db-data")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_13)
            .body(RawFileBody("b/0070_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0071_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0072_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0073_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0074_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0075_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0076_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0077_request.json")),
          http("read-form-db-data")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_13)
            .body(RawFileBody("b/0078_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0079_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0080_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0081_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0082_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0083_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0084_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0085_request.json")),
          http("getUsers")
            .post("/enliven-EIS-integration/idam/getUsers")
            .headers(headers_13)
            .body(RawFileBody("b/0086_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0087_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0088_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0089_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0090_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0091_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0092_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0093_request.json")),
          http("search")
            .post("/enliven-work-queue/workqueue/search")
            .headers(headers_34)
            .body(RawFileBody("b/0094_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0095_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0096_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0097_request.json"))
        )
    )
    .pause(1)
    .exec(
      http("search")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_34)
        .body(RawFileBody("b/0098_request.json"))
        .resources(
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0099_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0100_request.json"))
        )
    )}
    .pause(5)
	
	val data_search_close = group("Data search open 360 close") {
    exec(
      http("getNextSequenceNumber")
        .post("/enliven-EIS-services/core/getNextSequenceNumber")
        .headers(headers_13)
        .body(RawFileBody("b/0101_request.json"))
        .resources(
          http("SENSITIVE_DATA")
            .post("/enliven-EIS-services/core/crud/read/SENSITIVE_DATA")
            .headers(headers_13)
            .body(RawFileBody("b/0102_request.json")),
          http("SENSITIVE_DATA")
            .post("/enliven-EIS-services/core/crud/read/SENSITIVE_DATA")
            .headers(headers_13)
            .body(RawFileBody("b/0103_request.json")),
          http("TICKETS")
            .post("/enliven-EIS-services/core/crud/read/TICKETS")
            .headers(headers_13)
            .body(RawFileBody("b/0105_request.json"))
        )
    )}
    .pause(1)
	
	val workQueueSearchOpen360Requests = group("work Queue search open 360") {
    exec(
      http("update")
        .post("/enliven-work-queue/workqueue/update")
        .headers(headers_106)
        .body(RawFileBody("b/0106_request.json"))
        .resources(
          http("search")
            .post("/enliven-work-queue/workqueue/search")
            .headers(headers_34)
            .body(RawFileBody("b/0107_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0108_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0109_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0110_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0111_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0112_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0113_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0114_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0115_request.json")),
          http("read-form-db-data")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_13)
            .body(RawFileBody("b/0116_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0117_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0118_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0119_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0120_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0121_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0122_request.json")),
          http("read-form-db-data")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_13)
            .body(RawFileBody("b/0123_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0124_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0125_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0126_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0127_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0128_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0129_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0130_request.json")),
          http("read-form-db-data")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_13)
            .body(RawFileBody("b/0131_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0132_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0133_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0134_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0135_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0136_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0137_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0138_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0139_request.json")),
          http("read-form-db-data")
            .post("/enliven-EIS-integration/form-db/read-form-db-data")
            .headers(headers_13)
            .body(RawFileBody("b/0140_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0141_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0142_request.json")),
          http("getUsers")
            .post("/enliven-EIS-integration/idam/getUsers")
            .headers(headers_13)
            .body(RawFileBody("b/0143_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0144_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0145_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0146_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0147_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0148_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0149_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0150_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0151_request.json")),
          http("search")
            .post("/enliven-work-queue/workqueue/search")
            .headers(headers_34)
            .body(RawFileBody("b/0152_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0153_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0154_request.json"))
        )
    )
    .pause(2)
    .exec(
      http("search")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_34)
        .body(RawFileBody("b/0155_request.json"))
        .resources(
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0156_request.json")),
          http("getData")
            .post("/enliven-EIS-integration/query/getData")
            .headers(headers_13)
            .body(RawFileBody("b/0157_request.json"))
        )
    )
    .pause(8)
    .exec(
      http("search")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_34)
        .body(RawFileBody("b/0158_request.json"))
    )}
    .pause(15)
	
	val workQueuePendingRequests = group("work queue pending") {
    exec(
      http("update")
        .post("/enliven-work-queue/workqueue/update")
        .headers(headers_106)
        .body(RawFileBody("b/0159_request.json"))
        .resources(
          http("release-wq-user-acquired-lock")
            .post("/enliven-work-queue/workqueue/release-wq-user-acquired-lock")
            .headers(headers_13)
            .body(RawFileBody("b/0160_request.json")),
          http("getNextSequenceNumber")
            .post("/enliven-EIS-services/core/getNextSequenceNumber")
            .headers(headers_13)
            .body(RawFileBody("b/0161_request.json")),
          http("search")
            .post("/enliven-work-queue/workqueue/search")
            .headers(headers_34)
            .body(RawFileBody("b/0162_request.json")),
          http("SENSITIVE_DATA")
            .post("/enliven-EIS-services/core/crud/read/SENSITIVE_DATA")
            .headers(headers_13)
            .body(RawFileBody("b/0163_request.json")),
          http("SENSITIVE_DATA")
            .post("/enliven-EIS-services/core/crud/read/SENSITIVE_DATA")
            .headers(headers_13)
            .body(RawFileBody("b/0164_request.json")),
          http("TICKETS")
            .post("/enliven-EIS-services/core/crud/create/TICKETS")
            .headers(headers_13)
            .body(RawFileBody("b/0165_request.json")),
          http("TICKETS")
            .post("/enliven-EIS-services/core/crud/read/TICKETS")
            .headers(headers_13)
            .body(RawFileBody("b/0166_request.json"))
        )
    )
    .pause(2)
    .exec(
      http("search")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_34)
        .body(RawFileBody("b/0167_request.json"))
    )
    .pause(19)
    .exec(
      http("search")
        .post("/enliven-work-queue/workqueue/search")
        .headers(headers_34)
        .body(RawFileBody("b/0168_request.json"))
    )}
	
	
	val scn = scenario("Open360")
  .feed(userFeeder)
  .exec(login_scenario, data_search_list_page, data_search_open_360, data_search_close, workQueueSearchOpen360Requests, workQueuePendingRequests)

	setUp(
    scn.inject(constantUsersPerSec(40).during(5))).protocols(httpProtocol)
}
