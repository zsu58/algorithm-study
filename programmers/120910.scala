/* https://school.programmers.co.kr/learn/courses/30/lessons/120910 */
// mein
object Solution {
    def solution(n: Int, t: Int): Int = {
        if (t == 0) n
        else solution(n, t-1) * 2
    }
}

// others
object Solution {
    def solution(n: Int, t: Int): Int = {
        n * math.pow(2, t).toInt
    }
}