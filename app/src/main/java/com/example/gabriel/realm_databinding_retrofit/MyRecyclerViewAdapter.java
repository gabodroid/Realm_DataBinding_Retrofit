package com.example.gabriel.realm_databinding_retrofit;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gabriel.realm_databinding_retrofit.databinding.RecyclerItemBinding;

import io.realm.OrderedRealmCollection;
import io.realm.RealmRecyclerViewAdapter;

/**
 * Created by gabriel on 06/01/2017.
 */

public class MyRecyclerViewAdapter extends RealmRecyclerViewAdapter<Post, MyRecyclerViewAdapter.MyViewHolder> {

    public MyRecyclerViewAdapter(MainActivity activity, OrderedRealmCollection<Post> data) {
        super(activity, data, true);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Post post = getData().get(position);
        holder.bindItem(post);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private RecyclerItemBinding binding;

        public MyViewHolder(View view) {
            super(view);
            binding = DataBindingUtil.bind(view);
        }

        public void bindItem(Post post) {
            binding.setPost(post);
        }
    }
}
