new Vue().$mount('#tag')

var vue = new Vue({
    el: "#category_table",
    methods: {
        addurl(data) {
            var url = "/jvyoupin/img/category/";
            for (let item of data) {
                item.imgurl = url + item.id + ".jpg";
                console.log(item);
            }
        },
        notifydelete() {
            this.$notify({
                title: '成功',
                message: '你已经成功删除了一个种类',
                type: 'success'
            });
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
            // console.log(rows[index].id);
            axios.get("/jvyoupin/deleteCategory/" + rows[index].id)
            rows.splice(index, 1);
            this.notifydelete();
        },
        editRow(index, rows) {
            // console.log(rows[index].id);
            window.open("/jvyoupin/categiry/edit/" + rows[index].id)
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