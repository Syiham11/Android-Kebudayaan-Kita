package com.example.nugraha10.kebudayaannusantara;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.nugraha10.kebudayaannusantara.prov.Aceh;
import com.example.nugraha10.kebudayaannusantara.prov.Bali;
import com.example.nugraha10.kebudayaannusantara.prov.Bangka;
import com.example.nugraha10.kebudayaannusantara.prov.Banten;
import com.example.nugraha10.kebudayaannusantara.prov.Bengkulu;
import com.example.nugraha10.kebudayaannusantara.prov.DIY;
import com.example.nugraha10.kebudayaannusantara.prov.DKI;
import com.example.nugraha10.kebudayaannusantara.prov.Gorontalo;
import com.example.nugraha10.kebudayaannusantara.prov.Jabar;
import com.example.nugraha10.kebudayaannusantara.prov.Jambi;
import com.example.nugraha10.kebudayaannusantara.prov.Jateng;
import com.example.nugraha10.kebudayaannusantara.prov.Jatim;
import com.example.nugraha10.kebudayaannusantara.prov.Kalbar;
import com.example.nugraha10.kebudayaannusantara.prov.Kalsel;
import com.example.nugraha10.kebudayaannusantara.prov.Kalteng;
import com.example.nugraha10.kebudayaannusantara.prov.Kaltim;
import com.example.nugraha10.kebudayaannusantara.prov.Kalut;
import com.example.nugraha10.kebudayaannusantara.prov.KepRiau;
import com.example.nugraha10.kebudayaannusantara.prov.Lampung;
import com.example.nugraha10.kebudayaannusantara.prov.Maluku;
import com.example.nugraha10.kebudayaannusantara.prov.Malut;
import com.example.nugraha10.kebudayaannusantara.prov.NTB;
import com.example.nugraha10.kebudayaannusantara.prov.NTT;
import com.example.nugraha10.kebudayaannusantara.prov.Papbar;
import com.example.nugraha10.kebudayaannusantara.prov.Papua;
import com.example.nugraha10.kebudayaannusantara.prov.Riau;
import com.example.nugraha10.kebudayaannusantara.prov.Sulbar;
import com.example.nugraha10.kebudayaannusantara.prov.Sulgara;
import com.example.nugraha10.kebudayaannusantara.prov.Sulsel;
import com.example.nugraha10.kebudayaannusantara.prov.Sulteng;
import com.example.nugraha10.kebudayaannusantara.prov.Sulut;
import com.example.nugraha10.kebudayaannusantara.prov.Sumbar;
import com.example.nugraha10.kebudayaannusantara.prov.Sumsel;
import com.example.nugraha10.kebudayaannusantara.prov.Sumut;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    public void aceh(View view) {
        Intent aceh = new Intent(Menu.this, Aceh.class);
        startActivity(aceh);
    }

    public void sumbar(View view) {
        Intent sumbar = new Intent(Menu.this, Sumbar.class);
        startActivity(sumbar);
    }

    public void sumut(View view) {
        Intent sumut = new Intent(Menu.this, Sumut.class);
        startActivity(sumut);
    }

    public void riau(View view) {
        Intent riau = new Intent(Menu.this, Riau.class);
        startActivity(riau);
    }

    public void kepriau(View view) {
        Intent kepriau = new Intent(Menu.this, KepRiau.class);
        startActivity(kepriau);
    }

    public void jambi(View view) {
        Intent jambi = new Intent(Menu.this, Jambi.class);
        startActivity(jambi);
    }

    public void sumsel(View view) {
        Intent sumsel = new Intent(Menu.this, Sumsel.class);
        startActivity(sumsel);
    }

    public void bangka(View view) {
        Intent bangka = new Intent(Menu.this, Bangka.class);
        startActivity(bangka);
    }

    public void bengkulu(View view) {
        Intent bengkulu = new Intent(Menu.this, Bengkulu.class);
        startActivity(bengkulu);
    }

    public void lampung(View view) {
        Intent lampung = new Intent(Menu.this, Lampung.class);
        startActivity(lampung);
    }

    public void banten(View view) {
        Intent banten = new Intent(Menu.this, Banten.class);
        startActivity(banten);
    }

    public void dki(View view) {
        Intent dki = new Intent(Menu.this, DKI.class);
        startActivity(dki);
    }

    public void jabar(View view) {
        Intent jabar = new Intent(Menu.this, Jabar.class);
        startActivity(jabar);
    }

    public void jateng(View view) {
        Intent jateng = new Intent(Menu.this, Jateng.class);
        startActivity(jateng);
    }

    public void diy(View view) {
        Intent diy = new Intent(Menu.this, DIY.class);
        startActivity(diy);
    }

    public void jatim(View view) {
        Intent jatim = new Intent(Menu.this, Jatim.class);
        startActivity(jatim);
    }

    public void bali(View view) {
        Intent bali = new Intent(Menu.this, Bali.class);
        startActivity(bali);
    }

    public void ntb(View view) {
        Intent ntb = new Intent(Menu.this, NTB.class);
        startActivity(ntb);
    }

    public void ntt(View view) {
        Intent ntt = new Intent(Menu.this, NTT.class);
        startActivity(ntt);
    }

    public void kalbar(View view) {
        Intent kalbar = new Intent(Menu.this, Kalbar.class);
        startActivity(kalbar);
    }

    public void kalteng(View view) {
        Intent kalteng = new Intent(Menu.this, Kalteng.class);
        startActivity(kalteng);
    }

    public void kalsel(View view) {
        Intent kalsel = new Intent(Menu.this, Kalsel.class);
        startActivity(kalsel);
    }

    public void kaltim(View view) {
        Intent kaltim = new Intent(Menu.this, Kaltim.class);
        startActivity(kaltim);
    }

    public void kalut(View view) {
        Intent kalut = new Intent(Menu.this, Kalut.class);
        startActivity(kalut);
    }

    public void sulut(View view) {
        Intent sulut = new Intent(Menu.this, Sulut.class);
        startActivity(sulut);
    }

    public void sulbar(View view) {
        Intent sulbar = new Intent(Menu.this, Sulbar.class);
        startActivity(sulbar);
    }

    public void sulteng(View view) {
        Intent sulteng = new Intent(Menu.this, Sulteng.class);
        startActivity(sulteng);
    }

    public void sulgara(View view) {
        Intent sulgara = new Intent(Menu.this, Sulgara.class);
        startActivity(sulgara);
    }

    public void sulsel(View view) {
        Intent sulsel = new Intent(Menu.this, Sulsel.class);
        startActivity(sulsel);
    }

    public void gorontalo(View view) {
        Intent gorontalo = new Intent(Menu.this, Gorontalo.class);
        startActivity(gorontalo);
    }

    public void maluku(View view) {
        Intent maluku = new Intent(Menu.this, Maluku.class);
        startActivity(maluku);
    }

    public void malut(View view) {
        Intent malut = new Intent(Menu.this, Malut.class);
        startActivity(malut);
    }

    public void papbar(View view) {
        Intent papbar = new Intent(Menu.this, Papbar.class);
        startActivity(papbar);
    }

    public void papua(View view) {
        Intent papua = new Intent(Menu.this, Papua.class);
        startActivity(papua);
    }


}
