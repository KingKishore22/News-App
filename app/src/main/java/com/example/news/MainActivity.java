package com.example.news;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class MainActivity extends AppCompatActivity {
    RecyclerView rec;
    List<headlines> list = new ArrayList<headlines>();
    Toolbar tool;
    adapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout=(TabLayout) findViewById(R.id.tab);
        ViewPager pager=(ViewPager)findViewById(R.id.view);
        tabLayout.addTab(tabLayout.newTab().setText("GENERAL"));
        tabLayout.addTab(tabLayout.newTab().setText("SPORTS"));
        tabLayout.addTab(tabLayout.newTab().setText("SCIENCE"));
        tabLayout.addTab(tabLayout.newTab().setText("CINEMA"));
        tool=(Toolbar)findViewById(R.id.tool);
     //   tool.setTitle("TODAY NEWS");
        setSupportActionBar(tool);
tabadapter tab=new tabadapter(getSupportFragmentManager(),getApplicationContext(),tabLayout.getTabCount());
pager.setAdapter(tab);
pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
       /* rec = (RecyclerView) findViewById(R.id.rec);
        rec.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rec.setHasFixedSize(true);
        error();
        ad = new adapter(getApplicationContext(),list);
        rec.setAdapter(ad);
    }
        public void error() {
            Retrofit ret = new Retrofit.Builder().baseUrl("https://newsapi.org/v2/").addConverterFactory(GsonConverterFactory.create()).build();
            inter intef = ret.create(inter.class);
            Call<newstitles> heads;
            heads = intef.getInform("in", "baec0b3ef4ed40b9b06b80a8d2803970","sports");
            heads.enqueue(new Callback<newstitles>() {
                @Override
                public void onResponse(Call<newstitles> call, Response<newstitles> response) {
                    if (response.isSuccessful()) {
                        Toast.makeText(getApplicationContext(), "success", Toast.LENGTH_SHORT).show();
                        list.addAll(response.body().getArticles());
                        ad.notifyDataSetChanged();
                    }
                }
                @Override
                public void onFailure(Call<newstitles> call, Throwable t) {
                    Toast.makeText(getApplicationContext(), "failure", Toast.LENGTH_SHORT).show();
                }

            });

        }*/
        }}