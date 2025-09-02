package com.example.listview2025;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.listview2025.databinding.ActivityMainBinding;
import com.example.listview2025.model.Inmueble;
import com.example.listview2025.viewmodel.MainActivityViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainActivityViewModel vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        vm.getListaInmuebles().observe(this,new Observer<List<Inmueble>>() {
            @Override
            public void onChanged(List<Inmueble> inmuebles) {
                InmuebleAdapter adapter=new InmuebleAdapter(MainActivity.this,R.layout.item,inmuebles,getLayoutInflater());
                binding.lista.setAdapter(adapter);
            }
        });
        // vm.loadInmuebles(); // Eliminado porque se llama en el constructor del ViewModel

    }

}
