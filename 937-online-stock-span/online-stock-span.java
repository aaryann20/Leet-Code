class Pair{
    int value;
    int ind;

    public Pair(int valuePrice,int index){
        this.value = valuePrice;
        this.ind = index;
    }
}

class StockSpanner {

    Stack<Pair> st = new Stack<>();
    int index = -1;

    public StockSpanner() {
        index = -1;
        st.clear();
        
    }
    
    public int next(int price) {
        index = index+1;
        while(st.isEmpty()!= true && st.peek().value <= price){
            st.pop();
        }
        int ans = index -(st.isEmpty() ? -1 : st.peek().ind);

        Pair pairToInsert = new Pair(price,index);
        st.push(pairToInsert);
        return ans ;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */