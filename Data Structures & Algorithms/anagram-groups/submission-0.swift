class Solution {
    
func groupAnagrams(_ strs: [String]) -> [[String]] {
    
    var sortedToWordsMap: [String: [String]] = [:]
    
    for str in strs {
       
        let sortedWord = String(str.sorted())
        
        sortedToWordsMap[sortedWord, default: []].append(str)
    }
  
    return Array(sortedToWordsMap.values)
}
}
