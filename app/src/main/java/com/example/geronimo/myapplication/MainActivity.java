package com.example.geronimo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
//BitrixConnection connection= new BitrixConnection();
BitrixConnection bc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void LoginBtn(View v) {
        String password=((EditText)findViewById(R.id.editTextPassword)).getText().toString();
        String login=((EditText)findViewById(R.id.editTextLogin)).getText().toString();
        if (login == "") {
//вывод ошибки
        } else if (password == "") {
            //вывод ошибки
        } else {
            try {
                //connection.login(login, password, "http://cc25455-bitrix-1.tw1.ru/mobile/Auth.php");

                bc.execute("http://cc25455-bitrix-1.tw1.ru/mobile/Auth.php",login,password);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void onClick_registr(View v) {
        Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
        startActivity(intent);
    }
}
