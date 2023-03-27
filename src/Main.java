import java.util.List;

public class Main {
    public static int findMax(List<Integer>numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(max<numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH_NUMBER = "D:\\Code\\Java\\Lession17\\HW2\\src\\numbers.txt";
        String PATH_RESULT = "D:\\Code\\Java\\Lession17\\HW2\\src\\result.txt";
        List<Integer> numbers = readAndWriteFile.readFile(PATH_NUMBER);
        int max = findMax(numbers);
        readAndWriteFile.writeFile(PATH_RESULT, max);
    }
}
