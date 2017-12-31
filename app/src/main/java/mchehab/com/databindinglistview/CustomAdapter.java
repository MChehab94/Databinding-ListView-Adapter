package mchehab.com.databindinglistview;

import android.app.Activity;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ActionMenuView;
import android.widget.BaseAdapter;

import java.util.List;

import mchehab.com.databindinglistview.databinding.RowListviewBinding;

/**
 * Created by muhammadchehab on 12/31/17.
 */

public class CustomAdapter extends BaseAdapter {

    private List<Person> listPerson;
    private Activity activity;

    public CustomAdapter(Activity activity, List<Person> listPerson){
        this.listPerson = listPerson;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return listPerson.size();
    }

    @Override
    public Object getItem(int position) {
        return listPerson.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        RowListviewBinding binding;
        if(convertView == null){
            convertView = LayoutInflater.from(activity).inflate(R.layout.row_listview, null);
            binding = DataBindingUtil.bind(convertView);
            convertView.setTag(binding);
        }else{
            binding = (RowListviewBinding) convertView.getTag();
        }
        binding.setPerson(listPerson.get(position));
        return binding.getRoot();
    }
}