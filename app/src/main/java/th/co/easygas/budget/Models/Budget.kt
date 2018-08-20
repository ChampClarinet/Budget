package th.co.easygas.budget.Models

data class Budget (val budgetId:Int, var budgetName: String, var value: Double){

    internal var isActive = false

    constructor(budgetId: Int, budgetName: String) : this(budgetId, budgetName, 0.0)

}