import java.util.Random;//랜덤함수를 사용하겠다고 선언합니다.

public class sort {
    public static void main(String[] args) {
        int intArray[] = new int[400];//400개의 원소를 가지는 배열 intArray생성
        Random r = new Random();//랜덤함수 r객체 생성

        for (int i = 0; i < intArray.length; i++){
            intArray[i] = r.nextInt(1000) + 1;//1부터 1000까지의 정수를 랜덤으로 추출해 intArray배열에 저장
            for (int j = 0; j < i; j++){//중복을 방지하기 위해 intArray[j]원소가 앞에 있는 원소들과 중복할 경우 i를 하나 줄여 다시 랜덤추출하도록 한다.
                if (intArray[i] == intArray[j]){
                    i--;
                }
            }
        }

        System.out.println("배열 intArray는");

        for (int k = 1; k <= intArray.length; k++){
            System.out.println("intArray[" + k + "] = " + intArray[k-1]);
        }

        System.out.println("입니다.");

        //선택정렬
        System.out.println("첫 번째 정렬은 선택정렬입니다.");

        int tmp1;
        int min;//최솟값 데이터의 인덱스 저장 변수
        int cnt1 = 0;//선택정렬 수행횟수

        for(int i=0; i<intArray.length; i++){
            cnt1++;
            min = i;
            cnt1++;
            for(int j=i+1; j<intArray.length; j++){
                cnt1++;
                if(intArray[min] > intArray[j]){
                    cnt1++;
                    min = j;
                    cnt1++;
                }
            }
            tmp1 = intArray[min];
            cnt1++;
            intArray[min] = intArray[i];
            cnt1++;
            intArray[i] = tmp1;
            cnt1++;
        }

        System.out.println("선택정렬을 사용해 정렬하면");

        for (int k = 1; k <= intArray.length; k++){
            System.out.println("intArray[" + k + "] = " + intArray[k-1]);
        }

        System.out.println("입니다.");

        //버블정렬
        System.out.println("두 번째 정렬은 버블정렬입니다.");

        int tmp2;
        int cnt2 = 0;//버블정렬 수행횟수

        for (int i = 0; i < intArray.length; i++){
            cnt2++;
            for (int j = 0; j < intArray.length; j++){
                cnt2++;
                if (intArray[i] < intArray[j]){
                    cnt2++;
                    tmp2 = intArray[j];
                    cnt2++;
                    intArray[j] = intArray[i];
                    cnt2++;
                    intArray[i] = tmp2;
                    cnt2++;
                }
            }
        }

        System.out.println("버블정렬을 사용해 정렬하면");

        for (int k = 1; k <= intArray.length; k++){
            System.out.println("intArray[" + k + "] = " + intArray[k-1]);
        }

        System.out.println("입니다.");

        //삽입정렬
        System.out.println("세 번째 정렬은 삽입정렬입니다.");

        int tmp3;
        int cnt3 = 0;//삽입정렬 수행횟수
        int j;

        for(int i = 1; i < intArray.length; i++){
            cnt3++;
            tmp3 = intArray[i];
            cnt3++;
            for(j=i-1; j>=0 && tmp3<intArray[j]; j--){
                cnt3++;
                intArray[j+1] = intArray[j];
                cnt3++;
            }
            intArray[j+1] = tmp3;
            cnt3++;
        }

        System.out.println("삽입정렬을 사용해 정렬하면");

        for (int k = 1; k <= intArray.length; k++){
            System.out.println("intArray[" + k + "] = " + intArray[k-1]);
        }

        System.out.println("입니다.");
        System.out.println("선택정렬의 수행횟수는 " + cnt1 + "이고, 버블정렬의 수행횟수는 " + cnt2 + "이고, 삽입정렬의 수행횟수는 " + cnt3 + "입니다.");

        String best;//제일 효율적인 정렬방법
        if (cnt1 < cnt2){
            if (cnt1 < cnt3){
                best = "선택정렬";
            }

            else {
                best = "삽입정렬";
            }
        }

        else{
            if (cnt2 < cnt3){
                best = "버블정렬";
            }

            else {
                best = "삽입정렬";
            }
        }

        System.out.println("제일 효율적인 정렬방법은 \"" + best + "\"" + "입니다.");
    }
}
