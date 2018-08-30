package com.example.mac.douaneproject.adabter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View  ;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mac.douaneproject.R;

import java.util.ArrayList;
import java.util.List;

public class InfoDeclAdabter extends RecyclerView.Adapter<InfoDeclAdabter.ViewHolder> {


    private Context  context  ;
    private List<DeclarationChamp> list ;

    public InfoDeclAdabter(Context context, List<DeclarationChamp> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.info_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.itemView.setTag(list.get(position));

        DeclarationChamp pu = list.get(position);

        holder.titre.setText(pu.getTitre());
        holder.valeur.setText(pu.getValeur());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView titre;
        public TextView valeur;

        public ViewHolder(View itemView) {
            super(itemView);

            titre = (TextView) itemView.findViewById(R.id.titre);
            valeur = (TextView) itemView.findViewById(R.id.description);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //PersonUtils cpu = (PersonUtils) view.getTag();

                    //Toast.makeText(view.getContext(), cpu.getPersonName()+" is "+ cpu.getJobProfile(), Toast.LENGTH_SHORT).show();

                }
            });

        }
    }

}





