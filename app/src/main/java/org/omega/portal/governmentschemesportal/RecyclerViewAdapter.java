package org.omega.portal.governmentschemesportal;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.NumberViewHolder>{
    private static final String TAG = "RecyclerViewAdapter";

    private Context context;
    ArrayList<SchemeData> arrayList = new ArrayList<>();

    public RecyclerViewAdapter(Context context, ArrayList<SchemeData> schemeDataArrayList) {
        this.context = context;
        this.arrayList = schemeDataArrayList;
    }


    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_scheme,parent,false);
        return new NumberViewHolder(context,view);
    }



    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder numberViewHolder, int i) {
        SchemeData schemeData = this.arrayList.get(i);

        Log.d(TAG, "onBindViewHolder: title is " + schemeData.title);
        numberViewHolder.bindData(schemeData);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class NumberViewHolder extends RecyclerView.ViewHolder{
        TextView schemeTitle;
        ImageView icon;
        SchemeData schemeData;
        Context holderContext;
        public View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holderContext,"Click",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(holderContext,SchemeDisplayActivity.class);
                intent.putExtra("OBJECT",schemeData);
                holderContext.startActivity(intent);
            }
        };
        public NumberViewHolder(Context holderContext,@NonNull View itemView) {
            super(itemView);
            schemeTitle = (TextView)itemView.findViewById(R.id.scheme_title);
            icon = (ImageView) itemView.findViewById(R.id.icon_sc);
            this.holderContext = holderContext;
            itemView.setOnClickListener(listener);
        }

        public void bindData(SchemeData scheme){
            this.schemeData = scheme;
            this.schemeTitle.setText(scheme.title);
            this.icon.setImageResource(scheme.img);
        }


    }


}
