import zio._
import zio.metrics.jvm.DefaultJvmMetrics

object Main extends ZIOAppDefault {

  override def run: ZIO[Any, Throwable, Boolean] = {
    Program
      .findTheMeaningOfLife(3, Int.MinValue, Int.MaxValue)
      .provide(
        Runtime.enableRuntimeMetrics, //NOTE: refactored by following this zio-metrics-connectors example (https://github.com/zio/zio-metrics-connectors/blob/01c438153fc2c358caef163731150306e9939cde/core/jvm/src/test/scala/zio/metrics/connectors/SampleApp.scala#L69-L70)
        DefaultJvmMetrics.live.unit   //NOTE: DefaultJvmMetrics.live collects the same JVM metrics as the Prometheus Java client's default exporters
      )
  }

}
