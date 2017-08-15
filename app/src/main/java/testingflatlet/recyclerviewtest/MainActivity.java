package testingflatlet.recyclerviewtest;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CardView cardView ;
    ArrayList<String> list = new ArrayList<>();
    Context context;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardView=(CardView)findViewById(R.id.cardView);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(context,list);

        list.add(0,"1");
        list.add(1,"2");
        list.add(2,"3");
        list.add(3,"4");
        list.add(4,"5");
        list.add(5,"6");
        list.add(6,"7");
        list.add(7,"8");
        recyclerView.setHasFixedSize(true);
       RecyclerView.LayoutManager recyclerViewlayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerViewlayoutManager);
        recyclerView.setAdapter(adapter);
    }
}
