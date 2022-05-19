package com.example.test.radokov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.test.radokov2.adapter.PatientAdapter;
import com.example.test.radokov2.model.Patient;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements PatientAdapter.OnItemClickListener {

    LinearLayout btnPatient;
    LinearLayout btnSearch;
    LinearLayout btnAjout;

    RecyclerView list;

    ArrayList<Patient> listPatient = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        list = findViewById(R.id.home_list);
        list.setLayoutManager(new LinearLayoutManager(this));
        listPatient.add(new Patient("Fifa1","Mamy23","AAAA"));
        listPatient.add(new Patient("Fifa3","Mamy22","ererer"));
        listPatient.add(new Patient("Fifa2","Mamy3","erth"));
        listPatient.add(new Patient("Fifa3","Mam3y","tyhthyt"));
        listPatient.add(new Patient("Fifa3","Mam3y","dccvvv"));
        listPatient.add(new Patient("Fifa3","Mam3y","dqsxc"));
        listPatient.add(new Patient("Fifa3","Mam3y","eerer"));



        PatientAdapter adapter = new PatientAdapter(this,listPatient);
        list.setAdapter(adapter);





        btnPatient = findViewById(R.id.btn_patient);
        btnPatient.setOnClickListener(v -> {
            Intent Patient = new Intent(getApplicationContext(),ListePatientActivity.class);
            startActivity(Patient);
        });

        btnSearch = findViewById(R.id.btn_search);
        btnSearch.setOnClickListener(v -> {
            Intent Search = new Intent(getApplicationContext(),RechercheActivity.class);
            startActivity(Search);
        });

        btnAjout = findViewById(R.id.btn_ajout);
        btnAjout.setOnClickListener(v -> {
            Intent Ajout = new Intent(getApplicationContext(),AjoutActivity.class);
            startActivity(Ajout);
        });

        adapter.setOnItemClickListener(new PatientAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(HomeActivity.this,listPatient.get(position).getNom() + " "+ position,Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onItemClick(int position) {

    }
}