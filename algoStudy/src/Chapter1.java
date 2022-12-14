import java.util.*;

public class Chapter1 {

    /**
     * 정수 입력 공통 함수
     * @param cnt 입력받을 정수 개수
     * @return 입력된 정수 리스트
     */
    public List<Integer> inputData(int cnt){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 "+cnt+"개 를 입력하세요.");

        List<Integer> input = new ArrayList<>();
        int num = 0;

        for(int i=0;i<cnt;i++){
            System.out.print(i+1+"번째 값");
            num = stdIn.nextInt();
            input.add(num);
        }
        return input;
    }

    // 세 값의 최대값 구하기
    public void max3(){
        System.out.println("세 정수의 최대값을 구합니다.");
        List<Integer> data = inputData(3);

        int max = data.get(0);

        for(int i=1;i<data.size();i++){
            if(data.get(i)>max){
                max = data.get(i);
            }
        }
        System.out.println("최댓값은 "+ max + "입니다.");
    }

    public void maxOfInputNum(){
        Scanner stdIn = new Scanner(System.in);

        int inputNum = 0;
        System.out.println("입력할 정수의 개수 : ");
        inputNum = stdIn.nextInt();
        List<Integer> data = inputData(inputNum);

        int max = data.get(0);

        for(int i=1;i<data.size();i++){
            if(data.get(i)>max){
                max = data.get(i);
            }
        }
        System.out.println(inputNum+"개 중 최댓값은 "+ max + "입니다.");
    }

    public void median(){

    }

    public static void main(String[] args) {
        Chapter1 chapter1 = new Chapter1();
        //chapter1.max3();
        chapter1.maxOfInputNum();
    }
}
