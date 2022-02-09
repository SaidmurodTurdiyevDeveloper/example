package com.example.experience

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.experience.databinding.MainLayoutBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment(R.layout.main_layout) {
    private val binding: MainLayoutBinding by viewBinding()

    @Inject
    lateinit var example: Example
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.tvMain.text = example.getText()
    }
}