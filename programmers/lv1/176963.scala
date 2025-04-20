/* https://school.programmers.co.kr/learn/courses/30/lessons/176963?language=scala */
object Solution {
    def solution(
        name: Vector[String],
        yearning: Vector[Int],
        photo: Vector[Vector[String]]
    ): Vector[Int] = {
        val scoreMap: Map[String, Int] = name.zip(yearning).toMap

        photo.map { people =>
            people.map(person => scoreMap.getOrElse(person, 0)).sum
        }
        # return Vector[Int]()
    }
}