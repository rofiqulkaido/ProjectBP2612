package com.example.rofiqul2612

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FairyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FairyFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var rvBuku: RecyclerView? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //set layout manager di recyclerview
        rvBuku?.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false)

        //list data buku
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.buku1, "Super Birthday Party",
            "Lorem Ipsum Sit Amet"))
        data.add(BukuModel(R.drawable.buku2, "Reach For The Sky",
            "Lorem Ipsum Sit Amet"))
        data.add(BukuModel(R.drawable.buku3, "Happy World Animals Day",
            "Lorem Ipsum Sit Amet"))
        data.add(BukuModel(R.drawable.buku4, "Learn & Play",
            "Lorem Ipsum Sit Amet"))
        data.add(BukuModel(R.drawable.buku5, "Back To School",
            "Lorem Ipsum Sit Amet"))
        data.add(BukuModel(R.drawable.buku6, "Dedicated to Reading",
            "Lorem Ipsum Sit Amet"))

        //set adapter
        val adapter = AdapterHome(data)

        //set adapter ke recycler view
        rvBuku?.adapter = adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fairy, container, false)
        rvBuku = view.findViewById(R.id.recyclerViewFairy)
        // Inflate the layout for this fragment
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FairyFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FairyFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}