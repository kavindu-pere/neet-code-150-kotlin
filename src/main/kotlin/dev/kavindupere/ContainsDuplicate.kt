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
}
