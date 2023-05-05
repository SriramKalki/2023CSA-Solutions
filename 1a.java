public int findFreeBlock(int period, int duration){
    for(int i = 0; i <= 60 - duration; i++){
        for(int j = i; j < i + duration; j++){
            if(!isMinuteFree(period,duration)){
                break;
            }else{
                return i;
            }
        }
    }

    return -1;
}