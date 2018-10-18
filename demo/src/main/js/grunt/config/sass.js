module.exports = {
    options: {
        sourceMap: true,
        includePaths: ['./node_modules']
    },
    dev: {
        files: {
            '<%= config.dir.dist %>/styles/main.css': '<%= config.dir.app %>/styles/main.scss'
        }
    },
    dist: {
        files: {
            '<%= config.dir.dist %>/styles/main.css': '<%= config.dir.app %>/styles/main.scss'
        }
    }
};