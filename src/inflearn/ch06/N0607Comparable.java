package inflearn.ch06;

import java.util.*;

/**
 * Comparable
 *  -> compareTo(T o)
 */
class Point implements Comparable<Point>{
    public int x, y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public int compareTo(Point o){
        if(this.x==o.x) return this.y-o.y;  // x가 같으면 y 기준 정렬
        else return this.x-o.x;             // x가 다르면 x 기준 정렬
    }
}

public class N0607Comparable {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();

        ArrayList<Point> arr =new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(new Point(kb.nextInt(), kb.nextInt()));
        }
        Collections.sort(arr);
        for(Point o : arr) System.out.println(o.x+" "+o.y);
    }
}

