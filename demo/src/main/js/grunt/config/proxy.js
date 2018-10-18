module.exports = {

    dev: {
        targets: [
            {
                context: [
                    '/items'
                ],
                target : 'http://localhost:5050'
            }
        ]
    },

    local: {
        targets: [
            {
                context: [
                    '/app'
                ],

                // host to forward the request
                target : 'http://localhost:5984'
            }
        ]
    }
};
