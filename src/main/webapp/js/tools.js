function move(obj, attr, target, speed, callback) {
    //关闭一个定时器
    clearInterval(obj.timer);
    //获取元素目前的位置
    var current = parseInt(getStyle(obj, attr));
    //判断速度的正负值
    /*如果从0向800移动，则speed为正
    * 如果从800向0移动，则speed为负*/
    if (current > target) {
        speed = -speed;
    }
    //开启一个定时器，用来执行动画效果
    //向执行动画的对象这添加一个timer属性，用来保存它自己的定时器
    //的标识
    obj.timer = setInterval(function () {
        var oldValue = parseInt(getStyle(obj, attr));
        //在旧值的基础上增加
        var newValue = oldValue + speed;
        //判断newValue是否大于800
        //从800向0移动
        /*向左移动时，需要判断newValue是否小于target
        * 向右移动时，需要判断newValue是否大于target*/
        if ((speed < 0 && newValue < target) || (speed > 0 && newValue > target)) {
            newValue = target;
        }
        //将新值设置给box1
        obj.style[attr] = newValue + "px";
        //当元素移动到800px时，使其停止执行动画
        if (newValue == target) {
            //达到目标，关闭定时器
            clearInterval(obj.timer);
            //动画执行完毕，调用回调函数
            callback && callback();
        }

    }, 30);
};

/*定义一个函数，用来获取指定元素的当前样式*/
function getStyle(obj, name) {
    if (window.getComputedStyle) {
        //正常浏览器的方式，具有getComputedStyle()方法
        return getComputedStyle(obj, null)[name];
    } else {
        //IE8的方式，没有getComputedStyle()方法
        return obj.currentStyle[name];
    }

};