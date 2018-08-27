package com.wakatech.invatarejuridica;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomSheetDictionar extends BottomSheetDialogFragment {

    private View modalView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bottom_sheet_dictionary,container,false);
        TextView description = v.findViewById(R.id.textdescriere);
        TextView cuvant = v.findViewById(R.id.cuvant);

        String word = getArguments().getString("word");
        cuvant.setText(word);
        description.setText(WordDictionary.descrieri.get(word));
        return v;
    }




}
