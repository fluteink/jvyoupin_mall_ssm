new Vue().$mount('#tag')

function getid() {
    var elementById = document.getElementById("wdnmd");
    var id = window.location.href;
    id = id.substring(id.indexOf('edit/') + 5, id.length);
    console.log(id);
    elementById.value = id;
}

getid();