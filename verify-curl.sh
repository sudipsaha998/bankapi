# JWT can be generated using the first curl which is commented, token will be available in the header as Authorization

#curl -X POST \
#  https://rocky-gorge-62273.herokuapp.com/login \
#  -H 'Accept: */*' \
#  -H 'Accept-Encoding: gzip, deflate' \
#  -H 'Cache-Control: no-cache' \
#  -H 'Connection: keep-alive' \
#  -H 'Content-Length: ' \
#  -H 'Cookie: JSESSIONID=3B0F168BFB6D445ED9CCCD35783B6E29' \
#  -H 'Host: rocky-gorge-62273.herokuapp.com' \
#  -H 'Postman-Token: cfbc3fd7-011d-4883-b225-1b5265dd7455,66f4eeaa-e5a4-4bff-9b6b-63d654bb8485' \
#  -H 'User-Agent: PostmanRuntime/7.15.2' \
#  -H 'cache-control: no-cache'

curl -X GET \
  'https://rocky-gorge-62273.herokuapp.com/fetch/branches?name=STATE%20BANK%20OF%20INDIA&city=MUMBAI&offset=0&limit=1' \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Authorization: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzdWJqZWN0IiwiZXhwIjoxNTYzMjM0NjU2fQ.df0sGta-cbWXJjJeipRRxorsgImssGzMFg68kvyIz-s' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Cookie: JSESSIONID=3B0F168BFB6D445ED9CCCD35783B6E29' \
  -H 'Host: rocky-gorge-62273.herokuapp.com' \
  -H 'Postman-Token: bb02908d-39a6-401d-8e39-76f3909c894e,299097e8-9bf3-4f3e-85b2-befd1b4db0e8' \
  -H 'User-Agent: PostmanRuntime/7.15.2' \
  -H 'cache-control: no-cache'

curl -X GET \
  'https://rocky-gorge-62273.herokuapp.com/fetch/bank?ifsc=SBIN0008783&limit=2&offset=0' \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Authorization: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzdWJqZWN0IiwiZXhwIjoxNTYzMjM0NjU2fQ.df0sGta-cbWXJjJeipRRxorsgImssGzMFg68kvyIz-s' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Cookie: JSESSIONID=BD0AD7DAF2E936E6C3EF49FCB3E30669' \
  -H 'Host: rocky-gorge-62273.herokuapp.com' \
  -H 'Postman-Token: 070f94f9-7a0e-4863-a138-9000074fd11f,bf8a76e5-e866-4a77-9515-88bb60fd3eb7' \
  -H 'User-Agent: PostmanRuntime/7.15.2' \
  -H 'cache-control: no-cache'