package com.example.recyclerview04042022;

import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<FoodModel> listFood;
    private OnItemClickListener onItemClickListener;

    private int ITEM_TYPE=1;
    private int ITEM_LOADING=0;
    private boolean isLoading=false;

    public FoodAdapter(List<FoodModel> listFood)
    {
        this.listFood=listFood;
    }

    //ham tra ve TYPE nao
    @Override
    public int getItemViewType(int position) {
        if(isLoading==true)
        {
            if(position==(listFood.size()-1)){
                return ITEM_LOADING;
            }
        }
        return ITEM_TYPE;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //LayoutInflater thay doi giao dien, chuyen cau truc giao dien
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view;
        if(viewType==ITEM_TYPE)
        {
            view=layoutInflater.inflate(R.layout.item_food,parent,false);
            return new FoodViewHolder(view);
        }
        else
        {
            view=layoutInflater.inflate(R.layout.item_loading,parent,false);
            return new LoadingViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        /*FoodModel foodModel=listFood.get(position);
        holder.bind(foodModel);*/
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
            txtOpen=itemView.findViewById(R.id.textViewOpen);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(onItemClickListener!=null)
                    {
                        onItemClickListener.onCLick(getAdapterPosition());
                    }
                }
            });

        }

        public void bind(FoodModel foodModel)
        {
            img.setImageResource(foodModel.getImage());
            txtName.setText(foodModel.getName());
            txtAddress.setText(foodModel.getAddress());
            String service="";
            for (ServiceEnum item:foodModel.getArrServiceEnum()) {
                service += item.toString()+"/";
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
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + foodModel.getDiscount().getDiscountSessionEnum());
            }
            txtDiscount.setText(Html.fromHtml(textDiscount));
            txtDistance.setText(foodModel.getDistance()+ " km");
            txtOpen.setText("");
        }


    }

    class LoadingViewHolder extends RecyclerView.ViewHolder{

        public LoadingViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public void setOnItemClickListener (OnItemClickListener onItemClickListener)
    {
        this.onItemClickListener=onItemClickListener;
    }

    public void addLoading(){
        isLoading=true;
        listFood.add(null);
    }

    public void removeLoading(){
        isLoading=false;
        int position=listFood.size()-1;
        listFood.remove(position);
        notifyItemRemoved(position);
    }
}
