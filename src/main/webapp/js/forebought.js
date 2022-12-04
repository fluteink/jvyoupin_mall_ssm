var order;
var vue = new Vue({
    el: "#order",
    methods: {
        getorder() {
            var uid = window.location.href;
            // uid = uid.substring(uid.indexOf('forebought/') + 10, uid.length);
            var p = new Array();
            p = uid.split('/');
            console.log(p);
            uid = p[5];
            uid = parseInt(uid);
            console.log(uid);
            axios.post("/jvyoupin/findorderItem/" + uid).then(response => {
                this.order = response.data;
                console.log(this.order)
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