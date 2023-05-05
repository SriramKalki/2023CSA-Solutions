public class Sign{
    private String message;
    private int width;

    public Sign(String message, int width){
        this.message= message;
        this.width= width;
    }

    public int numberOfLines(){
        return message / width + (message % width != 0) ? 1 : 0;
    }    

    public String getLines(){
        String answer = "";
        int loc = 0;
        for(int i=0; i < numberOfLines - 1; i++){
            answer += message.substring(loc , loc + width);
            //0 5 -> 0,1,2,3,4
            answer += ";";
        
            loc += width;
        }

        answer += message.substring(loc);

        return answer;
    }
}