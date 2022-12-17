package dev.abdujabbor.rview.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.abdujabbor.rview.databinding.ItemRvBinding
import dev.abdujabbor.rview.models.User

class RVAdapter(var list: List<User>) : RecyclerView.Adapter<RVAdapter.VH>() {

    inner class VH(val itemRvBinding: ItemRvBinding) : RecyclerView.ViewHolder(itemRvBinding.root) {
        fun onBind(user: User) {
            itemRvBinding.tvTxt.text = user.name
            Picasso.get().load(user.img).into(itemRvBinding.myImg)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {


        holder.onBind(list[position])


    }

    override fun getItemCount(): Int {

        return list.size
    }

}