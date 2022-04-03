package com.example.sieuthi.accountfragment;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sieuthi.Account;
import com.example.sieuthi.R;

import java.util.ArrayList;

public class AccountAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;

    public AccountAdapter(Context context) {
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        if (v == null) {
//            if(Account.Username.equals("")){
                Toast.makeText(context, "Hi", Toast.LENGTH_SHORT);
                v = inflater.inflate(R.layout.not_sign_in, null);
                Button btnRes, btnLogin;
                btnRes = v.findViewById(R.id.btnRegister);
                btnLogin = v.findViewById(R.id.btnLogin);
                btnRes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                btnLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                return v;
//            }
//            if(!Account.Status){
//                v = inflater.inflate(R.layout.not_complete, null);
//                LinearLayout layout = v.findViewById(R.id.layoutUpadte);
//                layout.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//
//                    }
//                });
//                return v;
//            }



        }
        return v;
    }
}
