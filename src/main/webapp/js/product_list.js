new Vue().$mount('#tag')
var vue = new Vue({
    el: "#product_table",
    methods: {
        notifydelete() {
            this.$notify({
                title: '成功',
                message: '你已经成功删除了一个属性',
                type: 'success'
            });
        },
        deleteRow(index, rows) {
            // console.log(rows[index].id);
            axios.get("/jvyoupin/deleteProperty/" + rows[index].id);
            rows.splice(index, 1);
            this.notifydelete();
        },
        editRow(index, rows) {
            // console.log(rows[index].id);
            // window.open("/jvyoupin/categiry/edit/" + rows[index].id);
            window.location.assign("/jvyoupin/property/edit/" + rows[index].id);
        },
        property(index, rows) {
            // console.log(rows[index].id);
            // window.open("/jvyoupin/categiry/edit/" + rows[index].id);
            window.location.assign("/jvyoupin/property/" + rows[index].id);
        },

        testResponseBody() {
            var cid = window.location.href;
            cid = cid.substring(cid.indexOf('product/') + 8, cid.length);
            // console.log(cid);
            axios.post("/jvyoupin/listproduct/" + cid).then(response => {
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