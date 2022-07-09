package Array;

public class TwoDimension {
    public static void main(String[] args){
        char[][] alphabet = new char[2][13];
        char ch ='A';
        for(int i =0; i<alphabet.length; i++){
            for(int j=0; j<alphabet[i].length; j++, ch++){
                alphabet[i][j] = ch;
            }
        }

        for(int i =0; i<alphabet.length; i++){
            for(int j=0; j<alphabet[i].length; j++){
                System.out.println(alphabet[i][j]);
            }
        }
    }
}
