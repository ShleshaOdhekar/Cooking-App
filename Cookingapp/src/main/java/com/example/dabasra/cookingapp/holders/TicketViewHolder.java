package com.example.dabasra.cookingapp.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dabasra.cookingapp.ImageViewFromUrl;
import com.example.dabasra.cookingapp.R;
import com.example.dabasra.cookingapp.model.Ticket;

/**
 * Created by dabasra .
 */
public class TicketViewHolder extends RecyclerView.ViewHolder {

    private ImageView ticketView;
    private TextView dayTextView;
    private TextView nameTextView;

    public TicketViewHolder(View itemView) {
        super(itemView);
        this.ticketView = (ImageView) itemView.findViewById(R.id.cardTicketImage);
        this.dayTextView = (TextView) itemView.findViewById(R.id.cardTextViewDay);
        this.nameTextView = (TextView)itemView.findViewById(R.id.cardTicketName);
        ticketView.setImageResource(R.drawable.descarga);    }









}
