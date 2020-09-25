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

import android.os.Bundle
import android.util.Range
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    private val findings = HashMap<Range<*>, PalindromeGroup>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onFindPalindromes(view: View?): Boolean {
        findings.clear()
        val editText = findViewById<View>(R.id.editText) as EditText
        val textView = findViewById<View>(R.id.textView) as TextView
        var text = editText.text.toString()
        text = text.replace(" ".toRegex(), "")
        text = text.replace("'".toRegex(), "")
        val textAsChars = text.toCharArray()
        if (isPalindrome(textAsChars, 0, text.length)) {
            textView.text = "$text is already a palindrome!"
        } else {
            val palindromes = breakIntoPalindromes(text.toCharArray(), 0, text.length)
            textView.text = palindromes.toString()
        }
        return true
    }

    private fun isPalindrome(text: CharArray, start: Int, end: Int): Boolean {
        return true
    }

    private fun breakIntoPalindromes(text: CharArray, start: Int, end: Int): PalindromeGroup? {
        return null
    }
}