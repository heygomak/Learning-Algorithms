def get_grade(score):
    if score >= 90:
        return "A"
    elif 80 <= score < 90:
        return "B"
    elif 70 <= score < 80:
        return "C"
    elif 50 <= score < 70:
        return "D"
    else:
        return "F"


def check_lowest_or_highest(arr, num):
    if (arr[0] == num and arr[1] < num) or (arr[len(arr) - 1] == num and arr[len(arr) - 2] > num):
        return True
    return False


def solution(scores):
    answer = ''
    results = []
    for i in range(len(scores)):
        self_score = scores[i][i]
        score = [j[i] for j in scores]
        score.sort(reverse=True)
        if check_lowest_or_highest(score, self_score):
            score.remove(self_score)
        results.append(sum(score) / len(score))
    for result in results:
        answer += get_grade(result)
    return answer
