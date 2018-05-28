# CassandraSpringbootIntegration
# this app is integrated with Cassandra
# to run this application need to install cassanra and create below configuration
cassandra.contactpoints=localhost,127.0.0.1
cassandra.port=9042
cassandra.keyspace=test01

# run the spring boot app
   mvn spring-boot:run
# use below requests from the post man
 
 
 http://localhost:8080/employee
 {
	 "id": 2,
	"name":"TEst",
	"age":"31",
	"salary":"23345"
}
