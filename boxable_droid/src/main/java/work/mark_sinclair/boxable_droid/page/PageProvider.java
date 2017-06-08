package work.mark_sinclair.boxable_droid.page;

import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;

public interface PageProvider<T extends PDPage> {

	T createPage();

	T nextPage();

	T previousPage();

	PDDocument getDocument();
}
