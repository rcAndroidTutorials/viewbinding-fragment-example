package com.youtube.fragmentviewbinding

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

open class BaseFragment<T: ViewBinding>(@LayoutRes contentLayoutId: Int) : Fragment(contentLayoutId) {
    //declaración del binding
    protected var _binding: T? = null
    protected val binding get() = _binding!!

    /*De la inicialización se encarga el sistema al usar la nueva constructora del Fragment.*/

    //Liberación del binding
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}