/*
rule = "scala:fix.Scalacollectioncompat_newcollections"
 */
package fix

class SetMapSrc(set: Set[Int], map: Map[Int, Int]) {
  set + (2, 3)
  map + (2 -> 3, 3 -> 4)
  (set + (2, 3)).map(x => x)
  set + (2, 3) - 4
}