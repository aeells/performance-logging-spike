performance-logging-spike
=========================

- Perf4J [0.9.16] - http://perf4j.codehaus.org/
- Spring AOP [3.2.4.RELEASE]
- SLF4J [1.7.5] API
- Logback [1.0.13] Impl

Spring bean profiled with timing statistics that are applied via AOP (non-invasive) and output via Logback.

- java -jar ~/.m2/repository/org/perf4j/perf4j/0.9.16/perf4j-0.9.16.jar ./logs/perf4j.log
