package com.rtncenteredtext

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.RTNCenteredTextManagerInterface
import com.facebook.react.viewmanagers.RTNCenteredTextManagerDelegate

@ReactModule(name = CenteredTextManager.NAME)
class CenteredTextManager(context: ReactApplicationContext) : SimpleViewManager<CenteredText>(), RTNCenteredTextManagerInterface<CenteredText> {
  private val delegate: RTNCenteredTextManagerDelegate<CenteredText, CenteredTextManager> = RTNCenteredTextManagerDelegate(this)

  override fun getDelegate(): ViewManagerDelegate<CenteredText> = delegate

  override fun getName(): String = NAME

  override fun createViewInstance(context: ThemedReactContext): CenteredText = CenteredText(context)

  @ReactProp(name = "text")
  override fun setText(view: CenteredText, text: String?) {
    view.text = text
  }

  @ReactProp(name = "hasReadBackground")
  override fun setHasRedBackground(view: CenteredText, value: Boolean) {
    // setHasRedBackground
  }

  @ReactProp(name = "hasBlueText")
  override fun setHasBlueText(view: CenteredText, value: Boolean) {
    // setHasBlueText
  }

  companion object {
    const val NAME = "RTNCenteredText"
  }
}