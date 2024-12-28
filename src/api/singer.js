import {postApi, getApi} from "@/api/request"


export const getSinger = (url, data) => {
    return getApi(url, data)
}

export const postSinger = (url, data) => {
    return postApi(url, data)
}