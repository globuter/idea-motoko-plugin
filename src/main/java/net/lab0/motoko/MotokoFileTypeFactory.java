package net.lab0.motoko;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Note: This class is only used with the fileTypeFactory extension point
 * for versions of the IntelliJ Platform prior to v2019.2.
 */
@SuppressWarnings("deprecation")
public class MotokoFileTypeFactory extends FileTypeFactory {

  @Override
  public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
    fileTypeConsumer.consume(MotokoFileType.INSTANCE);
  }

}
