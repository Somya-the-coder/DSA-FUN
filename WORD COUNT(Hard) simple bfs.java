class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
//u can zikr about bi-directional  in interview at the last

//bruteforce and simple concept using BFS
        //each time in seq u need to search the given array i.e O(nlogn) so to reduce tc convert array to set data structure-where search time=O(1)
        //take the 1st word write in 1st level of a tree i.e at the root
        //change 1st char from a-z and check in set,change 2nd char from a-z and check in set,change 3rd char from a-z and check in set,...if you get any write in 2nd level of a tree
        //expand each and write in 3rd level....
        //bfs(more space,less time) will give you the shortest no. of steps(path/level no.) of goal node
        //print it as the answer

        //q is maintained to write the tree words we got , fifo mei cut out and change each
        //q is maintained ...as BFS
////////////////code////////////////
Set<String> wordSet=new HashSet<>(wordList);
if(!wordSet.contains(endWord))
    return 0;

Queue<String> wordQueue=new LinkedList<>();
wordQueue.offer(beginWord);
int distance=1;

//bfs loop
while(!wordQueue.isEmpty())
{
    int size=wordQueue.size();
    //process each word at currrent level
    for(int i=0;i<size;i++)
    {
        String currWord=wordQueue.poll();
        if(currWord.equals(endWord))
            return distance;
        for(int j=0;j<currWord.length();j++){
            char[] temp=currWord.toCharArray();
            for(char c='a';c<='z';c++)
            {
                temp[j]=c;
                String newWord=new String(temp);
                if(wordSet.contains(newWord)){
                    wordQueue.offer(newWord);
                    wordSet.remove(newWord);//not set but q mei poll and offer are used as alternatives
                }
            }
        }
       
    }
    distance++;//level no. stored along with words in the queue
}
return 0;
    }
}
