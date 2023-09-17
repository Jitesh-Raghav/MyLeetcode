class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
    var repeated = new HashSet<String>();
    var seen = new HashSet<String>();

    for (var left = 0; left + 9 < s.length(); left++) {
        var curr = s.substring(left, left + 10);
        if (!seen.add(curr))
            repeated.add(curr);
    }

    return new ArrayList<>(repeated);
}
}