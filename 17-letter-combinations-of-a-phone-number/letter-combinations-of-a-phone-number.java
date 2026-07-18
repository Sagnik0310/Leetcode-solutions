class Solution {

    HashMap<Character,String> map = new HashMap<>();

    public void backtrack(int idx, String digits, StringBuilder curr, List<String> ans){
        if(idx == digits.length()){
            ans.add(curr.toString());
            return;
        }

        String letters = map.get(digits.charAt(idx));

        for(int i = 0; i < letters.length(); i++){
            curr.append(letters.charAt(i));
            backtrack(idx + 1, digits, curr, ans);
            curr.deleteCharAt(curr.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        List<String> ans = new ArrayList<>();

        if(digits.length() == 0) return ans;

        backtrack(0, digits, new StringBuilder(), ans);

        return ans;
    }
}