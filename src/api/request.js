import axios from "axios";

axios.defaults.baseURL = 'http://localhost:8080';
//axios.defaults.headers.common['Authorization'] = AUTH_TOKEN;
//axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded';
/*
* 导出语法
* get 请求的方法
* */
export const getApi = (url, params) => {
    return axios.get(url, {params: params}).then(res => res.data)
}

/*
* post 请求的语法
* */
export const postApi = (url, params) => {
    return axios.post(url, params).then(res => res.data)
}