new Vue().$mount('#tag')
var vue = new Vue({
    el: "#property_table",
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
                message: '你已经成功删除了一个属性',
                type: 'success'
            });
        },
        deleteRow(index, rows) {
            // console.log(rows[index].id);
            axios.get("/jvyoupin/deleteProperty/" + rows[index].id)
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
            cid = cid.substring(cid.indexOf('erty/') + 5, cid.length);
            // console.log(id);
            axios.post("/jvyoupin/listproperty/" + cid).then(response => {
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