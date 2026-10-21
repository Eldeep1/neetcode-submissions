class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
           sb.append(s);
           sb.append("∞");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        
        ArrayList<String> result = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if(ch == '∞'){
                result.add(word.toString());
                word.replace(0, word.length(), "");
            }    
        else{
            word.append(ch);
        }
        }
        return result;
        
    }
}