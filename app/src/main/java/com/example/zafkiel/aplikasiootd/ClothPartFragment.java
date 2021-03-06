package com.example.zafkiel.aplikasiootd;

import android.support.v4.app.Fragment;
import android.os.Bundle;

import java.util.List;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class ClothPartFragment extends Fragment {
    private float x, y;
    private List<Integer> mImageIds;
    private Integer mListIndex, mListIndex0;
    private static String TAG = "ClothPartFragment";
    public static final String IMAGE_ID_LIST = "image_ids";
    public static final String LIST_INDEX = "list_index";
    public ClothPartFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //mengisi id saat instance state tersimpan kosong
        if (savedInstanceState != null) {
            mImageIds = savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            mListIndex =  savedInstanceState.getInt(LIST_INDEX);
        }

        //inflate fragment layout
        View rootView = inflater.inflate(R.layout.cloth_part_fragment, container, false);

        //mengambil id image view pada layout
        final ImageView iv = (ImageView) rootView.findViewById(R.id.cloth_part_view);

        //menampilkan gambar res ke imageview
        iv.setImageResource(mImageIds.get(mListIndex));

        //mengganti gambar saat klik
        iv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //kondisi mengubah id image dengan menambah index saat di klik dan mengembalikan ke 0 saat mencapai index akhir list
                /*if (mListIndex < mImageIds.size()-1) {
                    mListIndex++;
                }
                else {
                    mListIndex = 0;
                }
                iv.setImageResource(mImageIds.get(mListIndex));*/
            }
        });

        iv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getActionMasked()){
                    case MotionEvent.ACTION_DOWN:
                        x=event.getX();
                        mListIndex0 = mListIndex;
                    case MotionEvent.ACTION_MOVE:
                        if (x > event.getX()+0.9) {
                            //kondisi mengubah id image dengan menambah index saat swipe kiri
                            if (mListIndex < mImageIds.size()-1) {
                                if (mListIndex0 == mListIndex)
                                    mListIndex++;
                            }
                            else {
                                mListIndex = 0;
                            }
                            iv.setImageResource(mImageIds.get(mListIndex));
                            return true;
                        }
                        else if (x < event.getX()-0.9) {
                            //kondisi mengubah id image dengan mengurangi index saat swipe kanaki
                            if (mListIndex > 0) {
                                if (mListIndex0 == mListIndex)
                                    mListIndex--;
                            }
                            else {
                                mListIndex = mImageIds.size()-1;
                            }
                            iv.setImageResource(mImageIds.get(mListIndex));
                            return true;
                        }
                    default:
                        return false;
                }
            }

        });

        return rootView;
    }

    //menyimpan variabel array & index
    @Override
    public void onSaveInstanceState(@NonNull Bundle currentState) {
        currentState.putIntegerArrayList(IMAGE_ID_LIST, (ArrayList<Integer>) mImageIds);
        currentState.putInt(LIST_INDEX, mListIndex);
    }

    //setter indeks
    public void setmImageIds(List<Integer> mImageIds) {
        this.mImageIds = mImageIds;
    }

    public void setmListIndex(Integer mListIndex) {
        this.mListIndex = mListIndex;
    }
}
