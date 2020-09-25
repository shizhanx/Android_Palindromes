/* Copyright 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.engedu.palindromes

import android.text.TextUtils
import java.util.*

class PalindromeGroup(text: CharArray?, start: Int, end: Int) {
    protected var strings = ArrayList<String?>()
    fun append(other: PalindromeGroup?) {
        if (other != null) {
            strings.addAll(other.strings)
        }
    }

    fun length(): Int {
        return strings.size
    }

    override fun toString(): String {
        return TextUtils.join(" ", strings)
    }

    init {
        strings.add(String(text!!, start, end - start))
    }
}