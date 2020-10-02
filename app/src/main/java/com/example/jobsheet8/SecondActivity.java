package com.example.jobsheet8;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;

public class SecondActivity extends AppCompatActivity {

    DatePickerDialog picker, date;
    EditText favname;
    EditText favNik;
    EditText motname;
    EditText momNik;
    EditText dobF;
    EditText dobM;
    EditText address;
    EditText rt;
    EditText rw;
    EditText Kabupaten;
    EditText pos;
    EditText tel;
    EditText DiplomF;
    EditText DiplomM;
    EditText JobF;
    EditText JobM;
    Spinner Provinsi;
    Button nextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        dobF = (EditText)findViewById(R.id.DoBFathertxt);
        dobM = (EditText)findViewById(R.id.DoBMothertxt);
        nextview = (Button)findViewById(R.id.Next);

        dobF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar calendar = Calendar.getInstance();
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                int month = calendar.get(Calendar.MONTH);
                int year = calendar.get(Calendar.YEAR);

                picker = new DatePickerDialog(SecondActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        dobF.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                    }
                }, year, month, day);
                picker.show();
            }
        });

        dobM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar calendar = Calendar.getInstance();
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                int month = calendar.get(Calendar.MONTH);
                int year = calendar.get(Calendar.YEAR);

                date = new DatePickerDialog(SecondActivity.this,new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        dobM.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                    }
                }, year,month,day);
                date.show();
            }
        });

        nextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                favname = (EditText)findViewById(R.id.FathersnameTxt);
                favNik =(EditText)findViewById(R.id.NikFathTxt);
                motname = (EditText)findViewById(R.id.MotherNametxt);
                momNik =(EditText) findViewById(R.id.NikMothtxt);
                dobF = (EditText)findViewById(R.id.DoBFathertxt);
                dobM =(EditText)findViewById(R.id.DoBMothertxt);
                address =(EditText)findViewById(R.id.Addresstxt);
                rt = (EditText)findViewById(R.id.RTtxt);
                rw = (EditText)findViewById(R.id.Rwtxt);
                Provinsi =(Spinner)findViewById(R.id.spinnerProvince);
                Kabupaten =(EditText)findViewById(R.id.kabupatentxt);
                pos = (EditText)findViewById(R.id.KodePostxt);
                tel =(EditText)findViewById(R.id.Teltxt);
                DiplomF =(EditText)findViewById(R.id.FDiplomtxt);
                DiplomM =(EditText)findViewById(R.id.MDiplomtxt);
                JobF =(EditText)findViewById(R.id.FathJobtxt);
                JobM =(EditText)findViewById(R.id.MomJobtxt);

                String Fname= favname.getText().toString();
                String Fnik = favNik.getText().toString();
                String Mname= motname.getText().toString();
                String Mnik = momNik.getText().toString();
                String DoBf= dobF.getText().toString();
                String DoBm = dobM.getText().toString();
                String Address = address.getText().toString();
                String Rt= rt.getText().toString();
                String Rw = rw.getText().toString();
                String Pro = Provinsi.getSelectedItem().toString();
                String Kabup = Kabupaten.getText().toString();
                String Pos = pos.getText().toString();
                String Tel = tel.getText().toString();
                String diplomF = DiplomF.getText().toString();
                String diplomM = DiplomM.getText().toString();
                String jobF = JobF.getText().toString();
                String jobM = JobM.getText().toString();

                Intent intent= new Intent(SecondActivity.this,ThirdActivity.class);
                intent.putExtra("Father name",Fname);
                intent.putExtra("Nik Father",Fnik);
                intent.putExtra("Mother name", Mname);
                intent.putExtra("Nik mother", Mnik);
                intent.putExtra("Birth date", DoBf);
                intent.putExtra("Bitrh date2",DoBm);
                intent.putExtra("Address", Address);
                intent.putExtra("Rt", Rt);
                intent.putExtra("Rw", Rw);
                intent.putExtra("Province", Pro);
                intent.putExtra("kabupaten", Kabup);
                intent.putExtra("KodePos", Pos);
                intent.putExtra("tel", Tel);
                intent.putExtra("Diplomef", diplomF);
                intent.putExtra("Diplomm", diplomM);
                intent.putExtra("JobF",jobF);
                intent.putExtra("JobM",jobM);

                startActivity(intent);


            }
        });


    }
}