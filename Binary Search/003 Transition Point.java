//Question Link: https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1
class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        int lo = 0;
        int hi = n-1;
        
        int pa = -1;
        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;
            
            if(arr[mid] == 1) {
                pa = mid;
                hi = mid-1;
            } else {
                lo = mid + 1;
            }
        }
        
        return pa;
    }
}
