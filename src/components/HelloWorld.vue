<template>
  <div class="hello">
    <!--    &lt;!&ndash;    插值表达式，调用js数据&ndash;&gt;
        <h1>{{ title }}</h1>
        <button @click="controlDivShowOrHide">{{ isShow ? '隐藏' : '显示' }}</button>
        <div v-show="isShow" class="green"></div>
        &lt;!&ndash;    <div v-if="isShow" class="green"></div>&ndash;&gt;
        &lt;!&ndash;    <div v-else>v-if 是 false</div>&ndash;&gt;
        <h3 v-for="(item, index) in msgList" :key="index"> {{ item }} </h3>-->
    <!--
        &lt;!&ndash;    v-bind 绑定属性、绑定样式&ndash;&gt;
        <img :src="imgPath" alt="">
        &lt;!&ndash;
        动态绑定 classA，取决于 isBind的值;
        ture: 绑定
        false: 不绑定
        &ndash;&gt;
        <div :class="{green:isBind}"></div>
        <button @click="controlStyleShowOrHide">{{ isShow ? '隐藏' : '显示' }}</button>
    -->


    <!--
        <li v-for="item in userList" :key="item.id">
          <div>{{ item.id }}</div>
          <div>{{ item.name }}</div>
          <div>{{ item.age }}</div>
        </li>
        -->


    <!--v-model-->
    <!--    输入内容: <input type="text" v-model="content"/>-->
    <!--    <br>-->
    <h2>{{ content }}</h2>

    <form>

      <div>
        <label for="name">姓名</label>
        <input type="text" id="name" v-model="name"/>
      </div>

      <div>
        <label for="age">年龄</label>
        <input type="text" id="age" v-model="age"/>
      </div>
      <div>
        <label for="salary">薪资</label>
        <input type="text" id="salary" v-model="salary"/>
      </div>
      <div>
        <label for="introduction">个人简介</label>
        <textarea v-model="introduction"></textarea>
      </div>
<!--      <div>
        <label for="gender">性别</label>
        <input type="radio" id="man" value="男" v-model="gender"/>
        <label for="man">男</label>
        <input type="radio" id="woman" value="女" v-model="gender"/>
        <label for="woman">女</label>
      </div>-->
      <h2>{{ name }}</h2>
      <h2>{{ age }}</h2>
      <h2>{{ salary }}</h2>
      <h2>{{ introduction }}</h2>

      <select v-model="selected">
        <option value="">选择一个网站</option>
        <option value="www.runoob.com">Runoob</option>
        <option value="www.Google.com">Google</option>
      </select>
    </form>
    <div id="output">
      <div>
        您选择的网站是：{{ selected }}
      </div>
    </div>

  </div>
</template>

<script>
import 'ajv'
import {getSinger} from "@/api/singer";
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data() {
    return {
      'selected': '',
      'introduction':'介绍',
      'name': '张三',
      'age': '18',
      'salary': '10000',
      'content': '简历',
      'classA': 'green',
      'title': '欢迎来到ytu',
      'isShow': false,
      'msgList': ['apple', 'banner', 'watermelon', 'lemon', 'skew'],
      'imgPath': require('../assets/logo.png'),
      'isBind': true,
      'userList': [
        {id: 1, name: '张三', age: 18},
        {id: 2, name: '李四', age: 19},
        {id: 3, name: '王五', age: 20},
        {id: 4, name: '赵六', age: 21},
      ]
    }
  },
// 生命周期函数
  mounted() {
    getSinger('api/querySinger', {id: 5}).then(res => {
      console.log(res)
    })
  },
//   自定义函数
  methods: {
    controlDivShowOrHide() {
      this.isShow = !this.isShow
    },
    controlStyleShowOrHide() {
      this.isBind = !this.isBind
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

.bkGreen {
  border: #2c3e50 solid 1px;
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
