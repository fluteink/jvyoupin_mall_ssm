new Vue().$mount('#tag')

var vue = new Vue({
    el: "#category_table",
    methods: {
        addurl(data) {
            var url = "http://localhost:8080/jvyoupin/img/site/logo.jpg";
            for (let item of data) {
                item.imgurl = url;
                console.log(item);    //item指的的就是数组每一项的值。不是索引。
            }
        },
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
                // console.log(response.data);
                this.tableData = response.data;
                this.addurl(this.tableData);
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