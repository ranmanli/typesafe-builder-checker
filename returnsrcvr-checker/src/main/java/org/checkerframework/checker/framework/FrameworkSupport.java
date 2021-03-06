package org.checkerframework.checker.framework;

import org.checkerframework.framework.type.AnnotatedTypeMirror;

/** To add support for frameworks that need to have {@code @This} in certain generated methods */
public interface FrameworkSupport {
  /**
   * @param t the method to check
   * @return {@code true} if the method is generated by framework and returns {@code this}
   */
  boolean knownToReturnThis(AnnotatedTypeMirror.AnnotatedExecutableType t);
}
