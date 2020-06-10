package com.example.sampleui.SampleUI;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.sampleui.R;

import java.util.ArrayList;

public class SampleUiAdapter extends RecyclerView.Adapter<SampleUiAdapter.ViewHolder> {

    private ArrayList<SampleUiModel> sampleUiModel;
    private Context context;

    public SampleUiAdapter(Context context, ArrayList<SampleUiModel> sampleUiModel) {
        this.context = context;
        this.sampleUiModel = sampleUiModel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview_sampleui, parent, false);
        return new SampleUiAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        holder.userImage.setImageResource(sampleUiModel.get(position).getUserImage());
        holder.textView.setText(sampleUiModel.get(position).getTextView());

    }

    @Override
    public int getItemCount() {
        return sampleUiModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView userImage;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userImage = itemView.findViewById(R.id.userImage);
            textView = itemView.findViewById(R.id.tvUserName);
        }
    }
}
