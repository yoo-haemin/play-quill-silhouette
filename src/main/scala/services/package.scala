package object services {
  object Database {
    //https://github.com/jeffmath/play-quill-async-postgres-example/blob/master/app/db/package.scala
    import io.getquill.{ PostgresAsyncContext, Escape }
    type DbContext = PostgresAsyncContext[Escape]
  }
}
