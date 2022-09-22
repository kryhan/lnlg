/*整个站点的js脚本*/
//封装好的Promise,异步请求推荐使用该方法，只需要编写一次
/*使用方式
getData('get|post','url').then(function (数据) {
    成功之后的业务处理逻辑
},function (errorInfo) {
    失败之后的业务处理逻辑
});
*/

let getData = function(method,url){
    let promise = new Promise(function(resolve, reject){
        let xhr = new XMLHttpRequest();
        xhr.open(method,url,true);
        xhr.onreadystatechange = processHandler;
        xhr.send();

        function processHandler() {
            if(this.readyState != 4){
                return;//此处要注意，如果中间状态不做处理则会如何呢
            }
            if(this.readyState == 4 && this.status == 200){
                //假定数据全部都是json格式，在通用函数直接转换
                let jsonData = JSON.parse(this.responseText);
                resolve(jsonData);
            }else{
                reject(new Error(this.statusText));
            }
        }
    });
    return promise;
};

function gotoPage(event){
    window.location.href = event.target.getAttribute("data-href");
}