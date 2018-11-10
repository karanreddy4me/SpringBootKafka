
step 1: start zookeeper
zookeeper-server-start.bat ..\..\config\zookeeper.properties

step 2:kafka
kafka-server-start.bat  ..\..\config\server.properties

step 3: create topic
kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example

step 4:consumer
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic Kafka_Example --from-beginning

rest url
http://localhost:8081/SpringBootKafka/api/click/karanreddy1