package com.example.listview2025.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.listview2025.model.Inmueble;
import com.example.listview2025.repository.InmuebleRepository;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private InmuebleRepository repository;
    private MutableLiveData<List<Inmueble>> listaInmueblesMutable; // Declaración

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        repository = InmuebleRepository.getInstance();
        listaInmueblesMutable = new MutableLiveData<>(); // Inicialización aquí
        loadInmuebles();
    }

    public LiveData<List<Inmueble>> getListaInmuebles() {
        // Ya no es necesario inicializarlo aquí si se hace en el constructor
        return listaInmueblesMutable;
    }

    public void loadInmuebles() {
        List<Inmueble> inmuebles = repository.getInmuebles();
        listaInmueblesMutable.setValue(inmuebles);
    }
}
