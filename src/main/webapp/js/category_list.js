new Vue().$mount('#tag')

function testResponseBody() {
    var a;
    axios.post("/jvyoupin/test/ResponseBody/json").then(response => {
        console.log(response.data);
        a = response.data;
    });
    return a;
}

var Main = {
    methods: {
        // deleteRow(index, rows) {
        //     rows.splice(index, 1);
        // },
        // testResponseBody(){
        //     axios.post("/jvyoupin/test/ResponseBody/json").then(response=>{
        //         console.log(response.data);
        //         return response.data();
        //     });
        // }
    },
    data() {
        return {
            tableData: [
                testResponseBody()
            ]
        }
    }
}
var Ctor = Vue.extend(Main)
new Ctor().$mount('#category_table')