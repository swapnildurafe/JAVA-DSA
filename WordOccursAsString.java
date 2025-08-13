class WordOccursAsString{

    public static int check(String sentence, String target){
        String[] sent = sentence.split(" ");
        for(int i=0;i<sent.length;i++){
            if(sent[i].startsWith(target)){
                return (i+1);
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String sentence = "i love bhoomi";
        String target = "bhoomi";
        System.out.print(check(sentence,target));
    }
}