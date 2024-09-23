package com.example.prkt3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.prkt3.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    private var _binding: FragmentResultBinding? = null
    private val binding get() = _binding!!
    private val userViewModel: UserViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        userViewModel.name.observe(viewLifecycleOwner) {
            binding.textViewName.text = it
        }

        userViewModel.email.observe(viewLifecycleOwner) {
            binding.textViewEmail.text = it
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
