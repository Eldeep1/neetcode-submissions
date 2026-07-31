class Solution {
func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
    var result : Array<Int> = []
    var dict :Dictionary<Int,Int> = [:]
    for i in 0...nums.count-1{
        dict[nums[i]] = i
    }
    for i in 0...nums.count-1 {
        let current = nums[i]
        if let index = dict[target-current], index != i{
            result.append(i)
            result.append(index)
            break
        }
    }
    return result
    }
}
