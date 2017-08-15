package testingflatlet.recyclerviewtest;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context context;
    private ArrayList<String> list;



    public RecyclerViewAdapter(Context context, ArrayList<String> list) {
        super();
        this.context= context;
        this.list=list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_items,parent,false);
            return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(list.get(position));
    }



    @Override
    public int getItemCount() {
        return list.size();
    }

     class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        CardView cardVIew;

        ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView)itemView.findViewById(R.id.textView);
            cardVIew=(CardView)itemView.findViewById(R.id.cardView);

        }
    }
}
