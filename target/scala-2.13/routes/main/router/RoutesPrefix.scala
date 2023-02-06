// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alfred/eclipse-workspace/Card_Game_Gla/conf/routes
// @DATE:Sun Feb 05 23:36:25 GMT 2023


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
