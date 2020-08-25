package co.id.carspecification

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListCarAdapter(private val listCar: ArrayList<Car>) :
    RecyclerView.Adapter<ListCarAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_car_specification, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCar.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val car = listCar[position]
        val carContext = holder.itemView.context

        Glide.with(holder.itemView.context)
            .load(car.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.carName.text = car.name
        holder.carDetail.text = car.detail

        holder.itemView.setOnClickListener {
            val movecarDetail = Intent(carContext, CarDetailsActivity::class.java)
            movecarDetail.putExtra(CarDetailsActivity.EXTRA_NAME, car.name)
            movecarDetail.putExtra(CarDetailsActivity.EXTRA_DETAIL, car.detail)
            movecarDetail.putExtra(CarDetailsActivity.EXTRA_PHOTO, car.photo)
            movecarDetail.putExtra(CarDetailsActivity.EXTRA_YEAR, car.year)
            movecarDetail.putExtra(CarDetailsActivity.EXTRA_YOUTUBE, car.youtube)
            carContext.startActivity(movecarDetail)
        }
    }
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var carName: TextView = itemView.findViewById(R.id.car_item_name)
        var carDetail: TextView = itemView.findViewById(R.id.car_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }
}