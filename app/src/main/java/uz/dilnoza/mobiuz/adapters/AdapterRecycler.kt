package uz.dilnoza.mobiuz.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*
import uz.dilnoza.mobiuz.R
import uz.dilnoza.mobiuz.data.Info
import uz.dilnoza.mobiuz.extensions.SingleBlock
import uz.dilnoza.mobiuz.extensions.bindItem
import uz.dilnoza.mobiuz.extensions.inflate
import uz.dilnoza.mobiuz.ui.Dialog
import java.util.jar.Attributes
import kotlin.properties.Delegates

class AdapterRecycler(
    val ls: ArrayList<Info>
) :
    RecyclerView.Adapter<AdapterRecycler.ViewHolder>() {
    private var list = ls
    private var listener: SingleBlock<Info>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder((parent.inflate(R.layout.list_item)))

    override fun getItemCount() = list.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind()
    fun setOnClickListener(block: SingleBlock<Info>) {
        listener = block
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        init {
            itemView.apply {
                button.setOnClickListener { listener?.invoke(ls[adapterPosition]) }
            }
        }

        fun bind() = bindItem {
            val d = ls[adapterPosition]
            title.text = d.title
            information.text = d.info
            money.text = d.cost
        }


    }

}
