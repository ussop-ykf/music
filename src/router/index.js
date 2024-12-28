import Router from "vue-router";
import Vue from 'vue'
import SongList from "@/view/SongList.vue"
import SingerDetail from "@/view/SingerDetail.vue";
import SingerList from "@/view/SingerList.vue";

Vue.use(Router)
const routes = [{
    path: '/singerDetail',
    name: 'singerDetail',
    component: SingerDetail
}, {
    path: '/singerList', // 路由的 url 路径
    name: 'singers',       // 可选
    component: SingerList  // 路由的组件
}, {
    path: '/songList', name: 'songs', component: SongList
},]

// 创建路由对象
const router = new Router({
    mode: 'history', routes,
})
// 导出路由

export default router;

