# https://school.programmers.co.kr/learn/courses/30/lessons/176963?language=python
def solution(name, yearning, photo):
    d = {name: score for name, score in zip(name, yearning)}
    return [sum(d.get(person, 0) for person in people) for people in photo]
