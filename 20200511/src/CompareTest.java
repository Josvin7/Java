import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName CompareTest
 * @Description
 * @Author by房文辉
 * @Date 2020/5/11 14:49
 */
class Card implements Comparable<Card>{
    public String rank;
    public String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank='" + rank + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        // 看看 this 和 obj 身份是否相同
        if(this == obj) {
            return true;
        }
        //
        if(obj == null) {
            return false;
        }
        //obj 类型是否能强转为Card
        if(!(obj instanceof Card)) {
            return false;
        }
         //  强制转换为Card类型
        Card other = (Card) obj;
        //按照制定规则比较
        return this.rank.equals(other.rank);
    }


    private  int convertRank() {
        // 把 String 类型的 rank 转成 int 值.
        // 2 - 10 => 2 - 10
        // J => 11
        // Q => 12
        // K => 13
        // A => 14
        if("A".equals(rank)) {
            return 14;
        }
        if("J".equals(rank)) {
            return 11;
        }
        if("Q".equals(rank)) {
            return 12;
        }
        if("K".equals(rank)) {
            return 13;
        }
        return Integer.parseInt(rank);
    }

    public int compareTo(Card o) {
        int rank1 = this.convertRank();
        int rank2 = o.convertRank();
        return rank1 - rank2;
    }
}
public class CompareTest {
    public static void main(String[] args) {
        Card card1 = new Card("A","红桃");
        Card card2 = new Card("10","黑桃");
        Card card3 = card1;

        System.out.println(card1 == card2);
        System.out.println(card1 == card3);
        System.out.println(card1.compareTo(card2));

        List<Card> cards = new ArrayList<>();
        cards.add(new Card("A","红桃"));
        cards.add(new Card("J", "红桃"));
        cards.add(new Card("Q", "红桃"));
        cards.add(new Card("K", "红桃"));
        cards.add(new Card("10", "红桃"));
        Collections.sort(cards);
        System.out.println(cards);
    }
}
