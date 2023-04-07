## Overview

Exploring Jaeger Tracing to track requests through interactions.

Ref.: https://www.jaegertracing.io/

## Execution

Tools:
<li> Java 11 </li>
<li> SpringBoot 2.7.8 </li>
<li> Docker </li>
<br>
Back-end: 
Import the project into an IDE of your choice, the IDE used in the development was the Netbeans IDE, 
so just build the application to download the dependencies that are managed by Maven,
but first, Docker must be installed and the container images encoded in the <strong>docker-compose.yml</strong> file initialized, 
with the <code>docker-compose up -d</code> command, and when the application is running, just access the link http://localhost: 16686/search to parse jeager tracings.

<br>


## Demo
![Gravação de Tela 2023-04-07 às 15 50 29](https://user-images.githubusercontent.com/56695817/230662190-eaeb4ca6-d399-4414-88a7-d6076804310c.gif)

<br>

![image](https://user-images.githubusercontent.com/56695817/230663938-5dbd79df-2f42-447d-86e4-009b86f3fd85.png)
