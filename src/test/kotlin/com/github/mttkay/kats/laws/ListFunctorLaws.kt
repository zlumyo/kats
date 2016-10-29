package com.github.mttkay.kats.laws

import com.github.mttkay.kats.data.list.ListContext
import com.github.mttkay.kats.data.list.ListFunctor
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(Parameterized::class)
class ListFunctorLaws(override val fa: ListContext<A>) : FunctorLaws<ListContext.F, ListContext<A>> {

  companion object {
    @JvmStatic @Parameters(name = "value: {0}") fun values() = listOf(
        ListContext(listOf(a)),
        ListContext(emptyList<A>())
    )
  }

  override val functor = ListFunctor
}
