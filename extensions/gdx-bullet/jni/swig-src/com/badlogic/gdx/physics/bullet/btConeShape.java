/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.utils.SharedLibraryLoader;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btConeShape extends btConvexInternalShape {
  private long swigCPtr;

  protected btConeShape(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btConeShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btConeShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btConeShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public btConeShape(float radius, float height) {
    this(gdxBulletJNI.new_btConeShape(radius, height), true);
  }

  public float getRadius() {
    return gdxBulletJNI.btConeShape_getRadius(swigCPtr, this);
  }

  public float getHeight() {
    return gdxBulletJNI.btConeShape_getHeight(swigCPtr, this);
  }

  public void setConeUpIndex(int upIndex) {
    gdxBulletJNI.btConeShape_setConeUpIndex(swigCPtr, this, upIndex);
  }

  public int getConeUpIndex() {
    return gdxBulletJNI.btConeShape_getConeUpIndex(swigCPtr, this);
  }

}