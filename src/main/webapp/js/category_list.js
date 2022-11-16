new Vue().$mount('#tag')

var vue = new Vue({
    el: "#category_table",
    methods: {
        testAjax() {
            axios.post(
                "/jvyoupin/test/ajax?id=1001",
                {username: "admin", password: "123456"}
            ).then(response => {
                console.log(response.data);
            });
        },
        deleteRow(index, rows) {
            rows.splice(index, 1);
        },
        testRequestBody() {
            axios.post(
                "/jvyoupin/test/RequestBody/json",
                {username: "admin", password: "123456", age: 23, gender: "男"}
            ).then(response => {
                console.log(response.data);
            });
        },
        testResponseBody() {
            axios.post("/jvyoupin/test/ResponseBody/json").then(response => {
                console.log(response.data);
                this.tableData = response.data;
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