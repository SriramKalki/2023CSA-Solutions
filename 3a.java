public void cleanData(double lower, double upper){
    int loc = 0;
    while(loc < temperatures.size()){
        if(temperatures.get(loc) < lower || temperatures.get(loc) > upper){
            temperatures.remove(loc);
        }else{
            loc++;
        }
    }
    
}