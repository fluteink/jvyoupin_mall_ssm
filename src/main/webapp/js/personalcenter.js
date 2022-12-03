var user;
var id = window.location.href;
id = id.substring(id.indexOf('Personalcenter/') + 15, id.length);
var ele = document.getElementById("changepassword");
ele.href = '/jvyoupin/changepassword/' + id;
var vue = new Vue({
    el: "#app",
    methods: {
        getuser() {
            var pid = window.location.href;
            pid = pid.substring(pid.indexOf('Personalcenter/') + 15, pid.length);
            axios.post("/jvyoupin/finduserbyid/" + pid).then(response => {
                // console.log(response.data);
                // this.user = $.parseJSON(response.data);
                this.user = response.data;
                console.log(this.user)
            });
        }
    },
    data() {
        return {
            user: []
        }

    },
    created: function () {
        this.getuser()
    }
});