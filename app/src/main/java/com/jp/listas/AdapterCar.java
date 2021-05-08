package com.jp.listas;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;
import com.jp.listas.models.Car;
import com.squareup.picasso.Picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class AdapterCar extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Car> cars;
    RequestQueue request;




    public AdapterCar(Activity activity, ArrayList<Car> cars) {
        this.activity = activity;
        this.cars = cars;
    }
    public void addCar(ArrayList<Car> carElement){

        cars.addAll(carElement);
    }

    @Override
    public int getCount() {
        return cars.size();
    }

    @Override
    public Object getItem(int position) {
        return cars.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v=convertView;
        if (convertView==null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v=inf.inflate(R.layout.car_item,null);
        }
        Car carElement=cars.get(position);
        TextView nameCar=v.findViewById(R.id.carName);
        nameCar.setText("Vehiculo: "+carElement.getName());

        TextView ccCar=v.findViewById(R.id.carCC);
        ccCar.setText("CC:"+carElement.getCilindraje());

        TextView modelCar=v.findViewById(R.id.carModel);
        modelCar.setText("Modelo:"+carElement.getModel());

        TextView valueCar=v.findViewById(R.id.carValue);
        valueCar.setText("$ "+carElement.getValue());

        EditText url1=v.findViewById(R.id.txtUrlCar);
        String valorUrl=carElement.getImage();
        ImageView imgCar=v.findViewById(R.id.imagen);
        Picasso.get().load(valorUrl).into(imgCar);


        return v;
    }
    /*
    EditText urlImg=findViewById(R.id.txtUrlCar);
    request= Volley.newRequestQueue(getApplicationContext());
    public  void cargarImg(){
        String url=img.getText().toString();
        ImageRequest imageRequest=new ImageRequest(url,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap response) {

                    }
                }, 0, 0, ImageView.ScaleType.CENTER , new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplication(),"Error al cargar la imagen",Toast.LENGTH_SHORT).show();
            }
        });
        request.add(imageRequest);
    }
*/

}
