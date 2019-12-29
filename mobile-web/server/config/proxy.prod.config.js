module.exports = {
  '/admin-api -> http://www.ldybalance.site:18083/': {
    changeOrigin: true,
    pathRewrite: {},
  },
  '/server/api -> https://preview.pro.ant.design/': {
    changeOrigin: true,
    pathRewrite: { '^/server': '' },
  },
};
