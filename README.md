# OpenAI API Quickstart - Java example app

This is an example pet name generator app used in the OpenAI API [quickstart tutorial](https://platform.openai.com/docs/quickstart). It uses the [Spring Boot](https://spring.io/projects/spring-boot) framework. Follow the instructions below to get set up.

## Setup

1. If you don’t have JDK installed, [install it from here](https://adoptium.net/) (JDK version >= 17 required)

2. Clone this repository

3. Navigate into the project directory

   ```bash
   $ cd openai-quickstart-java
   ```

4. Provide [API key](https://platform.openai.com/account/api-keys) via an environment variable or application property

   Via an environment variable:
   ```bash
   export OPENAI_API_API_KEY=xxx
   ```

   Via an application property (in `src/main/resources/application.properties`):
   ```
   openai-api.api-key=xxx
   ```

5. Run the app

   ```bash
   $ ./gradlew bootRun
   ```

You should now be able to access the app at [http://localhost:8080/api/generate?animal=dog](http://localhost:8080/api/generate?animal=dog)! For the full context behind this example app, check out the [tutorial](https://platform.openai.com/docs/quickstart).
