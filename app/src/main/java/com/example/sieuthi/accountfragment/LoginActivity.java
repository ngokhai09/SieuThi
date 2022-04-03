package com.example.sieuthi.accountfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sieuthi.Database;
import com.example.sieuthi.R;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin;
    EditText txtUser;
    EditText txtPass;
    Connection conn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = findViewById(R.id.btnSignIn);
        txtUser = findViewById(R.id.username);
        txtPass = findViewById(R.id.password);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Database db = new Database();
                    conn = null;
                    conn = db.connectionclass();

                    if(conn != null){
                        String query = "Select TaiKhoan, MatKhau from TaiKhoan where TaiKhoan = '" + txtUser.getText().toString() + "'";
                        Toast.makeText(LoginActivity.this, query, Toast.LENGTH_SHORT).show();
                        Toast.makeText(LoginActivity.this, "hi", Toast.LENGTH_SHORT).show();
                        Statement st = conn.createStatement();
                        ResultSet rs = st.executeQuery(query);

                        if(rs == null){
                            Toast.makeText(LoginActivity.this, "Sai Tai khoan hoac mat khau", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(LoginActivity.this, "Dang nhap thanh cong", Toast.LENGTH_SHORT).show();
                        }
                    }
                }catch (Exception e){
                    Toast.makeText(LoginActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}