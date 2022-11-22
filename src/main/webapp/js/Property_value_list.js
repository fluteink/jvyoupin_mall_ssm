new Vue().$mount('#tag')
var vue = new Vue({
    el: "#property_table",
    methods: {
        addppp(data) {
            var pid = window.location.href;
            pid = pid.substring(pid.indexOf('productproperty/') + 16, pid.length);
            var count = 0;
            for (let item of data) {
                axios.post("/jvyoupin/findProductProperty/" + pid + "/" + item.id).then(response => {
                    // console.log(response.data);
                    data[count].value2 = response.data;
                    count += 1;
                    console.log(data)
                });
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
            var pid = window.location.href;
            pid = pid.substring(pid.indexOf('productproperty/') + 16, pid.length);
            // console.log(id);
            axios.post("/jvyoupin/listproperty/" + pid).then(response => {
                // console.log(response.data);
                this.propertys = response.data;
                // console.log(this.propertys)
            });
            this.addppp(this.propertys);

        }
    },
    data() {
        return {
            propertys: [],

        }
    },
    created: function () {
        this.testResponseBody()
    }
});