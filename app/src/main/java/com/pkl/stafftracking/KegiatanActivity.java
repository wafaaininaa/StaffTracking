package com.pkl.stafftracking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class KegiatanActivity extends AppCompatActivity {

    private Button button,btn;
    private EditText keterangan;
    public String tanggal;
    private TextView date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kegiatan);

        Calendar c = Calendar.getInstance();
        int mYear = c.get(Calendar.YEAR);
        int mMonth = c.get(Calendar.MONTH);
        int mDay = c.get(Calendar.DAY_OF_MONTH);

        tanggal = mYear + "/" + mMonth + "/" + mDay;
        date.setText(tanggal);

        // inisialisasi fields EditText dan Button
        keterangan = findViewById(R.id.keterangan);
        date = (TextView) findViewById(R.id.mydate);
        button = (Button) findViewById(R.id.Button);
        btn = (Button) findViewById(R.id.Btn);
    }
}
