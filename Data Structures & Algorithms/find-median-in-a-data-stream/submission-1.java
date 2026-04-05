class MedianFinder {
    PriorityQueue<Integer> small;
    PriorityQueue<Integer> large;
    public MedianFinder() {
        small = new PriorityQueue<>((a, b) -> b - a);
        large = new PriorityQueue<>((a, b) -> a - b);
    }
    
    public void addNum(int num) {
        small.add(num);
        if(!large.isEmpty() && small.peek() > large.peek()) {
            large.offer(small.poll());
        }
        
        if(small.size() - large.size() > 1) {
            large.offer(small.poll());
        }
        else if(large.size() - small.size() > 1) {
            small.offer(large.poll());
        }
    }
    
    public double findMedian() {
        if(small.size() == large.size()) {
            return (small.peek() + large.peek()) / 2.0;
        }
        else if(small.size() > large.size()) {
            return (double) small.peek();
        }
        else {
            return (double) large.peek();
        }
    }
}