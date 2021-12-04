package me.ibrahimsn.smoothbottombar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.custom_row.*
import kotlinx.android.synthetic.main.custom_row.view.*
import kotlinx.android.synthetic.main.fragment_first.*
import me.ibrahimsn.smoothbottombar.ui.adapter.CustomAdapter
import me.ibrahimsn.smoothbottombar.ui.model.notes
import me.ibrahimsn.smoothbottombar.ui.viewmodel.AddViewModel
import java.util.concurrent.atomic.AtomicInteger


class FirstFragment : Fragment() {

    private lateinit var viewModel: AddViewModel



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_first, container, false)



        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        floatingActionButton1.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            Navigation.findNavController(it).navigate(action)
        }

        viewModel  = ViewModelProvider(this).get(AddViewModel::class.java)

        var adapter = CustomAdapter(arrayListOf())
        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(context)

        viewModel.readAllData.observe(viewLifecycleOwner, Observer {
            adapter.setData(it as ArrayList<notes>)

        })

        viewModel.readOneData.observe(viewLifecycleOwner, Observer {
            textView3.setText(it.head)
            textView4.setText(it.desciription)
        })

    }





}
