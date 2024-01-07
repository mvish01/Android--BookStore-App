package com.example.bookstore_app;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;

import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.viewHolder> {

    MainActivity mainActivity;
    List<Book> objectList;

    public RecipeAdapter(MainActivity mainActivity, List<Book> objectList) {
        this.mainActivity = mainActivity;
        this.objectList = objectList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.recycler_view_layout, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Book model = objectList.get(position);

  //    holder.imageView.setImageResource(Glide.with(mainActivity).load(model.getBook_image()).into());

        Glide.with(mainActivity).load(model.getFull_book_image()).into(holder.imageView);

//        holder.imageView.setImageResource(model.getBook_image());
        holder.textName.setText(model.getBook_name());
        holder.textMessage.setText(model.getSubtitle());

    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textName, textMessage;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.editImage);
            textName = itemView.findViewById(R.id.textName);
            textMessage = itemView.findViewById(R.id.textMessage);
        }
    }
}


//    // For a simple view:
//    @Override public void onCreate(Bundle savedInstanceState) {
//  ...
//        ImageView imageView = (ImageView) findViewById(R.id.my_image_view);
//
//        Glide.with(this).load("https://goo.gl/gEgYUd").into(imageView);
//    }
//
//    // For a simple image list:
//    @Override public View getView(int position, View recycled, ViewGroup container) {
//        final ImageView myImageView;
//        if (recycled == null) {
//            myImageView = (ImageView) inflater.inflate(R.layout.my_image_view, container, false);
//        } else {
//            myImageView = (ImageView) recycled;
//        }
//
//        String url = myUrls.get(position);
//
//        Glide
//                .with(myFragment)
//                .load(url)
//                .centerCrop()
//                .placeholder(R.drawable.loading_spinner)
//                .into(myImageView);
//
//        return myImageView;
//    }



//     String url = myUrls.get(position);
//
//        Glide
//                .with(myFragment)
//                .load(url)
//                .centerCrop()
//                .placeholder(R.drawable.loading_spinner)
//                .into(myImageView);


//        ImageView imageView = (ImageView) findViewById(R.id.my_image_view);
//
//        Glide.with(this).load("https://goo.gl/gEgYUd").into(imageView);