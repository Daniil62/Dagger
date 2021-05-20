package ru.job4j.dagger.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ru.job4j.dagger.R;
import ru.job4j.dagger.adapter.DaggerAdapter;
import ru.job4j.dagger.application.App;
import ru.job4j.dagger.store.Store;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private RecyclerView recycler;
    @Inject
    Store store;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.getStore().injectTo(this);
        setContentView(R.layout.activity_main);
        findElements();
        recycler.setLayoutManager(new LinearLayoutManager(this));
        update();
    }
    private void findElements() {
        editText = findViewById(R.id.editText);
        recycler = findViewById(R.id.recycler);
    }
    private void update() {
        recycler.setAdapter(new DaggerAdapter(store.getAll()));
    }
    public void add(View view) {
        store.add(editText.getText().toString());
        editText.setText("");
        update();
    }
}