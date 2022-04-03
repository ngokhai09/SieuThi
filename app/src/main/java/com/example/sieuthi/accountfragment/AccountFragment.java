package com.example.sieuthi.accountfragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sieuthi.Account;
import com.example.sieuthi.MainActivity;
import com.example.sieuthi.R;

public class AccountFragment extends Fragment {
    LinearLayout layoutHistory;
    LinearLayout layoutAccept;
    LinearLayout layoutProcess;
    LinearLayout layoutShip;
    LinearLayout layoutFavourite;
    LinearLayout layoutBill;
    View view;
    Context context;
    ListView lstView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_account,container, false);
        context = view.getContext();
        layoutHistory =  view.findViewById(R.id.layoutHistory);
        layoutAccept =  view.findViewById(R.id.layoutAccept);
        layoutProcess =  view.findViewById(R.id.layoutProcess);
        layoutShip =  view.findViewById(R.id.layoutShip);
        layoutFavourite =  view.findViewById(R.id.layoutFavourite);
        layoutBill =  view.findViewById(R.id.layoutBill);
        lstView = view.findViewById(R.id.lstAccount);
        layoutHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, LoginActivity.class);
                startActivity(intent);
            }
        });
        layoutAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
            }
        });
        layoutProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
            }
        });
        layoutShip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
            }
        });
        layoutFavourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
            }
        });
        layoutBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
            }
        });
        setViewAccount();
        return view;
    }
    public void setViewAccount(){
        Toast.makeText(context, "Check",Toast.LENGTH_SHORT).show();
        AccountAdapter accountAdapter = new AccountAdapter(context);
        lstView.setAdapter(accountAdapter);

    }

}