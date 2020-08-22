package java_0720;

import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test
 * @Description
 * @Author by小房
 * @Date 2020/7/20 9:51
 */
import java.io.*;
import java.util.*;

public class Test{
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static class pair implements Comparable<pair>{
        int a, b, w;
        pair(int u, int v, int x){
            a = u;
            b = v;
            w = x;
        }
        @Override
        public int compareTo(pair p) { // 自定义类需要重写比较器
            return this.w - p.w;
        }
    }

    static final int N = 200010, INF = 0x3f3f3f3f;
    static int n, m;
    static int[] p = new int[N];
    static pair[] g = new pair[N];

    public static int Int(String s){
        return Integer.parseInt(s);
    }

    public static int find(int x){
        if(p[x] != x) p[x] = find(p[x]);
        return p[x];
    }

    public static int kruskal1()throws IOException{
        Arrays.sort(g, 0, m-1);

        int cnt = 0, res = 0;

        for(int i = 1; i <= n; i++) p[i] = i;

        for(int i = 0; i < m; i++){
            pair t = g[i];
            int a = find(t.a);
            int b = find(t.b);
            if(a != b){
                p[a] = b;
                cnt ++;
                res += t.w;
            }
        }

        if(cnt != n - 1) return 0x3f3f3f3f;
        else return res;
    }

    public static void main(String[] args) throws IOException{
        String[] s = in.readLine().split(" ");
        n = Int(s[0]);
        m = Int(s[1]);
        for(int i = 0, j = 0; i < m; i++){
            String[] s1 = in.readLine().split(" ");
            g[j++] = new pair(Int(s1[0]), Int(s1[1]), Int(s1[2]));
        }

        int res = kruskal1();
        if(res == 0x3f3f3f3f) out.write("impossible\n");
        else out.write(res+"\n");
        out.flush();
    }
}
