public int logestHeatWave(double threshold){
    int longest = 0;
    int currLongest = 0;
    for(int i=0; i < temperatures.size(); i++){
        if(temperatures.get(i) > threshold){
            currLongest++;
        }else{
            longest = Math.max(longest,currLongest);
            currLongest = 0;
        }
    }

    longest = Math.max(longest,currLongest);

    return longest;

}