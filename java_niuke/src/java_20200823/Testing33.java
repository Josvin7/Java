package java_20200823;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Testing33
 * @Description
 * @Author by小房
 * @Date 2020/8/24 11:23
 */

import java.io.BufferedInputStream;
        import java.util.Comparator;
        import java.util.PriorityQueue;
        import java.util.Scanner;

public class Testing33 {
    public static int[] pro = new int[100]; // 假设会议不超过100个，如果需要更多就把数组开大一点
    public static int[] cost = new int[100];

    public static class Node {
        public int pro, cost;

        public Node(int cost, int pro) {
            this.pro = pro;
            this.cost = cost;
        }
    }

    public static int maxMoney(int k, int W, int[] cost, int[] pro) {
        PriorityQueue<Node> maxproPQ = new PriorityQueue<Node>(new Comparator<Node>() {
            // 最大利润堆
            @Override
            public int compare(Node o1, Node o2) {
                return o2.pro - o1.pro;
            }
        });
        PriorityQueue<Node> mincostPQ = new PriorityQueue<Node>(new Comparator<Node>() {
            // 最小花费堆
            @Override
            public int compare(Node o1, Node o2) {
                return o1.cost - o2.cost;
            }
        });

        for (int i = 0; i < k; ++i) {
            mincostPQ.add(new Node(cost[i], pro[i]));
        }

        for (int i = 0; i < k; ++i) { // 依次做k个项目，每次只能做一个
            while (!mincostPQ.isEmpty() && mincostPQ.peek().cost <= W) { // 如果小顶堆空了说明项目做完了，
                // 如果小顶堆最上面那个花费最小的项目已有的资金还是做不了，那么就做不了，
                // 去大顶堆做其他项目多得点利润，这样看能不能开启下一个项目做
                maxproPQ.add(mincostPQ.poll());
            }
            if (maxproPQ.isEmpty()) { // 大顶堆为空说明能做的已经做完了
                return W;
            }
            W += maxproPQ.poll().pro; // 加上利润，有可能会开启下一个项目
        }
        return W;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
        int k = cin.nextInt(); // k个项目要做
        int W = cin.nextInt(); // 项目初始资金
        for (int i = 0; i < k; ++i) {
            cost[i] = cin.nextInt(); // 项目需要花费的初始资金
            pro[i] = cin.nextInt(); // 项目的利润
        }
        cin.close();
        System.out.println(maxMoney(k, W, cost, pro));
    }
}