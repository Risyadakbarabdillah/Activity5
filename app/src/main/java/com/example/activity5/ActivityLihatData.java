package com.example.activity5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity{
    TextView tvnama, tvnomor;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        switch (nama)
        {
            case "Dama":
                tvnama.setText("Risyad Akbar Abdillah");
                tvnomor.setText("082111714008");
                break;
            case "Kurek" :
                tvnama.setText("Tata Cantika");
                tvnomor.setText("08228912236");
                break;
            case "Abay" :
                tvnama.setText("Afra Amira");
                tvnomor.setText("085700912236");
                break;
            case "Komo" :
                tvnama.setText("Yolanda Adelia");
                tvnomor.setText("08579812236");
                break;
            case "Gama" :
                tvnama.setText("Retno puspita sari");
                tvnomor.setText("0822891229009");
                break;
            case "Ilham" :
                tvnama.setText("Ilham Najeb");
                tvnomor.setText("08218912227");
                break;
            case "Titok" :
                tvnama.setText("Titok Sanjaya");
                tvnomor.setText("0822891222099");
                break;
            case "Tiok" :
                tvnama.setText("Tiok kurniawan");
                tvnomor.setText("082289220997");
                break;
            case "Vivian" :
                tvnama.setText("Vivian Sandi");
                tvnomor.setText("082289220999");
                break;
            case "Marpuah" :
                tvnama.setText("Marpuah Marji");
                tvnomor.setText("08228970922");
                break;
        }
    }
}
