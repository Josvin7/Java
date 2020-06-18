import java.util.*;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName MapSetInterview
 * @Description
 * @Author by房文辉
 * @Date 2020/5/13 11:21
 */
public class MapSetInterview {
    static class Test {
        public ArrayList<Integer> data;

        public Test() {
            data = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "Test{" +
                    "data=" + data +
                    '}';
        }
    }

    public int singleNumber(int[] nums) {
        // 1. 统计每个数字出现的次数
        //    key 表示具体的数字. value 表示该数字在数组中出现的次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int x:nums
             ) {
            Integer count = map.get(x);
            if(count == null) {
                // x 在之前没有出现过, 就把新的键值对插入到 map 中
                map.put(x,1);
            } else {
                map.put(x,count+1);
            }
        }

        // System.out.println(map);
        // 2. 遍历 Map, 找到只出现一次的数字
        for (Map.Entry<Integer, Integer> entry : map.entrySet()
             ) {
            if (entry.getValue().equals(1)) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public int singleNumber2(int[] nums) {
        //使用按位异或的方式解决
        int ret = 0;
        for (int x : nums) {
            ret ^= x;
        }
        return ret;
    }

    public int[] singleNumber3(int[] nums) {
        //        // 1. 先针对所有数字进行 ^ 操作
        int ret = 0;
        for (int i: nums
             ) {
            ret ^= i;
        }
        //2. 在 ret 中找一个不为 0 的 bit 位
        int bit = 0;
        for (; bit  < 32; bit++) {
            if((ret & (1 << bit)) > 0) {
                break;
            }
        }
        // 此时 bit 对应的位就是为 1
        // a 和 b 是最终要找的结果
        int a = 0;
        int b = 0;
        for (int x : nums
             ) {
            if ((x & (1 << bit)) >0) {
                a ^= x;
            } else {
                b ^= x;
            }
        }
        return new int[]{a, b};
    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Map<Node ,Node > map = new HashMap<>();
        for (Node cur = head; cur !=null ; cur = cur.next) {
            map.put(cur, new Node(cur.val));
        }
        for (Node cur = head; cur !=null ; cur = cur.next) {
            Node newCur = map.get(cur);
            newCur.next = map.get(cur.next);
            newCur.random = map.get(cur.random);
        }
        return map.get(head);
    }

    public int numJewelsInStones(String J, String S) {
        int count = 0;
        // J 是宝石, S 是石头
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public List<String> topKFrequent(String[] words, int k) {
        Map<String ,Integer> map = new HashMap<>();
        for (String x : words
             ) {
            map.put(x, map.getOrDefault(x,0) +1);
        }

        List<String> result = new ArrayList<>(map.keySet());

        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int count1 = map.get(o1);
                int count2 = map.get(o2);
                if(count1 == count2) {
                    return o1.compareTo(o2);
                }
                return count2 - count1;

            }
        });

        return result.subList(0,k);
    }


    public static void main(String[] args) {
        Test t = new Test();
        t.data.add(1);
        t.data.add(2);
        t.data.add(3);

        Test t2 = deepCopy(t);
        t.data.add(4);
        System.out.println(t);
        System.out.println(t2);
    }

    private static Test deepCopy(Test t) {
        Test t2 = new Test();
        t2.data.addAll(t.data);
        return t2;
    }

    private static Test copy(Test t) {
        Test t2 = new Test();
        t2.data = t.data;
        return t2;
    }


}
