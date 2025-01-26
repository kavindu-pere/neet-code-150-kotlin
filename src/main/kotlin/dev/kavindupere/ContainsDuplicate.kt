package dev.kavindupere

class ContainsDuplicate {

    fun hasDuplicate(nums: Array<Int>): Boolean {
        val checkedNums = HashSet<Int>()
        for (num in nums) {
            if (num in checkedNums) {
                return true
            }
            checkedNums.add(num)
        }
        return false
    }

    // This is a more concise solution
    fun hasDuplicateConcise(nums: Array<Int>): Boolean {
        return nums.distinct().count() < nums.size
    }
}
