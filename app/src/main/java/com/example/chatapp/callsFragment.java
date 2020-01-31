package com.example.chatapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class callsFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    private RecyclerView myRecylerView;
    private List<Person> listP;
    View v;

    public callsFragment() {

    }


    public static callsFragment newInstance(String param1, String param2) {
        callsFragment fragment = new callsFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listP = new ArrayList<>();
        listP.add(new Person(R.drawable.shadodw, "shadw maddy", "01013428880"));
        listP.add(new Person(R.drawable.shadodw, "shadw maddy", "01013428880"));
        listP.add(new Person(R.drawable.shadodw, "shadw maddy", "01013428880"));
        listP.add(new Person(R.drawable.shadodw, "shadw maddy", "01013428880"));
        listP.add(new Person(R.drawable.shadodw, "shadw maddy", "01013428880"));
        listP.add(new Person(R.drawable.shadodw, "shadw maddy", "01013428880"));
        listP.add(new Person(R.drawable.shadodw, "shadw maddy", "01013428880"));
        listP.add(new Person(R.drawable.shadodw, "shadw maddy", "01013428880"));
        listP.add(new Person(R.drawable.shadodw, "shadw maddy", "01013428880"));
        listP.add(new Person(R.drawable.shadodw, "shadw maddy", "01013428880"));
        listP.add(new Person(R.drawable.shadodw, "shadw maddy", "01013428880"));
        listP.add(new Person(R.drawable.shadodw, "shadw maddy", "01013428880"));
        listP.add(new Person(R.drawable.shadodw, "shadw maddy", "01013428880"));
        listP.add(new Person(R.drawable.shadodw, "shadw maddy", "01013428880"));
        listP.add(new Person(R.drawable.shadodw, "shadw maddy", "01013428880"));
        listP.add(new Person(R.drawable.shadodw, "shadw maddy", "01013428880"));


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_calls, container, false);
        myRecylerView = (RecyclerView) v.findViewById(R.id.callsview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),listP);
        myRecylerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecylerView.setAdapter(recyclerAdapter);
        return v;
    }


    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
