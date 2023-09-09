class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<n+1;i++){
            list.add(i);
        }
        Collections.sort(list,(a,b) -> (String.valueOf(a).compareTo(Integer.toString(b))));


        return list;
    }
}
//TO SORT AN ARRAYLIST OF INT IN LEXIOGRAPHICAL ORDER, CONVERT THEM TO STRING AND DIRECTLY SORT THEM
//KHUD LEXIOGRAPICALLY SORT HO JAYEGA..ABOVE USES LAMBDA EXP, SEE IN CHATGPT..