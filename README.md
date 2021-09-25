## Stack
 * Last In First Out
 * python에 별도의 자료구조 X
    - 리스트로 직접 구현
    - 리스트 함수 동일하게 사용
  
## Queue
 * First In First Out 
 * python deque 사용
    - 앞에서 넣기 appendleft() / 앞에서 꺼내기 popleft()
    - 뒤에서 넣기 append() / 뒤에서 꺼내기 pop()
   
## Hash
   * Key - Value 자료구조
   * python dictionary 사용
      - items() : key, value 값을 한번에 탐색
      - get(key, param) : key 값이 존재하면 value를 리턴, 존재하지 않으면 param을 리턴
      - keys() : key 값들의 리스트 리턴
      - values() : value 값들의 리스트 리턴


## Dynamic Programming 
* memoization
* top-down / bottom-up
* common trick
