package br.com.caelum.tubaina.parser.html;

import br.com.caelum.tubaina.chunk.ParagraphChunk;
import br.com.caelum.tubaina.parser.Tag;
import br.com.caelum.tubaina.util.HtmlSanitizer;

public class ParagraphTagTemplate implements Tag<ParagraphChunk> {

	private final HtmlSanitizer sanitizer;

	public ParagraphTagTemplate(HtmlSanitizer sanitizer) {
		this.sanitizer = sanitizer;
	}

	@Override
	public String parse(ParagraphChunk chunk) {
		String content = sanitizer.sanitize(chunk.getContent());
		return "<p>" + content + "</p>";
	}

}
