var goods;
var vm = new Vue({
    el: "#app",
    methods: {
        getgoods() {
            var pid = window.location.href;
            var p = new Array();
            p = pid.split('/');
            console.log(p);
            pid = p[6];
            console.log("666")
            console.log(pid)
            pid = parseInt(pid);
            console.log(pid)
            // pid = pid.substring(pid.indexOf('goodsdetail/') + 12, pid.length);
            axios.post("/jvyoupin/findproduct/" + pid).then(response => {
                // this.goods = $.parseJSON(response.data);
                this.goods = response.data;
                console.log(this.goods);
            });
        }
    },
    data() {
        return {
            goods: []
        }
    },
    created: function () {
        this.getgoods()
    }

});