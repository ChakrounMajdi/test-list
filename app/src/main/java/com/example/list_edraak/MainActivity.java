package com.example.list_edraak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerViewCustomer;
    CustomerAdapter mCustomerAdapter;
    List<Customer> mCustomerList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        setSupportActionBar(findViewById(R.id.toolbar));
        mRecyclerViewCustomer=findViewById(R.id.recycle_view_customer);

        mCustomerAdapter=new CustomerAdapter(mCustomerList);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(getApplicationContext());
        mRecyclerViewCustomer.setLayoutManager(layoutManager);
        mRecyclerViewCustomer.setAdapter(mCustomerAdapter);
        mRecyclerViewCustomer.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        prepareData();
        mRecyclerViewCustomer.addOnItemTouchListener(new RecyclerTouchListener(
                getApplicationContext(), mRecyclerViewCustomer, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Customer customer= mCustomerList.get(position);
                Toast.makeText(getApplicationContext(), customer.getName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }
        ));



    }

    private void prepareData() {
        Customer customer1= new Customer("0001",32,"majdi","route sidi mansour");
        mCustomerList.add(customer1);

        Customer customer2= new Customer("0002",25,"salah ","route sidi mansour");
        mCustomerList.add(customer2);
        customer2= new Customer("000552",25,"srdgfzed ","route sidi mansour");
        mCustomerList.add(customer2);
              customer2= new Customer("0002",25,"salah ","route sidi mansour");
        mCustomerList.add(customer2);
        customer2= new Customer("0002",25,"salah ","route sidi mansour");
        mCustomerList.add(customer2);
        customer2= new Customer("0002",25,"33333 ","route sidi mansour");
        mCustomerList.add(customer2);
        customer2= new Customer("0002",25,"salah ","route sidi mansour");
        mCustomerList.add(customer2);
        customer2= new Customer("0002",25,"44444 ","route sidi mansour");
        mCustomerList.add(customer2);
        customer2= new Customer("0002",25,"salah ","route sidi mansour");
        mCustomerList.add(customer2);
        customer2= new Customer("0002",25,"salah ","route sidi mansour");
        mCustomerList.add(customer2);
        customer2= new Customer("0002",25,"salah ","route sidi mansour");
        mCustomerList.add(customer2);
        customer2= new Customer("0002",25,"55555 ","route sidi mansour");
        mCustomerList.add(customer2);
        customer2= new Customer("0002",25,"salah ","route sidi mansour");
        mCustomerList.add(customer2);
        customer2= new Customer("0002",25,"salah ","route sidi mansour");
        mCustomerList.add(customer2);
        customer2= new Customer("0002",25,"salah ","route sidi mansour");
        mCustomerList.add(customer2);
        customer2= new Customer("0002",25,"7777 ","route sidi mansour");
        mCustomerList.add(customer2);
        customer2= new Customer("0002",25,"rsdfze ","route sidi mansour");
        mCustomerList.add(customer2);
        customer2= new Customer("0002",25,"888 ","route sidi mansour");
        mCustomerList.add(customer2);
        customer2= new Customer("0002",25,"99999 ","route sidi mansour");
        mCustomerList.add(customer2);

        mCustomerAdapter.notifyDataSetChanged();
    }
}