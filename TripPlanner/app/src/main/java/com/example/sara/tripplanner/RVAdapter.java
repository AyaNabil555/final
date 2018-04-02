package com.example.sara.tripplanner;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.swipe.util.Attributes;

import java.util.List;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by sara on 01/04/18.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder>{

    public Context mycont;
    List<Trip> Trips;

    public RVAdapter(Context mycont, List<Trip> trips) {
        this.mycont = mycont;
        Trips = trips;
    }

    RVAdapter(List<Trip> Trips){    this.Trips = Trips;}

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


    public void updateTrips(List<Trip> Trips){
        this.Trips = Trips;
        notifyDataSetChanged();

    }
    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }



    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        Trip trip = Trips.get(i);
        personViewHolder.personName.setText(trip.getName());
        personViewHolder.personAge.setText(trip.getDate());
        personViewHolder.personPhoto.setImageResource(R.mipmap.ic_launcher);
        personViewHolder.start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("google.navigation:d=Taronga+Zoo,+Sydney+Australia");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                view.getContext().startActivity(mapIntent);
            }
        });
    }



    @Override
    public int getItemCount() {

        return Trips != null? Trips.size():0;
    }


    public static class PersonViewHolder extends RecyclerView.ViewHolder {


        ImageView personPhoto;
        Button start;
        CardView cv;
        TextView personName;
        TextView personAge;
        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            personName = (TextView) itemView.findViewById(R.id.person_name);
            personAge = (TextView) itemView.findViewById(R.id.person_age);
            personPhoto = (ImageView) itemView.findViewById(R.id.person_photo);
            start =itemView.findViewById(R.id.startNavbtn);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), "Islam Mesha", Toast.LENGTH_SHORT).show();
                    view.getContext().startActivity(new Intent(view.getContext(),details_activity.class));
                }
            });
        }



    }


}