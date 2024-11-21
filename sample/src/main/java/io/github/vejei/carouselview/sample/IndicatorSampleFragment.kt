package io.github.vejei.carouselview.sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.github.vejei.carouselview.CarouselView

class IndicatorSampleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_indicator_sample, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val carouselView = view.findViewById<CarouselView>(R.id.carousel_view)

        val pageAdapter = PageAdapter()

        carouselView.adapter = pageAdapter

        pageAdapter.setData((activity as MainActivity).adapterData)
    }
}