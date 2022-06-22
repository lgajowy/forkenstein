import zio._

object Main extends ZIOAppDefault {
  override def run: ZIO[Any, Nothing, Boolean] = {
    Program.findTheMeaningOfLife(3, Int.MinValue, Int.MaxValue).provideLayer(Runtime.trackRuntimeMetrics)
  }
}