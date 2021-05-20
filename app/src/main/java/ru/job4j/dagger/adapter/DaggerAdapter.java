package ru.job4j.dagger.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.job4j.dagger.R;

public class DaggerAdapter extends RecyclerView.Adapter<DaggerAdapter.DaggerHolder> {
    private final List<String> list;
    public DaggerAdapter(List<String> list) {
        this.list = list;
    }
    @NonNull
    @Override
    public DaggerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new DaggerHolder(inflater.inflate(R.layout.item, parent, false));
    }
    @Override
    public void onBindViewHolder(@NonNull DaggerHolder holder, int position) {
        String string = list.get(position);
        TextView textView = holder.itemView.findViewById(R.id.item_textView);
        textView.setText(string);
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    @Override
    public int getItemViewType(int position) {
        return position;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    public static class DaggerHolder extends RecyclerView.ViewHolder {
        public DaggerHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
