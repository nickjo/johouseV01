/**
 * Varkala - Bootstrap 4 E-commerce Theme v. 1.1.0
 * Homepage: https://themes.getbootstrap.com/product/varkala-e-commerce-theme/
 * Copyright 2019, Bootstrapious - https://bootstrapious.com
 */

'use strict';

(function ($) {
    var $grid = $('.masonry-wrapper').masonry({
        itemSelector: '.item',
        columnWidth: '.item',
        percentPosition: true,
        transitionDuration: 300,
    });

    $grid.imagesLoaded().progress( function() {
        $grid.masonry();
    });
}(jQuery));