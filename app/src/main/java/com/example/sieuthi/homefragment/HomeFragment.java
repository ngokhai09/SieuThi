package com.example.sieuthi.homefragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sieuthi.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    Context context;
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        context = view.getContext();

        setRecyclerViewBanner();

        setRecyclerViewCategory();

        setRecyclerViewNewsfeed();

        return view;
    }

    private void setRecyclerViewNewsfeed() {

        // Add database
        ArrayList<Newsfeed> listNewsfeed = new ArrayList<>();
        listNewsfeed.add(new Newsfeed(R.drawable.news1, "Ngày hội giảm giá săn sale thả ga", "25/03/2022",
                "Từ ngày 25.03-31.03, chốt đơn ngay hàng trăm mặt hàng với giá siêu rẻ"));
        listNewsfeed.add(new Newsfeed(R.drawable.news1, "Ngày hội giảm giá săn sale thả ga", "25/03/2022",
                "Từ ngày 25.03-31.03, chốt đơn ngay hàng trăm mặt hàng với giá siêu rẻ"));
        listNewsfeed.add(new Newsfeed(R.drawable.news1, "Ngày hội giảm giá săn sale thả ga", "25/03/2022",
                "Từ ngày 25.03-31.03, chốt đơn ngay hàng trăm mặt hàng với giá siêu rẻ"));
        listNewsfeed.add(new Newsfeed(R.drawable.news1, "Ngày hội giảm giá săn sale thả ga", "25/03/2022",
                "Từ ngày 25.03-31.03, chốt đơn ngay hàng trăm mặt hàng với giá siêu rẻ"));
        listNewsfeed.add(new Newsfeed(R.drawable.news1, "Ngày hội giảm giá săn sale thả ga", "25/03/2022",
                "Từ ngày 25.03-31.03, chốt đơn ngay hàng trăm mặt hàng với giá siêu rẻ"));
        listNewsfeed.add(new Newsfeed(R.drawable.news1, "Ngày hội giảm giá săn sale thả ga", "25/03/2022",
                "Từ ngày 25.03-31.03, chốt đơn ngay hàng trăm mặt hàng với giá siêu rẻ"));
        listNewsfeed.add(new Newsfeed(R.drawable.news1, "Ngày hội giảm giá săn sale thả ga", "25/03/2022",
                "Từ ngày 25.03-31.03, chốt đơn ngay hàng trăm mặt hàng với giá siêu rẻ"));
        listNewsfeed.add(new Newsfeed(R.drawable.news1, "Ngày hội giảm giá săn sale thả ga", "25/03/2022",
                "Từ ngày 25.03-31.03, chốt đơn ngay hàng trăm mặt hàng với giá siêu rẻ"));
        listNewsfeed.add(new Newsfeed(R.drawable.news1, "Ngày hội giảm giá săn sale thả ga", "25/03/2022",
                "Từ ngày 25.03-31.03, chốt đơn ngay hàng trăm mặt hàng với giá siêu rẻ"));

        // init
        RecyclerView rcvNewsfeed = (RecyclerView) view.findViewById(R.id.recyclerViewNewsfeed);
        NewsfeedAdapter newsfeedAdapter = new NewsfeedAdapter(context, listNewsfeed);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);

        // set up
        rcvNewsfeed.setAdapter(newsfeedAdapter);
        rcvNewsfeed.setLayoutManager(linearLayoutManager);
    }

    private void setRecyclerViewCategory() {

        // Add database
        ArrayList<Product> listProduct = new ArrayList<>();
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));

        ArrayList<CategoryProduct> listCategory = new ArrayList<>();
        listCategory.add(new CategoryProduct("Khuyến mại", listProduct));
        listCategory.add(new CategoryProduct("Bán chạy", listProduct));
        listCategory.add(new CategoryProduct("Hàng mới về", listProduct));

        // init
        RecyclerView rcvCatedory = (RecyclerView) view.findViewById(R.id.recyclerViewListHighlight);
        CategoryProductAdapter categoryAdapter = new CategoryProductAdapter(context, listCategory);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);

        // set up
        rcvCatedory.setAdapter(categoryAdapter);
        rcvCatedory.setLayoutManager(linearLayoutManager);

    }

    private void setRecyclerViewBanner() {

        // Add database
        ArrayList<Banner> listBanner = new ArrayList<>();

        listBanner.add(new Banner(R.drawable.banner));
        listBanner.add(new Banner(R.drawable.banner));
        listBanner.add(new Banner(R.drawable.banner));
        listBanner.add(new Banner(R.drawable.banner));
        listBanner.add(new Banner(R.drawable.banner));
        listBanner.add(new Banner(R.drawable.banner));
        listBanner.add(new Banner(R.drawable.banner));
        listBanner.add(new Banner(R.drawable.banner));

        // init
        RecyclerView rcvBanner = (RecyclerView) view.findViewById(R.id.recyclerViewBanner);
        BannerAdapter bannerAdapter = new BannerAdapter(context, listBanner);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);

        // set up
        rcvBanner.setAdapter(bannerAdapter);
        rcvBanner.setLayoutManager(linearLayoutManager);

    }

}