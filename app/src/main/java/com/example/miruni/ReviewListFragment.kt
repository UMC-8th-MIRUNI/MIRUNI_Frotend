package com.example.miruni
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.miruni.databinding.FragmentReviewListBinding

class ReviewListFragment : Fragment() {

    private lateinit var binding : FragmentReviewListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentReviewListBinding.inflate(layoutInflater, container, false)
//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

        return binding.root
    }


}