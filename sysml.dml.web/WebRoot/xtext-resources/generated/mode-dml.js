define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "Boolean|Double|FACTORING|FACTORING_CMAX|FACTORING_CMIN|FALSE|FIXED|FULL_DP|Frame|GREEDY|HEURISTIC|Int|Integer|LOCAL|LOCAL_AUTOMATIC|LOCAL_FILE|LOCAL_MEM|Matrix|NAIVE|NONE|Object|REMOTE_MR|RULEBASED|STATIC|Scalar|String|TRUE|aggregate|append|as|avg|boolean|cbind|cdf|check|colMaxs|colMeans|colMins|colSums|covtable|cummax|cummin|cumprod|cumsum|datapartitioner|double|else|externalFunction|for|frame|function|icdf|if|ifdef|implemented|in|int|integer|interQuartileMean|length|matrix|max|mean|median|min|mode|moment|ncol|nrow|object|opt|order|outer|par|parfor|pchisq|pexp|pf|pmax|pmin|pnorm|ppred|print|prod|pt|qchisq|qexp|qf|qnorm|qt|quantile|rand|rbind|removeEmpty|replace|resultmerge|return|rowIndexMax|rowIndexMin|rowMaxs|rowMeans|rowMins|rowSums|sample|scalar|seq|seqsum|setcwd|source|stop|string|taskpartitioner|tasksize|while";
		this.$rules = {
			"start": [
				{token: "lparen", regex: "[\\[({]"},
				{token: "rparen", regex: "[\\])}]"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/dml";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});
