package owc.ecogreenenergy.com.demodemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsHolder> {
    @NonNull
    @Override
    public ItemsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.item_list, viewGroup, false);
        return new ItemsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsHolder itemsHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ItemsHolder extends RecyclerView.ViewHolder {
        public ItemsHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
