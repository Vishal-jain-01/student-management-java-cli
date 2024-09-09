




public class hello{
    public static void main(String[] args){

    }
    public void mergesort(int arr[], int low , int high){
        if(low>=high){
            return;
        }
        else{
        int mid = (low+high)/2;
        mergesort(int arr[], int low , int mid );
        mergesort(int arr[], int mid +1 , int high);
        merge(int arr[], int low ,int mid ,int high);}
    
    }
    public void merge(int arr[],int low , int mid , int high){
        int temp[];
    }
}