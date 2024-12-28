const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    proxy: {
      '/api': {    // http://localhost:8080/api/querySingsr 转发到 http://localhost:8090/querySingsr
        target: 'http://localhost:8090', // 目标服务器地址
        changeOrigin: true,
        pathRewrite: { '^/api': '' }, // 重写路径，去掉/api前缀
      },
    },
  },
})
