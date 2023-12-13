## Data Structure
### 1. Stack
* Last In First Out
* python 별도의 자료구조 X, 리스트로 직접 구현, 리스트 함수 동일하게 사용
* java Stack 사용
  <blockquote>
  push() : 원소 추가<br>
  pop() : 마지막 원소 꺼내서 출력<br>
  peek() : 마지막 원소 꺼내지 않고 출력만<br>
  contains(value) : Stack 안에 해당 값이 존재하는지
  </blockquote>

###  2. Queue
* First In First Out
* python deque 사용
  <blockquote>
  appendleft() : 앞에서 넣기<br>
  popleft() : 앞에서 꺼내기<br> 
  append() : 뒤에서 넣기<br> 
  pop() : 뒤에서 꺼내기
  </blockquote>
 * java Queue 사용
    <blockquote>
    add(), offer() : 원소 추가<br>
    remove() : 첫번째 원소 제거<br>
    poll() : 첫번째 원소 제거하고 출력<br>
    peek() : 첫번째 원소 제거하지 않고 출력만<br>
    </blockquote>

### 3. Hash
* Key - Value 자료구조
* python dictionary 사용
   <blockquote>
     items() : key,  value 값을 한번에 탐색<br>
     get(key,  param) : key 값이 존재하면 value를 리턴,  존재하지 않으면 param을 리턴<br>
     keys() : key 값들의 리스트 리턴<br>
     values() : value 값들의 리스트 리턴
   </blockquote>
 

### 4. Heap
* 완전이진트리 자료구조
* python heapq 사용
* default는 최소힙으로 작동, 최대힙의 효과를 발생시키기 위해서는 입력값의 부호를 반대로 바꿔야한다
   <blockquote>
    heappush() : 마지막 레벨의 가장 오른쪽 노드에 추가<br>
    heappop() : 최상위 노드(최소값) 삭제
    </blockquote>


### 5. Set
* 중복을 허용하지 않는 리스트
* python set() 생성자 이용
    <blockquote>
     add()<br>
     update()<br>
     discard()
     </blockquote>
     
<br>  

## 정렬
### 1. 선택 정렬(Selection Sort)
* 시간복잡도 <b>O(N^2) </b> <br>가장 작은 것을 선택하는데에 N번, 그 수를 앞으로 보내는 데에 N번의 연산
* 공간복잡도 <b>O(N) </b> <br> 주어진 배열 안에서 제자리정렬이기 때문에 추가 메모리 필요하지 않음
<blockquote>
1) 주어진 배열 중에서 최솟값을 찾는다.<br>
2) 그 값을 맨 앞에 위치한 값과 교체한다(pass).<br>
3) 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.<br>
4) 하나의 원소만 남을 때까지 위의 1~3 과정을 반복한다.
</blockquote>

### 2. 버블 정렬(Insertion Sort)
* 시간복잡도 <b>O(N^2) </b> <br> 가장 큰 것을 선택하는데에 N번, 그 수를 뒤로 보내는 데에 N번의 연산
* 공간복잡도 <b>O(N) </b> <br> 주어진 배열 안에서 제자리정렬이기 때문에 추가 메모리 필요하지 않음
<blockquote>
1) 주어진 배열 중에서 최대값을 찾는다.<br>
2) 그 값을 맨 뒤에 위치한 값과 교체한다(pass).<br>
3) 맨 마지막 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.<br>
4) 하나의 원소만 남을 때까지 위의 1~3 과정을 반복한다.
</blockquote>

### 3. 삽입 정렬(Burble Sort)
* 시간복잡도 <b> n-1 ~ O(N^2) </b> <br> 이미 정렬되어 비교만 하는 최소값은 n-1, 모든 경우에 교환하는 최대값은 O(N^2)
* 공간복잡도 <b>O(N) </b> <br> 주어진 배열 안에서 제자리정렬이기 때문에 추가 메모리 필요하지 않음
<blockquote>
1) 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다.(첫 번째 타겟은 두 번째 원소부터)<br>
2) 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 이전 위치의 원소의 위치를 + 1 옮겨준다(pass).<br>
3) 타겟이 되는 숫자가 이전 위치에 있던 원소보다 큰 지점을 만나면 해당 자리에 타겟 수를 삽입한다.<br>
4) 마지막 원소까지 위의 1~2 과정을 반복한다.<br>
</blockquote>

<br>  

## 최단 경로 알고리즘
### 1. Floyd-Warshall 
- 모든 노드에서 모든 노드로 가는 경로의 최단거리를 구하는 알고리즘
- 경유 노드 k를 거쳐 가는 모든 경우의 비용을 연산함
  <blockquote>
   min(dis[i][j],  dis[i][k] + dis[k][j])
  </blockquote>     

### 2. Dijkstra
- 특정 노드에서 모든 노드로 가는 최단거리를 구하는 알고리즘
- 음의 간선이 없을 때 정상적으로 동작
- priority queue 사용하여 현재 노드에서 방문하지 않은 노드 중 최단거리가 짧은 노드부터 처리

### 3. Bellman-Ford
- 음수 간선을 처리하는 최단 경로 알고리즘, 음수 무한대 발생 가능
- 매번 모든 간선을 전부 확인한다

<br>  

## Dynamic Programming 
* memoization
* top-down / bottom-up
* common trick

