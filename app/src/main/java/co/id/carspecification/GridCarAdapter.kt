package co.id.carspecification

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridCarAdapter(private val listCar: ArrayList<Car>) : RecyclerView.Adapter<GridCarAdapter.GridViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GridCarAdapter.GridViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_grid_car, parent, false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCar.size
    }

    override fun onBindViewHolder(holder: GridCarAdapter.GridViewHolder, position: Int) {
        val car = listCar[position]
        val carContext = holder.itemView.context

        Glide.with(holder.itemView.context)
            .load(listCar[position].photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imgPhoto)

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
    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}