import sys
sys.stdin = open("female_dislike.txt", "r", encoding="utf-8")

# voices = ["작은", "큰", "맑은", "또랑또랑한", "귀여운", "미성", "섹시한", "퇴폐적인", "차분한", "엄근진", "허스키한", "중저음", "속도가 빠른", "콧소리"]
voices = ["작은", "큰", "하이톤", "중저음", "허스키한", "엄근진", "웅얼웅얼", "날카로운", "냉소적인", "사나운", "쏘는듯한", "퇴폐적인", "감정이 없는", "울먹거리는", "퉁명스러운", "속도가 빠른", "걸걸한", "콧소리", "앵앵거리는", "미성"]
cnt = {}
answer = []

for _ in range(int(input())):
    answer.append(input().lstrip().rstrip())

for voice in voices:
    cnt[voice] = answer.count(voice)

cnt = dict(sorted(cnt.items(), key=lambda x: x[1]))

print(list(cnt.keys()))
print(list(cnt.values()))

cnt = dict(sorted(cnt.items(), key=lambda x: x[1], reverse=True))

print("----------------------")
print(cnt)

