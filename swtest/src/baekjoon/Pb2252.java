package baekjoon;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class Pb2252 {
 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new FileInputStream("input.txt"));
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] indegree = new int[N+1];
        ArrayList<Integer>[] list = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            list[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            list[x].add(y);
            indegree[y]++;
        }
        
        //-----------�Է� ��----------------------
        
        //Topological Sorting
        Queue<Integer> queue = new LinkedList<Integer>();
        //indegree�� 0�϶� ť�� �ִ´�. indegree�� �ڽ��� ����Ű�� �ִ� ȭ��ǥ�� ����
        for(int i=1; i<=N; i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            int current = queue.poll();
            
            //�ڽ��� ����Ű�� �ִ� ��ǥ���� �湮�Ͽ� indegree���� -1 ���ְ� ���� 0�̶�� ť�� �־��ش�.
            for(int i=0; i<list[current].size(); i++){
                int next = list[current].get(i);
                indegree[next]--;
                if(indegree[next]==0){
                    queue.add(next);
                }
            }
        }
        
    }
 
}
