package com.oscarsalguero.smartystreetsautocomplete.demo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.oscarsalguero.smartystreetsautocomplete.SmartyStreetsApi;
import com.oscarsalguero.smartystreetsautocomplete.adapter.AbstractAddressAutocompleteAdapter;
import com.oscarsalguero.smartystreetsautocomplete.demo.R;
import com.oscarsalguero.smartystreetsautocomplete.history.AutocompleteHistoryManager;
import com.oscarsalguero.smartystreetsautocomplete.model.Address;

/**
 * Address autocomplete adapter
 * Created by RacZo on 2/19/17.
 */

public class AddressAutocompleteAdapter extends AbstractAddressAutocompleteAdapter {

    public AddressAutocompleteAdapter(final Context context, final SmartyStreetsApi api, final AutocompleteHistoryManager historyManager) {
        super(context, api, historyManager);
    }

    @Override
    protected View newView(final ViewGroup parent) {
        return LayoutInflater.from(parent.getContext()).inflate(R.layout.dropdown_text_item, parent, false);
    }

    @Override
    protected void bindView(final View view, final Address address) {
        ((TextView) view).setText(address.getText());
    }

}
