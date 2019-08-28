package org.jetbrains.sbtidea.packaging.structure

import org.jetbrains.sbtidea.structure.ProjectNode

trait PackagedProjectNode extends ProjectNode {
  override type T = PackagedProjectNode
  def packagingOptions: ProjectPackagingOptions
}
