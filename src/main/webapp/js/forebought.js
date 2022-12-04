//订单
var order;
var vue = new Vue({
    el: "#order",
    methods: {
        getorder() {
            var uid = window.location.href;
            // uid = uid.substring(uid.indexOf('forebought/') + 10, uid.length);
            var p = new Array();
            p = uid.split('/');
            uid = p[5];
            uid = parseInt(uid);
            console.log(uid);
            axios.post("/jvyoupin/findOrderByUid/" + uid).then(response => {
                this.order = response.data[0];
                console.log(this.order);
            });

        }
    },
    data() {
        return {
            order: []
        }

    },
    created: function () {
        this.getorder()
    }
});

//商品
// var orderit;
// var goods;
// var vue = new Vue({
//     el: "#order",el:"goods",
//     methods: {
//         getorder() {
//             var uid = window.location.href;
//             // uid = uid.substring(uid.indexOf('forebought/') + 10, uid.length);
//             var p = new Array();
//             p = uid.split('/');
//             uid = p[5];
//             uid = parseInt(uid);
//             console.log(uid);
//             axios.post("/jvyoupin//" + uid).then(response => {
//                 axios.post("/jvyoupin/findproduct/" + response.data[0].pid).then(response => {
//                     this.goods= response.date;
//                     console.log(this.goods);
//                 });
//             });
//         }
//     },
//     data() {
//         return {
//             order: []
//         }
//
//     },
//     created: function () {
//         this.getorder()
//     }
// });