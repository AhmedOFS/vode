


package com.example.vod
import android.view.*

import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class RecViewAdapter(private val mList: List<data>) : RecyclerView.Adapter<RecViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.listitem, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
   val viewmod = mList[position]
        holder.imageView.setImageResource(R.drawable.v2)
      holder.textView.text= viewmod.name
        holder.textView2.text= viewmod.phone
    }

    override fun getItemCount(): Int {
       return mList.size
    }

class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView){
    val imageView: ImageView=itemView.findViewById(R.id.img)
    val textView: TextView = itemView.findViewById(R.id.title)
    val textView2: TextView = itemView.findViewById(R.id.num)

   //val rec: recyclerView= itemView.findViewById(R.)
}
}