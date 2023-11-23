## Overview

Exploring Jaeger Tracing to track requests through interactions.

Ref.: https://www.jaegertracing.io/

## Execution

Tools:
<li> Java 11 </li>
<li> SpringBoot 2.7.8 </li>
<li> Docker </li>
<br>
<strong>Back-end: </strong>
Import the project into an IDE of your choice, the IDE used in the development was the Netbeans IDE, 
so just build the application to download the dependencies that are managed by Maven,
but first, Docker must be installed and the container images encoded in the <code>docker-compose.yml</code> file initialized, 
with the <code>docker-compose up -d</code> command, and when the application is running, just access the link <code>http://localhost:16686/search</code> to parse jeager tracings.

