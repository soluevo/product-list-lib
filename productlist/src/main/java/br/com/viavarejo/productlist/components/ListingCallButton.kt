package br.com.viavarejo.productlist.components

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.DataBindingUtil
import br.com.viavarejo.productlist.R
import br.com.viavarejo.productlist.databinding.ListingCallButtonBinding
import br.com.viavarejo.productlist.listing.HelloWorldActivity

class ListingCallButton @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyle: Int = 0
) : LinearLayout(context, attrs, defStyle) {

    private var mListingCallButtonComponentViewBinding: ListingCallButtonBinding? =
        DataBindingUtil.inflate(
            LayoutInflater.from(context), R.layout.listing_call_button, this, true
        )

    init {
        setText(context.getString(R.string.init_listing_library_button_text))
    }

    private fun setText(text: String) {
        mListingCallButtonComponentViewBinding?.listingCallButtonLabelTextView?.text = text
        mListingCallButtonComponentViewBinding?.executePendingBindings()
    }

    private fun setClickEvent(){
        mListingCallButtonComponentViewBinding?.listingCallButtonContainer?.setOnClickListener {
            val intent = Intent(context, HelloWorldActivity::class.java)

            startActivity(context, intent, Bundle())
        }
    }

}