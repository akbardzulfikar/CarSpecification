package co.id.carspecification

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvCars: RecyclerView
    private var list: ArrayList<Car> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        val actionBar = supportActionBar
        actionBar!!.title = "Car Selection"

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnListView: View = findViewById(R.id.btnList)
        btnListView.setOnClickListener(this)
        val btnGridView: View = findViewById(R.id.btnGrid)
        btnGridView.setOnClickListener(this)

        rvCars = findViewById(R.id.rv_cars)
        rvCars.setHasFixedSize(true)

        list.addAll(CarsData.listData)
        showRecylerList()
    }

    private fun showRecylerList() {
        rvCars.layoutManager = LinearLayoutManager(this)
        val listCarAdapter = ListCarAdapter(list)
        rvCars.adapter = listCarAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.image_profile -> {
                val myAbout = Intent(this@MainActivity, AboutMe::class.java)
                startActivity(myAbout)
            }
        }
    }
    private fun showRecyclerGrid() {
        rvCars.layoutManager = GridLayoutManager(this, 2)
        val gridCarAdapter = GridCarAdapter(list)
        rvCars.adapter = gridCarAdapter
    }

    override fun onClick(v: View) {
       when (v.id) {
           R.id.btnList -> {
               btnList.setBackgroundColor(Color.GRAY)
               btnGrid.setBackgroundColor(Color.WHITE)
                showRecylerList()
           }
           R.id.btnGrid -> {
               btnList.setBackgroundColor(Color.WHITE)
               btnGrid.setBackgroundColor(Color.GRAY)
               showRecyclerGrid()
           }
       }
    }
}