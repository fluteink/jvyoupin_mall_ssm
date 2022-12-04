var item;
var vue = new Vue({
    el: "#item",
    methods: {
        getorder() {
            var uid = window.location.href;
            // uid = uid.substring(uid.indexOf('forebought/') + 10, uid.length);
            var p = new Array();
            p = uid.split('/');
            uid = p[5];
            uid = parseInt(uid);
            console.log(uid);
            axios.post("/jvyoupin/findorderItem/" + uid).then(response => {
                this.item = response.data[0];
                console.log(this.item);

            });


        }

    },
    data() {
        return {
            item: []

        }

    },
    created: function () {
        this.getorder()
    }
});