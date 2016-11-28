package com.github.mttkay.kats.data.list

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ListContextTest {

  val list = ListContext(1, 2, 3)

  @Test
  fun `fmap`() {
    assertThat(list.fmap { it * 2 }).isEqualTo(ListContext(2, 4, 6))
  }

  @Test
  fun `flatMap`() {
    assertThat(list.flatMap { ListContext(it * 2) }).isEqualTo(ListContext(2, 4, 6))
  }

  @Test
  fun `foldLeft`() {
    assertThat(list.foldLeft(0) { b, a -> a - b }).isEqualTo(2)
  }

  @Test
  fun `foldRight`() {
    assertThat(list.foldRight(0) { a, b -> a - b }).isEqualTo(2)
  }

}
