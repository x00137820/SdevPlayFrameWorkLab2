
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/sdevLab2/conf/routes
// @DATE:Tue Feb 27 14:09:50 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
