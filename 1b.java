public boolean makeAppointment(int startPeriod, int endPeriod, int duration){
    for(int i= startPeriod, i <= endPeriod; i++){
        //every period
        if(findFreeBlock(i,duration) != -1){
            reserveBlock(i, findFreeBlock(i,duration), duration);
            return true;
        } 
    }
    return false;
}