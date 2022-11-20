// sendData要传给后端的参数
// methods请求方式有POST与GET
// path请求地址
function ajax(sendData = {}, methods = 'GET', path = '') {
    var ajax = new XMLHttpRequest()
    ajax.onreadystatechange = function () {
        if (ajax.readyState == 4 && ajax.status == 200) {
            // 请求成功，请求后的数据在这里处理
            console.log(ajax.responseText)
        }
        if (ajax.status == 500) {
            // 请求失败
        }
        if (ajax.status === 404) {
            // 表示请求地址可能有错，没找到
        }
    }
    // ajax.open的第三个参数为true代表异步，为false代表同步
    // true：继续执行其他的脚本
    // false：执行到这里等待结果返回了再执行其他脚本
    ajax.open(methods, path, true)
    // 传送参数
    ajax.send(sendData)
}