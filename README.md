Simple ZIO app that's fibers race in the search for the number 42.

I'm using it to test opentelemetry with ZIO.

Add the following vm options to work with opentelemetry: 

```
-Dotel.metrics.exporter=otlp
-Dotel.metric.export.interval=1000
-javaagent:<path_to_javaagent>/opentelemetry-javaagent-1.13.1.jar
-Dotel.service.name=mesmer-zio
-Dotel.javaagent.extensions=/<path_to_mesmer_extension>/mesmer-otel-extension_2.13-0.7.0+14-a2bcbabd+20220621-1432-SNAPSHOT-assembly.jar
-Dotel.javaagent.debug=true
```