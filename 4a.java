public boolean moveCandyToFirstRow(int col){
    
    if(box[0][col] != null) return true;
    
    for(int i = 1; i < box.length; i++){
        if(box[i][col] != null){
            box[0][col] = box[i][col];
            box[i][col] = null;
            return true;
        }
    }

    return false;
}