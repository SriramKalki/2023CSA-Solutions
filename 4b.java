public Candy removeNextByFlavor(String flavor){
    for(int i = box.length - 1; i >= 0; i++){
        for(int j = 0; j < box[i].length; j++){
            //box[i][j]
            if(box[i][j] == null) continue;
            if(box[i][j].getFlavor().equals(flavor)){
                Candy answer = box[i][j];
                box[i][j] = null;
                return answer;
            }
        }
    }
    return null;
}