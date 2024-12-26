<template>
  <div class="hello">
    <!--    插值表达式，调用js数据-->
    <h1>{{ title }}</h1>
    <button @click="controlDivShowOrHide">{{ isShow ? '隐藏' : '显示' }}</button>
    <div v-show="isShow" class="green"></div>
    <!--    <div v-if="isShow" class="green"></div>-->
    <!--    <div v-else>v-if 是 false</div>-->
    <h3 v-for="(item, index) in msgList" :key="index"> {{ item }} </h3>
    <ol>
      <li v-for="site in sites">
        {{ site.text }}
      </li>
    </ol>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data() {
    return {
      'title': '欢迎来到ytu',
      'isShow': false,
      'msgList': ['apple', 'banner', 'watermelon', 'lemon', 'skew'],
      'sites': [
        { text: 'Google' },
        { text: 'Runoob' },
        { text: 'Taobao' }
      ]
    }
  },
//   自定义函数
  methods: {
    controlDivShowOrHide() {
      this.isShow = !this.isShow
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.green {
  background-color: #42b983;
  width: 200px;
  height: 200px;

}

h3 {
  margin: 40px 0 0;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>
