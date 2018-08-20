package th.co.easygas.budget.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import th.co.easygas.budget.Models.Budget
import th.co.easygas.budget.R
import th.co.easygas.budget.Utils.Utils

class BudgetAdapter(private var dataSet: ArrayList<Budget>, private var context: Context) : RecyclerView.Adapter<BudgetAdapter.GenericHolder>() {

    private val TAG: String = BudgetAdapter::class.java.simpleName

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenericHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.icon_budget, parent, false)
        return ViewHolder(v, this.context)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: GenericHolder, position: Int) {
        val budget = dataSet.get(position)
        holder.setViewData(budget)
    }

    fun printList():String{
        var out = ""
        (dataSet).forEach{
            i -> out += "${i.budgetName}, "
        }
        return out
    }

    abstract class GenericHolder(view : View) : RecyclerView.ViewHolder(view){

        abstract fun setViewData(budget :Budget)

    }

    class ViewHolder(view: View, private var context: Context) : GenericHolder(view) {

        override fun setViewData(budget: Budget) {
            //set view and data here
            val budgetName = itemView.findViewById<TextView>(R.id.icon_budget_name)
            val budgetValue = itemView.findViewById<TextView>(R.id.icon_budget_value)
            budgetName.text = budget.budgetName
            budgetValue.text = Utils.roundTwoDigits(budget.value).toString()
        }

    }

}