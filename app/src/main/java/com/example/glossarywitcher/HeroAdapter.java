package com.example.glossarywitcher;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Hero> heroes;

    public HeroAdapter(Context context, List<Hero> heroes) {
        this.inflater = LayoutInflater.from(context);
        this.heroes = heroes;
    }

    @Override
    public HeroAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HeroAdapter.ViewHolder holder, int position) {
        Hero hero = heroes.get(position);
        holder.heroView.setImageResource(heroes.getHeroResource());
        holder.heroNameView.setText(heroes.getHeroName());
        holder.heroDescriptionView.setText(heroes.getHeroDescription());
    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView heroView;
        final TextView heroNameView, heroDescriptionView;

        ViewHolder(View view) {
            super(view);
            heroView = view.findViewById(R.id.heroResource);
            heroNameView = view.findViewById(R.id.heroName);
            heroDescriptionView = view.findViewById(R.id.heroDescription);
        }
    }
}