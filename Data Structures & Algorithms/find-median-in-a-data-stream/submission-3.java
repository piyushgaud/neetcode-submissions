class MedianFinder {
    
    PriorityQueue<Integer> small;
    PriorityQueue<Integer> large;

    public MedianFinder() {
        small = new PriorityQueue<Integer>();
        large = new PriorityQueue<Integer>(
            new Comparator<Integer>(){
                public int compare(Integer a, Integer b)
                {
                    return b-a;
                }
            }
        );
        
    }
    
    public void addNum(int num) {
        small.offer(num);

        large.offer(small.poll());

        if(large.size()>small.size())
        {
            small.offer(large.poll());
        }
    }
    
    public double findMedian() {
        
        if(large.size()<small.size())
        {
            return small.peek();
        }
        return (small.peek()+large.peek())/2.0;
    }
}
