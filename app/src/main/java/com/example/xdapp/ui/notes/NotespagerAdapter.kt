package com.example.xdapp.ui.notes

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import java.util.*

class NotespagerAdapter (fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager)
{
    private val TAB_TITLES = arrayListOf("Idea","Thoughts","Study","Scrap","To_do list")

    private val fragments:ArrayList<Fragment>by lazy{
        ArrayList<Fragment>()
    }
    fun addFragment(fragment: Fragment, data: Bundle? = null){
        fragments.add(fragment)
        fragment.arguments = data

    }
    override fun getItem(position: Int): Fragment {
return fragments[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return TAB_TITLES[position]
    }

}