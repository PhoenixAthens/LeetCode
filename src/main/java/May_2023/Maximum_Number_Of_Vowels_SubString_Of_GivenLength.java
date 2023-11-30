package May_2023;

public class Maximum_Number_Of_Vowels_SubString_Of_GivenLength {
    //Runtime: 10ms, Memory: 43.3MB
    public int maxVowels(String s, int k) {
        int count=0;
        char[] arr = s.toCharArray();
        for(int i=0;i<k;i++){
            if(arr[i]==97||arr[i]==101||arr[i]==105||arr[i]==111||arr[i]==117)count++;
        }
        int answer=count;
        for(int i=k;i<arr.length;i++){
            count+=(arr[i]==97||arr[i]==101||arr[i]==105||arr[i]==111||arr[i]==117)?1:0;
            count-=(arr[i-k]==97||arr[i-k]==101||arr[i-k]==105||arr[i-k]==111||arr[i-k]==117)?1:0;
            answer=(answer>count)?answer:count; //using Math.max increases runtime by 2ms.
        }
        return answer;
    }
}
