/*
 * generated by Xtext 2.9.0
 */
package sysml.idea.lang;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class DmlFileTypeFactory extends FileTypeFactory {

	@Override
	public void createFileTypes(@NotNull FileTypeConsumer consumer) {
		consumer.consume(DmlFileType.INSTANCE, AbstractDmlFileType.DEFAULT_EXTENSION);
	}

}
