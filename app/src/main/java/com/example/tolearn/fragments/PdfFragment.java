package com.example.tolearn.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import com.example.tolearn.DocumentsAdapter;
import com.example.tolearn.R;
import com.example.tolearn.pojos.Document;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PdfFragment extends Fragment {

    private ArrayList<Document>listaDocumentos;
    private RecyclerView recyclerDocuments;
    private Spinner spinnerArea;

    public PdfFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.fragment_profile, container, false);

        spinnerArea = root.findViewById(R.id.spinnerArea);
        listaDocumentos = new ArrayList<>();
        recyclerDocuments = root.findViewById(R.id.recyclerViewDocuments);
//        recyclerDocuments.setLayoutManager(new LinearLayoutManager(getContext()));

        DocumentsAdapter adapter = new DocumentsAdapter(listaDocumentos);
 //       recyclerDocuments.setAdapter(adapter);

        llenarSpinnerArea();
        
       /* if(spinnerArea.getSelectedItem().equals(0)){
            llenarDocuments();
        }else{
            llenarDocumentsPorArea();
        }*/
        

        return inflater.inflate(R.layout.fragment_pdf, container, false);
    }

    private void llenarSpinnerArea() {

    }

    private void llenarDocumentsPorArea() {
    }

    private void llenarDocuments() {
        for(int i=0;i<listaDocumentos.size();i++){

        }
    }

}
