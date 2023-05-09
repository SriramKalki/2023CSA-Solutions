public int findFreeBlock(int period, int duration){
    for(int i = 0; i <= 60 - duration; i++){
        boolean valid = true;
        for(int j = i; j < i + duration; j++){
            if(!isMinuteFree(period,i)){
                valid = false;
                break;
            }
            
            
        }
        if(valid) return i;
    }

    return -1;
}
