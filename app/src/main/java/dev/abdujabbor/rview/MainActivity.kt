package dev.abdujabbor.rview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.abdujabbor.rview.adapters.RVAdapter
import dev.abdujabbor.rview.databinding.ActivityMainBinding
import dev.abdujabbor.rview.models.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private lateinit var rvAdapter: RVAdapter
    lateinit var list: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)


        loadData()

        rvAdapter = RVAdapter(list)
        binding.rv.adapter = rvAdapter


    }

    private fun loadData() {
        list = ArrayList()
        for (i in 0..10) {
            list.add(
                User(
                    "Mbappe",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.sportsmole.co.uk%2Ffootball%2Freal-madrid%2Ftransfer-talk%2Fnews%2Fkylian-mbappe-feels-betrayed-by-psg-wants-january-exit_496705.html&psig=AOvVaw2mqYwuJyOA8L7WZvyu_vrW&ust=1670428921207000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCIjYseWu5fsCFQAAAAAdAAAAABAJ"
                )
            )
            list.add(
                User(
                    "Messi",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.eurosport.co.uk%2Ffootball%2Fworld-cup%2F2022%2Ffifa-world-cup-2022-in-qatar-live-argentina-v-australia-score-updates-and-lionel-messi-eyes-quarter-_sto9254184%2Fstory.shtml&psig=AOvVaw2FUlak6bDuhERKx-SgC3_A&ust=1670428878958000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOi0m9Gu5fsCFQAAAAAdAAAAABAE"
                )
            )

            list.add(
                User(
                    "Ronaldo",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DobXNwOhKLEI&psig=AOvVaw2yxeKP3vqojAgaSM-N_hIZ&ust=1670428830958000&source=images&cd=vfe&ved=0CA8QjRxqFwoTCJC_97mu5fsCFQAAAAAdAAAAABAE"
                )
            )
            list.add(
                User(
                    "Foden",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2Fekanegaye%2Ffootballers%2F&psig=AOvVaw1MGUxgUSvSVycLkLD74jos&ust=1670428769976000&source=images&cd=vfe&ved=0CA8QjRxqFwoTCLCQ65yu5fsCFQAAAAAdAAAAABAE"
                )
            )
        }
    }
}