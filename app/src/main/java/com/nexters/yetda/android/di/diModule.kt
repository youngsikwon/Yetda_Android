package com.nexters.yetda.android.di

import com.nexters.yetda.android.birthday.BirthdayViewModel
import com.nexters.yetda.android.name.NameViewModel
import com.nexters.yetda.android.price.PriceViewModel
import com.nexters.yetda.android.question.QuestionViewModel
import com.nexters.yetda.android.result.ResultViewModel
import com.nexters.yetda.android.start.StartViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val viewModelPart = module {
    viewModel {
        StartViewModel()
    }
    viewModel {
        NameViewModel()
    }
    viewModel {
        BirthdayViewModel()
    }
    viewModel {
        PriceViewModel()
    }
    viewModel {
        QuestionViewModel()
    }
    viewModel {
        ResultViewModel()
    }
}

//var adapterPart = module {
//    factory {
//        MainSearchRecyclerViewAdapter()
//    }
//}
//
//var modelPart = module {
//    factory<DataModel> {
//        DataModelImpl(get())
//    }
//}
val diModule = listOf(viewModelPart)