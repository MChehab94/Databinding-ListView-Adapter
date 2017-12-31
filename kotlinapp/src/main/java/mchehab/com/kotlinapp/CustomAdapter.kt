package mchehab.com.kotlinapp

import android.app.Activity
import android.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import mchehab.com.kotlinapp.databinding.RowListviewBinding

/**
 * Created by muhammadchehab on 12/31/17.
 */
class CustomAdapter(val activity: Activity, val listPerson: List<Person>) : BaseAdapter() {

    override fun getItem(position: Int): Any {
        return listPerson[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return listPerson.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        val binding: RowListviewBinding

        if(convertView == null){
            convertView = LayoutInflater.from(activity).inflate(R.layout.row_listview, null)
            binding = DataBindingUtil.bind(convertView)
            convertView.tag = binding
        }else{
            binding = convertView.tag as RowListviewBinding
        }
        binding.person = listPerson[position]
        return binding.root
    }
}