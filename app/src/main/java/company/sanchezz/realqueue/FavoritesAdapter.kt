package company.sanchezz.realqueue

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.jetbrains.anko.find

/**
 * Created by AlejandroSanchez on 6/28/17.
 */
class FavoritesAdapter : RecyclerView.Adapter<FavoritesAdapter.ViewHolder>() {

    private var mListener: OnItemClickListener? = null
    private var mItemList : ArrayList<String>? = null

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.find<TextView>(R.id.textItem)
    }

    fun modifyData(itemList: ArrayList<String>) {
        mItemList!!.clear()
        mItemList = itemList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): FavoritesAdapter.ViewHolder? {
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.item_queue, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = mItemList!!.size

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.title.text = mItemList!![position]
        holder.itemView.setOnClickListener { v->
            mListener?.onItemClickListener(v, holder.layoutPosition)
        }
    }



    fun setOnItemClickListener(listener: OnItemClickListener) {
        mListener = listener
    }

    interface OnItemClickListener {
        fun onItemClickListener(v: View, pos: Int)
    }


}
