class CollatzCalculator {

    int computeStepCount(int start) {
        if (start == 1){
            return 1;
        }    
        if (start % 2 == 0){
            return 1 + computeStepCount(start/2);
        }else{
            return 1 + computeStepCount(3* start + 1);
        }
    }

}
