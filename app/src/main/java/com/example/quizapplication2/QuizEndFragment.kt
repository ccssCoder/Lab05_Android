package com.example.quizapplication2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class QuizEndFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_quiz_end, container, false)

        val button = view.findViewById<Button>(R.id.button3)

        button.setOnClickListener {
            Navigation
                .findNavController(view)
                .navigate(R.id.action_quizEndFragment_to_quizStartFragment)
        }

        return view
    }
}