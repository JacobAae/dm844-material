if (typeof jQuery == 'undefined') throw("jQuery Required");

(function ( $ ) {
	$.fn.rallyingcry = function() {
		var element = $("<div class='rallying-cry'>So Say We All!</div>");
		element.insertAfter(this);
		return this;
	};
}( jQuery ));