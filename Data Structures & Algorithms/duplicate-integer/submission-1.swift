class Solution {
func hasDuplicate(_ nums: [Int]) -> Bool {
    var set : Set<Int> = []
    for num in nums{
        let duplicated = set.insert(num)
        if !duplicated.inserted { return true}
    }
    return false;
}
}
