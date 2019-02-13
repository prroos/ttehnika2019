module.exports = {
    devServer: {
        port: 9000,
        proxy: {
            "/hello-world": {
                target: "http://localhost:8080",
                secure: false
            }
        }
    }
};