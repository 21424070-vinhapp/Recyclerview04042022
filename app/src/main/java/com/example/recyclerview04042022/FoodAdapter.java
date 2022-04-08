package com.example.recyclerview04042022;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    List<FoodModel> listFood;

    public FoodAdapter(List<FoodModel> listFood)
    {
        this.listFood=listFood;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //LayoutInflater thay doi giao dien, chuyen cau truc giao dien
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.item_food,parent,false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
       if(listFood.isEmpty() || listFood.size()==0)
       {
           return 0;
       }
        return listFood.size();
    }

    class FoodViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView txtOpen,txtName,txtAddress,txtService,txtDiscount,txtDistance;
        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            img=itemView.findViewById(R.id.imageViewFood);
            txtName=itemView.findViewById(R.id.textViewName);
            txtAddress=itemView.findViewById(R.id.textViewAddress);
            txtService=itemView.findViewById(R.id.textViewService);
            txtDiscount=itemView.findViewById(R.id.textViewDiscount);
            txtDistance=itemView.findViewById(R.id.textViewDistance);

        }

        public void bind(FoodModel foodModel)
        {
            img.setImageResource(foodModel.getImage());
            txtName.setText(foodModel.getName());
            txtAddress.setText(foodModel.getAddress());
            String service="";
            for (ServiceEnum item:foodModel.getArrServiceEnum()) {
                service+=item.toString()+"/";
            }
            txtService.setText(service.substring(0,service.length()-1));
            String textDiscount="";
            switch (foodModel.getDiscount().getDiscountSessionEnum())
            {
                case ALL_TIME:
                    textDiscount = "<font color=#A9DAF1>"+foodModel.getDiscount().getDiscountSessionEnum().toString() +"</font> <font color=#F9C29A>"+foodModel.getDiscount().getNameDiscount()+"</font>";
                case NIGHT:
                    textDiscount = "<font color=#A9DAF1>"+foodModel.getDiscount().getDiscountSessionEnum().toString() +"</font> <font color=#F9C29A>"+foodModel.getDiscount().getNameDiscount()+"</font>";
                case MORNING:
                    textDiscount = "<font color=#A9DAF1>"+foodModel.getDiscount().getDiscountSessionEnum().toString() +"</font> <font color=#F9C29A>"+foodModel.getDiscount().getNameDiscount()+"</font>";
                case NOON:
                    textDiscount = "<font color=#A9DAF1>"+foodModel.getDiscount().getDiscountSessionEnum().toString() +"</font> <font color=#F9C29A>"+foodModel.getDiscount().getNameDiscount()+"</font>";
            }
            txtDiscount.setText(Html.fromHtml(textDiscount));
            txtDistance.setText(foodModel.getDistance()+ " km");
            img.setImageResource(foodModel.getImage());

        }
    }
}
