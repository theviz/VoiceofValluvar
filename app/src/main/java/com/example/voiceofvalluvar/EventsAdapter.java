package com.example.voiceofvalluvar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.ViewHolder> {
    private final Context context;
    private final ArrayList<EventObjectModel> eventObjectsList;

    public EventsAdapter(Context context, ArrayList<EventObjectModel> eventObjectsList) {
        this.context = context;
        this.eventObjectsList = eventObjectsList;
    }

    @NonNull
    @Override
    public EventsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_event_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventsAdapter.ViewHolder holder, int position) {
        EventObjectModel event = eventObjectsList.get(position);
        holder.eventName.setText(event.getEventName());
        holder.eventVenue.setText(event.getVenueName());
        holder.eventTime.setText(event.getEventTimeFormat());
        holder.eventDate.setText(event.getEventDateString());
    }

    @Override
    public int getItemCount() {
        return eventObjectsList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView eventDate;
        private final TextView eventName;
        private final TextView eventVenue;
        private final TextView eventTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.eventDate = itemView.findViewById(R.id.eventDateTitle);
            this.eventName = itemView.findViewById(R.id.eventNameTitle);
            this.eventVenue = itemView.findViewById(R.id.eventVenueName);
            this.eventTime = itemView.findViewById(R.id.eventTimeString);
        }
    }
}
