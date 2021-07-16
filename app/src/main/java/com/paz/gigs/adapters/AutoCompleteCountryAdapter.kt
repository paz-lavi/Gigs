package com.paz.gigs.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import com.google.android.libraries.places.api.model.AutocompletePrediction

class AutoCompleteCountryAdapter(context: Context,
                                 @LayoutRes private val layoutResource: Int,
                                 @IdRes private val textViewResourceId: Int = 0,
                                 private val values: List<AutocompletePrediction>) : ArrayAdapter<AutocompletePrediction>(context, layoutResource, values)  {
private companion object{
    const val TAG = "Paz_AutoCompleteCountryAdapter"
}
init {
    Log.d(TAG, "init: ")
}
    override fun getItem(position: Int): AutocompletePrediction = values[position]

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        Log.d(TAG, "getView: ")
        val view = createViewFromResource(convertView, parent, layoutResource)

        return bindData(getItem(position), view)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        Log.d(TAG, "getDropDownView: ")
        val view = createViewFromResource(convertView, parent, android.R.layout.simple_spinner_dropdown_item)
        return bindData(getItem(position), view)
    }

    private fun createViewFromResource(convertView: View?, parent: ViewGroup, layoutResource: Int): TextView {
        Log.d(TAG, "createViewFromResource: ")
        val context = parent.context
        val view = convertView ?: LayoutInflater.from(context).inflate(layoutResource, parent, false)
        return try {
            if (textViewResourceId == 0) view as TextView
            else {
                view.findViewById(textViewResourceId) ?:
                throw RuntimeException("Failed to find view with ID " +
                        "${context.resources.getResourceName(textViewResourceId)} in item layout")
            }
        } catch (ex: ClassCastException){
            Log.e(TAG, "You must supply a resource ID for a TextView")
            throw IllegalStateException(
                "ArrayAdapter requires the resource ID to be a TextView", ex)
        }
    }

    private fun bindData(value: AutocompletePrediction, view: TextView): TextView {
        Log.d(TAG, "bindData: ")
        view.text = value.getPrimaryText(null)
        return view
    }
}