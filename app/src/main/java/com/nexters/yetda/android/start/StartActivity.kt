package com.nexters.yetda.android.start

import android.content.Intent
import androidx.lifecycle.Observer
import com.nexters.yetda.android.BR
import com.nexters.yetda.android.R
import com.nexters.yetda.android.base.BaseKotlinActivity
import com.nexters.yetda.android.databinding.ActivityStartBinding
import com.nexters.yetda.android.name.NameActivity
import org.koin.android.viewmodel.ext.android.viewModel


class StartActivity : BaseKotlinActivity<ActivityStartBinding, StartViewModel>() {
    override val layoutResourceId = R.layout.activity_start
    override val viewModel: StartViewModel by viewModel()

    private val TAG = javaClass.simpleName


    override fun initViewStart() {
//        var vm = ViewModelProviders.of(this)[NameViewModel::class.java]
//        binding.vm = vm

    }

    override fun initDataBinding() {
        binding.setVariable(BR.vm, viewModel)

        viewModel.startNextActivityEvent.observe(this, Observer {
            startActivity(Intent(applicationContext, NameActivity::class.java))
        })
    }
    override fun initViewFinal() {
    }

}