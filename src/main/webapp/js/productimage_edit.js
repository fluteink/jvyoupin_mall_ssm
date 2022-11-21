var vue = new Vue({
    el: "#single_table",
    methods: {
        addUrlsingle(data) {
            var url = "/jvyoupin/img/productSingle/";
            for (let item of data) {
                item.imgurl = url + item.id + ".jpg";
                console.log(item);
            }
        },
        notifydelete() {
            this.$notify({
                title: '成功',
                message: '你已经成功删除了一个图片',
                type: 'success'
            });
        },
        deleteSingleImage(index, rows) {
            // console.log(rows[index].id);
            axios.get("/jvyoupin/deleteImage/" + rows[index].id);
            rows.splice(index, 1);
            this.notifydelete();
        },

        findSingleImageByPid() {
            var pid = window.location.href;
            pid = pid.substring(pid.indexOf('image/') + 6, pid.length);
            // console.log(pid);
            axios.post("/jvyoupin/findSingleImageByPid/" + pid).then(response => {
                console.log(response.data);
                this.singleTableData = response.data;
                this.addUrlsingle(this.singleTableData);
                // this.addurl(this.tableData);
            });
        }
    },
    data() {
        return {
            singleTableData: []
        }
    },
    created: function () {
        this.findSingleImageByPid()
    }
});
var vue = new Vue({
    el: "#detail_table",
    methods: {
        addUrlDetail(data) {
            var url = "/jvyoupin/img/productDetail/";
            for (let item of data) {
                item.imgurl = url + item.id + ".jpg";
                console.log(item);
            }
        },
        notifydelete() {
            this.$notify({
                title: '成功',
                message: '你已经成功删除了一个图片',
                type: 'success'
            });
        },
        deleteDetailImage(index, rows) {
            // console.log(rows[index].id);
            axios.get("/jvyoupin/deleteImage/" + rows[index].id);
            rows.splice(index, 1);
            this.notifydelete();
        },
        findDetailImageByPid() {
            var pid = window.location.href;
            pid = pid.substring(pid.indexOf('image/') + 6, pid.length);
            axios.post("/jvyoupin/findDetailImageByPid/" + pid).then(response => {
                console.log(response.data);
                this.detailTableData = response.data;
                this.addUrlDetail(this.detailTableData);
                // this.addurl(this.tableData);
            });
        }
    },
    data() {
        return {
            detailTableData: []
        }
    },
    created: function () {
        this.findDetailImageByPid();
    }
});