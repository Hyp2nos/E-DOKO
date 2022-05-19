package com.example.test.radokov2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.radokov2.R;
import com.example.test.radokov2.model.Patient;

import java.util.ArrayList;

public class PatientAdapter extends RecyclerView.Adapter<PatientAdapter.PatientHolder> {

    Context ctx;
    ArrayList<Patient> dataSet;
    public OnItemClickListener listener;

    public PatientAdapter(Context ctx, ArrayList<Patient> dataSet) {
        this.ctx = ctx;
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public PatientHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(ctx).inflate(R.layout.patient_item, parent,false);

        return new PatientHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PatientHolder holder, int position) {
        Patient pat = dataSet.get(position);
        holder.setDetails(pat);
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    class PatientHolder extends RecyclerView.ViewHolder{

        TextView nom,prenom,date;
        public PatientHolder(@NonNull View itemView) {
            super(itemView);

            nom = itemView.findViewById(R.id.nom);
            prenom = itemView.findViewById(R.id.prenom);
            date = itemView.findViewById(R.id.date);

            itemView.setOnClickListener(v -> {
                int position = getAdapterPosition();
                if (position!= RecyclerView.NO_POSITION && listener != null){
                    listener.onItemClick(position);
                }
            });

        }

        void setDetails(Patient pat){
            nom.setText("Le nom :" + pat.getNom());
            prenom.setText("Le prenom :" + pat.getPrenom());
            date.setText("Date :"+ pat.getDate());

        }
    }
    public interface OnItemClickListener{
        void onItemClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener = listener;
    }
}
