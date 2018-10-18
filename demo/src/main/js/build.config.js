module.exports.config = {

    // load-grunt-configs path
    src: 'grunt/config/*.js',

    app: {
        name   : 'app-ui',
        version: '1.0.0'
    },

    dir: {
        app    : 'src',
        dist   : 'dist',
        temp   : '.tmp',
        reports: 'reports'
    },

    files: {

        i18n: {
            de: [
                'node_modules/angular-i18n/angular-locale_de.js'
            ],
            en: [
                'node_modules/angular-i18n/angular-locale_en.js'
            ]
        },

        app: {

            jsAll: [
                'src/app/**/*.js'
            ],

            js: [
                'src/app/**/*.js',
                '!src/app/**/*.spec.js',
                '!src/app/**/*.mocks.js'
            ],

            spec: [
                'src/app/**/*.spec.js',
                'src/app/**/*.mocks.js'
            ],

            translations: [
                'src/i18n/**/*.json'
            ],

            tpls: [
                'src/app/**/*.tpl.html'
            ],

            index: [
                'src/index.tpl.html'
            ],

            styles: {
                all : 'src/styles/**/*.scss'
            }
        },

        vendor: {
            js: [
                'node_modules/angular/angular.js',
                'node_modules/angular-ui-router/release/angular-ui-router.js',
                'node_modules/angular-ui-utils/ui-utils.js',
		        'node_modules/angular-bootstrap/ui-bootstrap-tpls.js'
            ],

            spec: [
                'node_modules/angular-mocks/angular-mocks.js'
            ],

            styles: [
            ],

            font: [
                'node_modules/font-awesome/fonts/*'
            ],

            glyphfont: [
                'node_modules/bootstrap-sass/assets/fonts/bootstrap/*'
    	    ]
        }

    }
};
