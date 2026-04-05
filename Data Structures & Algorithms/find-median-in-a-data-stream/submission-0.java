class MedianFinder {
    List<Integer> result;

    public MedianFinder() {
        result = new ArrayList<>();
    }
    
    public void addNum(int num) {
        result.add(num);
        Collections.sort(result);
    }
    
    public double findMedian() {
        double finalResult;
        int listLen = result.size();
        if(listLen % 2 == 1) {
            finalResult = (double)result.get(listLen / 2);
        }
        else {
            finalResult =  (double) ((result.get(listLen / 2)) + (result.get((listLen / 2) - 1))) / 2.0;
        }
        return finalResult;
    }
}
