package com.example.xdapp.ui.notes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders


class NotesFragment : Fragment() {

    private lateinit var notesViewModel: NotesViewModel



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

            notesViewModel = ViewModelProviders.of(this).get(NotesViewModel::class.java)
        val root = inflater.inflate(com.example.xdapp.R.layout.fragment_add, container, false)


        return root

    }

//    class MyViewPagerAdapter(manager:FragmentManager): FragmentPagerAdapter(manager){
//        private val fragmentList: MutableList<Fragment> = ArrayList()
//        private val titleList:MutableList<String> = ArrayList()
//
//        override fun getItem(position: Int): Fragment {
//            return  when(position){
//                0->{
//                    IdeaFragment()
//                }
//                1->{
//                    ScrapFragment()
//                }
//                2 ->{
//                    StudyFragment()
//                }
//                3->{
//                    ThoughtsFragment()
//                }
//                4->{
//                    To_dilistFragment()
//                }
//                else->{
//                    return To_dilistFragment()
//                }
//            }
//
//
//        }
//
//        override fun getCount(): Int {
//            return 5
//        }
//
//        override fun getPageTitle(position: Int): CharSequence? {
//            return when(position){
//                    0->"Idea"
//                1->"Scrap"
//                2 ->"Study"
//                3->"Thoughts"
//                else ->{
//                    return "To_do list"
//                }
//            }
//        }
//
//    }
}
