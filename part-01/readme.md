# Java + Spring + JMS

## Artemis
### Credentials
* URL: [https://artemis.sareno.me](https://artemis.sareno.me) (click __Management Console__)
* Username: admin
* Password: Netzon0501
* Queue name: Q.Test

### Technical notes
* Running artemis
  * Test run 
    ```sh
    sudo "/opt/apache-artemis-2.16.0/bin/ActiveMQ-Netzon-Demo/bin/artemis" run
    ```
  * Daemon 
    ```sh
    sudo "/opt/apache-artemis-2.16.0/bin/ActiveMQ-Netzon-Demo/bin/artemis-service" start
    ```

## APIs
1. `/hello` - [https://jms.sareno.me/hello?param=World!&numberOfMessages=100&intervalMillis=10000](https://jms.sareno.me/hello?param=World!&numberOfMessages=100&intervalMillis=10000)
    - This will schedule a `100` messages with an interval of `10000` (10 seconds)
2. `/sayHi?name=<param>` - [https://jms.sareno.me/sayHi?name=John%20Doe](https://jms.sareno.me/sayHi?name=John%20Doe)
    - Dummy endpoint

## Admin notes
* Use the Artemis dashboard to check broker messages
* Send a message manually using the Artemis dashboard

## Footnotes
### JMS
* Uses ActiveMQ Artemis as message brocker
* A repeated messages is not supported in Artemis
* The repeated messages (broker-level) can be achieved in ActiveMQ version <5.
* In Artemis, the repeated messages can be ONLY achieved by explicitly sending a delayed messages.
* Related issue [https://stackoverflow.com/questions/53603303/activemq-artemis/53617154](https://stackoverflow.com/questions/53603303/activemq-artemis/53617154)