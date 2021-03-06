package com.whx.jetpacktest.nav.frag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.whx.jetpacktest.BaseFragment
import com.whx.jetpacktest.R
import com.whx.jetpacktest.nav.NavManager
import kotlinx.android.synthetic.main.fragment_nav_common.*

class NFragmentA : BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_nav_common, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        center_text.text = "fragment a"
        center_text.setOnClickListener {
            NavManager.navigate(NFragmentC::class)
        }
    }
}