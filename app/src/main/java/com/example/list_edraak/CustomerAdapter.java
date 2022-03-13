package com.example.list_edraak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.MyViewHolder> {
    List<Customer> mCustomerList;

    public CustomerAdapter(List<Customer> customerList) {
        mCustomerList=customerList;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View customerItemView= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.customer_item,parent,false);
        return new MyViewHolder(customerItemView);
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {
        Customer customer= mCustomerList.get(position);
        holder.id.setText(customer.getId());
        holder.name.setText(customer.getName());
        holder.address.setText(customer.getAddress());
    }

    @Override
    public int getItemCount() {
        return  mCustomerList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView id,name,address;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            id=itemView.findViewById(R.id.customerId);
            name= itemView.findViewById(R.id.customerName);
            address=itemView.findViewById(R.id.customerAddress);
        }
    }
}
