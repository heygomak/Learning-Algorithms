package programmers;
/*
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때,
순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

[6, 10, 2]	       ->  6210
[3, 30, 34, 5, 9]  ->  9534330
*/


import java.util.*;

class Day1_LargestNumber {

    public String solution1(int[] numbers) {

        String answer = "";

        // (1) List에 numbers의 속성을 추가
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        // Stream API를 사용하여 아래와 같이 불필요한 for문을 걷어낸 코드로 만들 수 있다
        // List<String> list = Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.toList());

        // (2) List안의 원소들을 compare()를 이용해 정렬한다
        Collections.sort(list, (a, b) -> {
            String as = String.valueOf(a), bs = String.valueOf(b);
            System.out.println("as: "+as+", bs: "+bs+" => "
                    +-Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as)));
            return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
        });
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer a, Integer b) {
//                String as = String.valueOf(a), bs = String.valueOf(b);
//                return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
//            }
//        });

        // (3) 정렬된 List 원소들을 StringBuilder에 담는다
        StringBuilder sb = new StringBuilder();
        for(Integer i : list) {
            sb.append(i);
            System.out.println(sb);
        }
        answer = sb.toString();

        // (4) 전체가 0인 배열에 대한 예외처리 후 answer을 리턴
        if(answer.charAt(0) == '0') {
            return "0";
        } else {
            return answer;
        }
    }

    public String solution2(int[] numbers){
        List<Number> numberList = new ArrayList<>(numbers.length + 1);
        Arrays.sort(numbers);
        for (int number : numbers) {
            numberList.add(new Number(number));
        }
        Collections.sort(numberList);

        String biggestNumber = "";
        for (Number number : numberList) {
            if (number.number == 0 && biggestNumber.equals("0")) continue;
            biggestNumber += number.number;
        }
        return biggestNumber;
    }

    private class Number implements Comparable<Number> {
        int number;

        public Number(int number) {
            this.number = number;
        }

        @Override
        public int compareTo(Number number) {
            System.out.println("this.number : "+this.number);
            System.out.println("number.number : "+number.number);
            int comb1 = Integer.parseInt(this.number + "" + number.number);
            int comb2 = Integer.parseInt(number.number + "" + this.number);
            return comb1 < comb2 ? 1 : -1;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{3, 30, 34, 5, 9};
        Day1_LargestNumber sol = new Day1_LargestNumber();
        System.out.println("solution1 : "+sol.solution1(numbers));
        System.out.println("solution2 : "+sol.solution2(numbers));
    }
}