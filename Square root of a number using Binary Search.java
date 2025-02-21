//Find square root of an integer
// ans=1
//   for(int i=1 to n)
//   {
//     if(i*i<=n)  ans=i;//tc=O(log n)
//     else break;
//   }

//using binary search
//if question is find min and max + a range 1-n is given use AAKH BAND KARKE BINARY SEARCH---IT HAS A GENERAL COMMON PATTERN
int floorSqrt(int n)//not exact
  {
    int low=1,high=n,mid=0;//index & values as well
    while(low<=high)
      {
        mid=(high+low)/2;
        long long val=(mid*mid);
        if(mid<val)  low=mid+1;
        else  high=mid-1;
      }
retrun high;//as max possible "integer" neraest to square root, we need to return
  }
