package Day_04;

public class EqualTheNumber {
    public static void main(String[] args) {

  int [] array = {1,1,1,0,1,0};
  int countZeros = 0;
  int countOnes = 0;
  int moves = 0;
        for (int i : array) {
            if (i == 1){
                countOnes++;
            }else {
                countZeros++;
            }
        }

        System.out.println("countOnes = " + countOnes);
        System.out.println("countZeros = " + countZeros);

   if (countOnes<countZeros){
        moves=(countZeros-countOnes)/2;
    }else {
        moves=(countOnes-countZeros)/2;
     }

        System.out.println("moves = " + moves);

    //Math.abs


    }
}
/*Q3:
        - Given an array [1,1,1,0,1,0], after how many moves you need to make it equal the number of 0s and 1s
        - it should be given even length of Array
        Expected output:1
  Q4:
       -An example of a length 21 DNA string(whose alphabet contains the symbols 'A','C','G','T')
       is "ATGCTTCAGAAAGGTCTTACG"
       Expected output:
       A:6 C:4 G:5 T:6

 */