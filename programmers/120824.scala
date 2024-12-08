/* https://school.programmers.co.kr/learn/courses/30/lessons/120824 */
// mine
object Solution {
    def solution(num_list: Vector[Int]): Vector[Int] = {
        getCnt(num_list, 0, 0)
    }

    // could be better if idx was used then creating a vector every time
    def getCnt(numList: Vector[Int], oddCnt: Int, evenCnt: Int): Vector[Int] = {
        if (numList.length == 0) {Vector(evenCnt, oddCnt)}
        else {
            if (numList.last % 2 == 0) {
                getCnt(numList.init, oddCnt, evenCnt +1)
            }
            else getCnt(numList.init, oddCnt + 1, evenCnt)
        }
    }
}

// others1
object Solution {
    def solution(num_list: Vector[Int]): Vector[Int] = {
        val a = num_list.filter(_ % 2 == 0).size
        val b = num_list.size - a
        return Vector[Int](a,b)
    }
}

// others2
object Solution {
    def solution(num_list: Vector[Int]): Vector[Int] = {
        Vector(num_list.count(_ % 2 == 0), num_list.count(_ % 2 == 1) )
    }
}
