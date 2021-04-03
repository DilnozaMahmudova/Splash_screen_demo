package uz.dilnoza.mobiuz.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.dilnoza.mobiuz.data.Info
import uz.dilnoza.mobiuz.fragments.Fragment_A

class AdapterPager(
    activity: FragmentActivity,
    ls1: ArrayList<Info>,
    ls2: ArrayList<Info>,
    ls3: ArrayList<Info>
) : FragmentStateAdapter(activity) {
    lateinit var fragment: Fragment
    val list1 = ls1
    val list2 = ls2
    val list3 = ls3
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        if (position == 0) {
            fragment = Fragment_A(list1)
        }
        if (position == 1) {
            fragment = Fragment_A(list2)
        }
        if (position == 2) {
            fragment = Fragment_A(list3)
        }
        return fragment
    }

}