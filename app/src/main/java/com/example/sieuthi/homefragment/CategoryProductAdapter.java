package com.example.sieuthi.homefragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sieuthi.R;

import java.util.List;

public class CategoryProductAdapter extends RecyclerView.Adapter<CategoryProductAdapter.CategoryViewHolder> {

    Context context;
    List<CategoryProduct> listCategory;

    public CategoryProductAdapter(Context context, List<CategoryProduct> listCategory) {
        this.context = context;
        this.listCategory = listCategory;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview_category, parent, false);

        return new CategoryProductAdapter.CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        CategoryProduct category = (CategoryProduct) listCategory.get(position);
        if(category != null) {
            holder.tvName.setText(category.getName());

            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false);
            ProductAdapter productAdapter = new ProductAdapter(context, category.getListProduct());

            holder.rcvListProduct.setLayoutManager(linearLayoutManager);
            holder.rcvListProduct.setAdapter(productAdapter);
        }
    }

    @Override
    public int getItemCount() {
        return listCategory.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        RecyclerView rcvListProduct;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = (TextView) itemView.findViewById(R.id.textViewTileCategory);
            rcvListProduct = (RecyclerView) itemView.findViewById(R.id.recyclerViewListProduct);
        }
    }
}
