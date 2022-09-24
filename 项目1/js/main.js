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
    event.stopPropagation();
    event.preventDefault();
    window.location.href = event.target.getAttribute("data-href");
}
//用户名称检查
function checkUsername(event){
    let flag = false;
    if(event.target.value.length >= 3){
        //访问服务器获取到查重的结果
        getData('get','./data/userCheck.json').then(function (myData) {
            let str='';
            if(!myData.statusCode){//成功提示
                str = '恭喜，该用户名可用';
            }else{
                str = '抱歉，该用户名不可用';
            }
            let oTips = document.createElement('div');
            let oText = document.createTextNode(str);
            oTips.append(oText);
            event.target.parentElement.append(oTips);
        },function (errorInfo) {
            alert('访问失败');
        });
    }else{
        //alert('用户名长度至少3个字母');
    }
    return flag;
}

//获取所有商家数据
function getAllBusiness(){
    getData('get','./data/businessList.json').then(function (myData) {
        if(!(oUl = document.querySelector('.businessList'))) return false;
        let sStr = ``;
        for (let i = 0; i < myData.lists.length; i++) {
            sStr += `
                <li>
                    <a href="${myData.lists[i].url}">
                        <p>
                            <img src="${myData.lists[i].imgsrc}" />
                            <span>${myData.lists[i].tips}</span>
                        </p>
                        <h3>${myData.lists[i].title}</h3>
                        <div>${myData.lists[i].role.join(' | ')}</div>
                        <div>${myData.lists[i].description}</div>
                    </a>
                </li>
            `;
        }
        oUl.innerHTML = sStr;
    },function (errorInfo) {
        alert("失败之后的业务处理逻辑");
    });
}