// var data;
// vue= new Vue({
//     el: "#imgs",
//     methods: {
//         getData() {
//             var pid = window.location.href;
//             var p = new Array();
//             p = pid.split('/');
//             pid = p[6];
//             pid = parseInt(pid);
//             console.log(pid);
//             axios.post("/jvyoupin/findSingleImageByPid/" + pid).then(response => {
//                 this.data = response.data;
//                 console.log(this.data);
//             });
//
//         },
//     },
// });


var imgArr = [
    {
        id: 1,
        src: '/jvyoupin/img/productSingle/1.jpg'
    },
    {
        id: 2,
        src: '/jvyoupin/img/productSingle/2.jpg',
    },
    {
        id: 3,
        src: '/jvyoupin/img/productSingle/3.jpg',
    },
    {
        id: 4,
        src: '/jvyoupin/img/productSingle/4.jpg',
    },
    {
        id: 5,
        src: '/jvyoupin/img/productSingle/5.jpg',
    },
]
var currentId = 1

function imgClick(e) {
    currentId = e.target.id.split('').pop()
    return currentId
}
