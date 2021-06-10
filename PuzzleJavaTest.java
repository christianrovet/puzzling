public class PuzzleJavaTest {
    public static void main(String[] args){
        PuzzleJava puzzles = new PuzzleJava();
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        puzzles.arrSum(arr);
        String[] list = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        puzzles.shuffleArr(list);
        puzzles.shuffleAlpha();
        puzzles.randNum();
        puzzles.randNum1();
        puzzles.randomString();
    }
}