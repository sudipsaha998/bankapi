# JWT can be generated using the first curl which is commented, token will be available in the header as Authorization

#curl -X POST \
#  https://rocky-gorge-62273.herokuapp.com/login \
#  -H 'Accept: */*' \
#  -H 'Accept-Encoding: gzip, deflate' \
#  -H 'Cache-Control: no-cache' \
#  -H 'Connection: keep-alive' \
#  -H 'Content-Length: ' \
#  -H 'Cookie: JSESSIONID=DAF0C3271FADF28ADC306FDC62DD31F1' \
#  -H 'Host: rocky-gorge-62273.herokuapp.com' \
#  -H 'Postman-Token: a5e352b7-b6d0-46bf-9a34-4e7674afbc73,6a953748-a038-4e54-9de8-e1053bd864ef' \
#  -H 'User-Agent: PostmanRuntime/7.15.2' \
#  -H 'cache-control: no-cache'  

# Fetch bank details using name and city
curl -X GET \
  'https://rocky-gorge-62273.herokuapp.com/fetch/branches?name=STATE%20BANK%20OF%20INDIA&city=MUMBAI&offset=50&limit=500' \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Authorization: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzdWJqZWN0IiwiZXhwIjoxNTYzNTE0ODY0fQ.RxVGo2q4gzTwzLIDu48UcNbPUqPJai-z5i6VL45LtIs' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Cookie: JSESSIONID=3B0F168BFB6D445ED9CCCD35783B6E29,JSESSIONID=3B0F168BFB6D445ED9CCCD35783B6E29; JSESSIONID=41F5BB1AB98417A7BF3AA9DA02AE3E73' \
  -H 'Host: rocky-gorge-62273.herokuapp.com' \
  -H 'Postman-Token: bb02908d-39a6-401d-8e39-76f3909c894e,299097e8-9bf3-4f3e-85b2-befd1b4db0e8,9ac0c405-5eaf-4f07-94cb-cc1e1deff10a' \
  -H 'User-Agent: PostmanRuntime/7.15.2' \
  -H 'cache-control: no-cache,no-cache'

# Error condition for negative offset value
  curl -X GET \
  'https://rocky-gorge-62273.herokuapp.com/fetch/branches?name=STATE%20BANK%20OF%20INDIA&city=MUMBAI&offset=-50&limit=500' \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Authorization: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzdWJqZWN0IiwiZXhwIjoxNTYzNTE0ODY0fQ.RxVGo2q4gzTwzLIDu48UcNbPUqPJai-z5i6VL45LtIs' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Cookie: JSESSIONID=3B0F168BFB6D445ED9CCCD35783B6E29,JSESSIONID=3B0F168BFB6D445ED9CCCD35783B6E29; JSESSIONID=41F5BB1AB98417A7BF3AA9DA02AE3E73' \
  -H 'Host: rocky-gorge-62273.herokuapp.com' \
  -H 'Postman-Token: bb02908d-39a6-401d-8e39-76f3909c894e,299097e8-9bf3-4f3e-85b2-befd1b4db0e8,80fbddbe-730a-4a3f-8eee-57ba5354b0e2' \
  -H 'User-Agent: PostmanRuntime/7.15.2' \
  -H 'cache-control: no-cache,no-cache'

# Fetch bank details using IFSC
curl -X GET \
  'https://rocky-gorge-62273.herokuapp.com/fetch/bank?ifsc=SBIN0008783&limit=1&offset=0' \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Authorization: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzdWJqZWN0IiwiZXhwIjoxNTYzNTE0ODY0fQ.RxVGo2q4gzTwzLIDu48UcNbPUqPJai-z5i6VL45LtIs' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Cookie: JSESSIONID=DAF0C3271FADF28ADC306FDC62DD31F1' \
  -H 'Host: rocky-gorge-62273.herokuapp.com' \
  -H 'Postman-Token: d13354fe-c939-4ac7-8848-fc43de7c4662,f097ad13-3ca3-452b-a234-18eb7e21621f' \
  -H 'User-Agent: PostmanRuntime/7.15.2' \
  -H 'cache-control: no-cache'

# Error condition for negative offset value
  curl -X GET \
  'https://rocky-gorge-62273.herokuapp.com/fetch/branches?name=STATE%20BANK%20OF%20INDIA&city=MUMBAI&offset=-50&limit=500' \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Authorization: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzdWJqZWN0IiwiZXhwIjoxNTYzNTE0ODY0fQ.RxVGo2q4gzTwzLIDu48UcNbPUqPJai-z5i6VL45LtIs' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Cookie: JSESSIONID=3B0F168BFB6D445ED9CCCD35783B6E29,JSESSIONID=3B0F168BFB6D445ED9CCCD35783B6E29; JSESSIONID=41F5BB1AB98417A7BF3AA9DA02AE3E73' \
  -H 'Host: rocky-gorge-62273.herokuapp.com' \
  -H 'Postman-Token: bb02908d-39a6-401d-8e39-76f3909c894e,299097e8-9bf3-4f3e-85b2-befd1b4db0e8,80fbddbe-730a-4a3f-8eee-57ba5354b0e2' \
  -H 'User-Agent: PostmanRuntime/7.15.2' \
  -H 'cache-control: no-cache,no-cache'
  
  #Error condition for empty offset value
  curl -X GET \
  'https://rocky-gorge-62273.herokuapp.com/fetch/bank?ifsc=SBIN0008783&limit=1&offset=%20%20' \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Authorization: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzdWJqZWN0IiwiZXhwIjoxNTYzNTE0ODY0fQ.RxVGo2q4gzTwzLIDu48UcNbPUqPJai-z5i6VL45LtIs' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Cookie: JSESSIONID=41F5BB1AB98417A7BF3AA9DA02AE3E73' \
  -H 'Host: rocky-gorge-62273.herokuapp.com' \
  -H 'Postman-Token: 5a4bef3d-2f5e-4239-9b91-b2d41d3dd267,a52c06d6-de71-4d19-8894-1afd05e26c80' \
  -H 'User-Agent: PostmanRuntime/7.15.2' \
  -H 'cache-control: no-cache'