class Solution {
    public int calPoints(String[] operations) {
      Stack<Integer> st=new Stack<>();
      int sum=0;
      for(int i=0;i<operations.length;i++){
        if(operations[i].equals("D")){
            int x=st.peek();
            st.push(x*2);
            sum+=(x*2);
        }
        else if(operations[i].equals("+")){
            int last=st.pop();
            int seclast=st.peek();
            st.push(last);
            st.push(last+seclast);
            sum+=last+seclast;
        }
        else if(operations[i].equals("C") && !st.isEmpty()){
            sum-=st.peek();  
            st.pop(); 
          
        }
        else{
            st.push(Integer.parseInt(operations[i]));
            sum+=st.peek();}
      }  
        return sum;
    }
}