<template>
  <div id="app">
    <router-view/>
    <button @click="toSingListView">歌手列表</button>
    <button @click="toSongListView">歌曲列表</button>
  </div>
</template>

<script>

export default {
  name: 'App',
  components: {},
  methods: {
    toSingListView() {
      // 编程式路由
      this.$router.push({
        path: '/singerList'
      }).catch(() => {
      })
    }, toSongListView() {
      // 编程式路由
      this.$router.push({
        path: '/songList'
      }).catch(() => {
      })
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
