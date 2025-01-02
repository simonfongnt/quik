package com.moez.QKSMS.compat

import com.google.common.truth.Truth.assertThat
import dev.octoshrimpy.quik.compat.TelephonyCompat
import org.junit.Test


class TelephonyCompatTest {
    @Test
    fun isEmailAddress_empty_address_return_false () {
        val res = TelephonyCompat.isEmailAddress(
            ""
        )
        assertThat(res).isFalse()
    }

    @Test
    fun isEmailAddress_address_return_true () {
        val res = TelephonyCompat.isEmailAddress(
            "tester@domain.com"
        )
        assertThat(res).isTrue()
    }
    @Test
    fun isEmailAddress_addresses_return_false () {
        val res = TelephonyCompat.isEmailAddress(
            "tester@domain.com tester@domain.com"
        )
        assertThat(res).isFalse()
    }
    @Test
    fun extractAddrSpec_empty_address_return_empty () {
        val res = TelephonyCompat.extractAddrSpec(
            ""
        )
        assertThat(res).isEmpty()
    }
    @Test
    fun extractAddrSpec_valid_address_return_address () {
        val res = TelephonyCompat.extractAddrSpec(
            "tester@domain.com"
        )
        assertThat(res).isNotEmpty()
    }
    @Test
    fun extractAddrSpec_invalid_address_return_empty () {
        val res = TelephonyCompat.extractAddrSpec(
            "testerdomain.com"
        )
        assertThat(res).isEmpty()
    }
}