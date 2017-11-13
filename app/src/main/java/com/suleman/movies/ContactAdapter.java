package com.suleman.movies;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sulle on 14/11/17.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    ArrayList<Contact> contacts = new ArrayList<Contact>();
    public ContactAdapter(ArrayList<Contact> contacts)
    {
        this.contacts= contacts;
    }
    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout,parent,false);
    ContactViewHolder contactViewHolder = new ContactViewHolder(view);
    return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        Contact CON = contacts.get(position);
        holder.movie_image.setImageResource(CON.getImage_id());
        holder.movie_name.setText(CON.getMovieName());
        holder.movie_genre.setText(CON.getMovieGenre());

    }


    @Override
    public int getItemCount() {
        return contacts.size();
    }
    public  static class ContactViewHolder extends  RecyclerView.ViewHolder{
        ImageView movie_image;
        TextView movie_name,movie_genre;

        public ContactViewHolder(View view) {
            super(view);
            movie_image=view.findViewById(R.id.movie_image);
            movie_name=view.findViewById(R.id.movie_name);
            movie_genre=view.findViewById(R.id.movie_genre);

        }
    }
}
