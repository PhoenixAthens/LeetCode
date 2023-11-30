package November_2022;

import java.util.*;

public class OnlineStockSpan {
    //slow! too slow! time=1256ms memory=69.9MB
    public class StockSpanner {

        private ArrayList<Integer> span;

        public StockSpanner() {
            span = new ArrayList<>();
            span.add(null);
        }

        public int next(int price) {
            if (span.isEmpty() && price == 0) {
                span.add(null);
                return 0;
            } else {
                if (span.size() == 1) {
                    span.add(price);
                    return 1;
                }

                int counter = 0;
                span.add(price);
                for (int i = span.size() - 1; i >= 0; i--) {
                    if (span.get(i) == null) {
                        continue;
                    }
                    if (span.get(i) <= price) {
                        counter++;
                    } else {
                        break;
                    }
                }
                return counter;


            }

        }
    }
}
