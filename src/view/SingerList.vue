<script>
// import {getSinger} from "@/api/singer";

export default {
  name: 'SingerList',
  data() {
    return {
      singerList: [{id: 5, name: "邓紫棋"}]
    }
  },
 methods: {
    toSingerDetail(id) {
      // 路由传参方法一:query，显示参数
      // this.$router.push({
      //   path: '/singerDetail',
      //   query: {
      //     id: id
      //   }
      // }).catch(() => {
      // })

      // 路由传参方法二:params，隐藏参数
      this.$router.push({
        name: 'singerDetail',
        params: {
          id: id
        }
      }).catch(() => {
      })
    }

 }

}
</script>

<template>
  <div>
    <h1>歌手列表</h1>
    <ul>
      <li v-for="item in singerList" :key="item.id" v-on:click="toSingerDetail(item.id)">
        <h3>{{item.name}}</h3>
      </li>
    </ul>
  </div>
</template>

<style scoped>

</style>