package br.com.denise.castro.mysubscribers.ui.subscriberlist

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import br.com.denise.castro.mysubscribers.R
import br.com.denise.castro.mysubscribers.data.db.entity.SubscriberEntity
import kotlinx.android.synthetic.main.subscriber_list_fragment.*

class SubscriberListFragment : Fragment(R.layout.subscriber_list_fragment) {

    private lateinit var viewModel : SubscriberListViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val subscriberListAdapter = SubscriberListAdapter(
                listOf(
                        SubscriberEntity(1, "Denise", "denise@email.com"),
                        SubscriberEntity(2, "Lucas", "lucas@email.com")
                )
        )
        recycler_subscribers.run {
            setHasFixedSize(true)
            adapter = subscriberListAdapter
        }
    }
}