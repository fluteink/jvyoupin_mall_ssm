new Vue().$mount('#tag')
var vue = new Vue({
    el: "#product_table",
    methods: {
        findPicture(pid) {
            axios.post("/jvyoupin/findFirstProductImageId/" + pid).then(response => {
                // console.log(response.data);
                this.tableData1 = response.data;
                // console.log(this.tableData1)

            })
        },

        addUrl(data) {
            var url = "/jvyoupin/img/productSingle/";
            var count = 0;
            for (let item of data) {
                this.findPicture(item.id)
            }
            for (let item of data) {
                item.imgurl = url + this.tableData1[count] + ".jpg";
                count++;
                // console.log(item);
            }
        },
        notifydelete() {
            this.$notify({
                title: '成功',
                message: '你已经成功删除了一个商品',
                type: 'success'
            });
        },
        deleteRow(index, rows) {
            // console.log(rows[index].id);
            axios.get("/jvyoupin/deleteProduct/" + rows[index].id);
            rows.splice(index, 1);
            this.notifydelete();
        },
        editRow(index, rows) {
            // console.log(rows[index].id);
            // window.open("/jvyoupin/categiry/edit/" + rows[index].id);
            window.location.assign("/jvyoupin/editProduct/" + rows[index].id);
        },
        image(index, rows) {
            window.location.assign("/jvyoupin/image/" + rows[index].id);
        },
        productproperty(index, rows) {
            window.location.assign("/jvyoupin/productproperty/" + rows[index].id);
        },

        testResponseBody() {
            var cid = window.location.href;
            cid = cid.substring(cid.indexOf('product/') + 8, cid.length);
            // console.log(cid);
            axios.post("/jvyoupin/listproduct/" + cid).then(response => {
                // console.log(response.data);
                this.tableData = response.data;
                this.addUrl(this.tableData);
            });
        }
    },
    data() {
        return {
            tableData: [],
            tableData1: []

        }
    },
    created: function () {
        this.testResponseBody()
    }
});