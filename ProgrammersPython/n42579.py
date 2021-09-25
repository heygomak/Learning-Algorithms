def solution(genres, plays):
    answer = []
    play = dict()
    genre = dict()

    for i in range(len(genres)):
        play[genres[i]] = play.get(genres[i], []) + [[i, plays[i]]]
        genre[genres[i]] = genre.get(genres[i], 0) + plays[i]

    genre = dict(sorted(genre.items(), key=lambda x: x[1], reverse=True))

    for i in genre.keys():
        playlist = sorted(play[i], key=lambda x: x[1], reverse=True)
        answer.append(playlist[0][0])
        if len(playlist) > 1: answer.append(playlist[1][0])

    return answer
