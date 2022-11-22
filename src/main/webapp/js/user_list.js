new Vue().$mount('#tag')
var vue = new Vue({
    el: "#user_table",
    methods: {
        testResponseBody() {
            // console.log(id);
            axios.post("/jvyoupin/listuser").then(response => {
                // console.log(response.data);
                this.tableData = response.data;
                // this.addurl(this.tableData);
            });
        }
    },
    data() {
        return {
            tableData: []
        }
    },
    created: function () {
        this.testResponseBody()
    }
});