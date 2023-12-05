package com.example.news;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class entertainment extends Fragment {
    List<headlines> list = new ArrayList<headlines>();
    adapter ad;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_entertainment, container, false);
        RecyclerView rec1 = (RecyclerView) view.findViewById(R.id.entern);
        rec1.setLayoutManager(new LinearLayoutManager(getContext()));
        rec1.setHasFixedSize(true);
        error();
        ad = new adapter(getContext(),list);
        rec1.setAdapter(ad);
        return view;
    }
    public void error()
    {
        Retrofit ret = new Retrofit.Builder().baseUrl("https://newsapi.org/v2/").addConverterFactory(GsonConverterFactory.create()).build();
        inter intef = ret.create(inter.class);
        Call<newstitles> heads;
        heads = intef.getInforme("in", "baec0b3ef4ed40b9b06b80a8d2803970","entertainment");
        heads.enqueue(new Callback<newstitles>() {
            @Override
            public void onResponse(Call<newstitles> call, Response<newstitles> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(getContext(), "success", Toast.LENGTH_SHORT).show();
                    list.addAll(response.body().getArticles());
                    ad.notifyDataSetChanged();
                }
            }
            @Override
            public void onFailure(Call<newstitles> call, Throwable t) {
                Toast.makeText(getContext(), "failure", Toast.LENGTH_SHORT).show();
            }

        });

    }
}