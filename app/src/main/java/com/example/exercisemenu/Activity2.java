package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void showpopup1(View v){
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu1);
        popup.show();
    }

    public void showpopup2(View v){
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu2);
        popup.show();
    }

    public void showpopup3(View v){
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu3);
        popup.show();
    }

    public void showpopup4(View v){
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu4);
        popup.show();
    }

    public void showpopup5(View v){
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu5);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item){
        switch (item.getItemId()){
            case R.id.item11:
                Intent persegi1 = new Intent(this, luasPersegi.class);
                startActivity(persegi1);
                return true;

            case R.id.item12:
                Intent persegi2 = new Intent(this, kelilingPersegi.class);
                startActivity(persegi2);
                return true;

            case R.id.item21:
                Intent lingkaran1 = new Intent(this, luasLingkaran.class);
                startActivity(lingkaran1);
                return true;

            case R.id.item22:
                Intent lingkaran2 = new Intent(this, kelilingLingkaran.class);
                startActivity(lingkaran2);
                return true;

            case R.id.item31:
                Intent segipanjang1 = new Intent(this, luasSegipanjang.class);
                startActivity(segipanjang1);
                return true;

            case R.id.item32:
                Intent segipanjang2 = new Intent(this, kelilingSegiPanjang.class);
                startActivity(segipanjang2);
                return true;

            case R.id.item41:
                Intent segitiga1 = new Intent(this, luasSegitiga.class);
                startActivity(segitiga1);
                return true;

            case R.id.item42:
                Intent segitiga2 = new Intent(this, kelilingSegitiga.class);
                startActivity(segitiga2);
                return true;

            case R.id.item51:
                Intent trapesium1 = new Intent(this, luasTrapesium.class);
                startActivity(trapesium1);
                return true;

            case R.id.item52:
                Intent trapesium2 = new Intent(this, kelilingTrapesium.class);
                startActivity(trapesium2);
                return true;

            default:
                return false;
        }
    }
}
