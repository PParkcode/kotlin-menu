package menu

class Categories(private val categoriesMember: MutableList<Category>) {


    fun get(num: Int): Category {
        categoriesMember[num-1].count++
        println(categoriesMember[num-1].categoryName+categoriesMember[num-1].count)
        return categoriesMember[num - 1]
    }

    fun checkCount(num: Int): Boolean {
        if (categoriesMember[num - 1].count >=2) return false

        return true
    }

    fun getLastCategoryMenus(num: Int): List<String> {
        return categoriesMember[num].menus
    }

    fun add(category: Category) {
        categoriesMember.add(category)
    }

    fun getCategoryData(): List<String> {
        val categoryNameData = mutableListOf<String>()

        for (category in categoriesMember) {
            categoryNameData.add(category.categoryName)
        }
        return categoryNameData
    }
}